/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovietstruggle;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.net.URL;

/**
 *
 * @author chiggie
 */
public class Area
{

	private static final int IMAGE_HEIGHT = 86;
	private String name;
	private ArrayList<Army> armies;
	private Icon image;
	private Faction playerFaction;

	public Area(String name, String imgPath, Faction playerFaction)
	{
		this.name = name;
		this.playerFaction = playerFaction;
		armies = new ArrayList<>();
		image = scaleImage(imgPath);
	}

	public void addArmy(Army a)
	{
		armies.add(a);
	}

	public void removeArmy(Army a)
	{
		armies.remove(a);
	}

	public String getName()
	{
		return name;
	}

	public Icon getImage()
	{
		return image;
	}

	private Icon scaleImage(String imgPath)
	{
		try
		{
			BufferedImage img;
			if (imgPath.indexOf("http") == 0)
			{
				img = ImageIO.read(new URL(imgPath));
			} else
			{
				img = ImageIO.read(new File(imgPath));
			}
			return new ImageIcon(img.getScaledInstance(-1, IMAGE_HEIGHT, Image.SCALE_SMOOTH));
		} catch (IOException e)
		{
			e.printStackTrace();
			System.out.println("Error: Failed to scale image at " + imgPath);
			return new ImageIcon(imgPath);
		}
	}

	@Override
	public String toString()
	{
		String result = name + TextFormat.spaces(13 - name.length());

		boolean hasAllied = false;
		for (Army army : armies)
		{
			if (army.getController() == playerFaction)
			{
				hasAllied = true;
				break;
			}
		}

		if (hasAllied)
		{
			result += "Allied Army"
							+ TextFormat.spaces("No Allied Army  ".length() - "Allied Army".length());
		} else
		{
			result += "No Allied Army  ";
		}

		if (!hasAllied && armies.size() == 1)
		{
			result += "1 Enemy Army";
		} else if (!hasAllied && !armies.isEmpty())
		{
			result += armies.size() + " Enemy Armies";
		}
		else
		{
			result += "No Enemy Armies";
		}

		return result;
	}
}
