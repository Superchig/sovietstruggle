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
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author chiggie
 */
public class TextFormat
{

  private static NumberFormat fmt = NumberFormat.getNumberInstance();

  public static String spaces(int numSpaces)
  {
    String result = "";

    for (int i = 0; i < numSpaces; i++)
    {
      result += " ";
    }

    return result;
  }

  public static String normNumFormat(int num)
  {
    return fmt.format(num);
  }

  public static String readFile(String path)
  {
    try
    {
//      byte[] encoded = Files.readAllBytes(Paths.get(path));
//      return new String(encoded, Charset.defaultCharset())
//              .replace("\n\n", "rEaN").replace("\n", " ")
//              .replace("rEaN", "\n\n");
      URL url = JPanel.class.getResource(path);
      String result = new Scanner(url.openStream(), "UTF-8").useDelimiter("\\A").next();
      return result.replace("\n\n", "rEaN").replace("\n", " ")
              .replace("rEaN", "\n\n");
    } catch (Exception e)
    {
      e.printStackTrace();
      return "Error In Reading File";
    }
  }

  public static Icon scaleImage(String imgPath, int imgHeight)
  {
    try
    {
      BufferedImage img;
      if (imgPath.indexOf("http") == 0)
      {
        img = ImageIO.read(new URL(imgPath));
      }
      else
      {
//        img = ImageIO.read(new File(imgPath));
        img = ImageIO.read(JPanel.class.getResource(imgPath));
      }
      return new ImageIcon(img.getScaledInstance(-1, imgHeight, Image.SCALE_SMOOTH));
    } catch (IOException e)
    {
      e.printStackTrace();
      System.out.println("Error: Failed to scale image at " + imgPath);
      return new ImageIcon(imgPath);
    }
  }

  public static int findMaxPos(int[] nums)
  {
    int maxPos = 0;
    for (int i = 1; i < nums.length; i++)
    {
      if (nums[maxPos] < nums[i])
      {
        maxPos = i;
      }
    }
    return maxPos;
  }

  /**
   * Returns a possibly truncated version of a string. If the length of str is
   * greater than len, then this method returns a substring plus an ellipsis
   * such that its length is equal to len. Otherwise, this method just returns
   * str plus a sufficient number of spaces to reach a length of len.
   *
   * @param str string to be returned or truncated and edited
   * @param len maximum length of string
   * @return a possibly truncated version of str
   */
  public static String convMaxLen(String str, int len)
  {
    int strLen = str.length();
    if (strLen >= len)
    {
      return str.substring(0, len - 4) + "... ";
    }
    else
    {
      return str + spaces(len - strLen);
    }
  }
}
