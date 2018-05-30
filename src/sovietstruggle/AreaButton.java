/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovietstruggle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author chiggie
 */
public class AreaButton extends JButton
{

  public AreaButton()
  {
    super();
  }

  public AreaButton(Area area, SovietStruggleGUI game, int xLocation, int yLocation)
  {
    super(TextFormat.scaleImage(SovietStruggleGUI.IMG_PATH + "map_marker.png", 20));
    this.area = area;
    this.game = game;
    this.xLocation = xLocation;
    this.yLocation = yLocation;
    width = 20;
    height = 20;

    setBackground(java.awt.Color.green);
    setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        buttonActionPerformed(evt);
      }
    });
  }

  public void buttonActionPerformed(ActionEvent evt)
  {
    showPopupMenu();
  }

  public void updateBounds()
  {
    setBounds(xLocation, yLocation, width, height);
  }

  @Override
  public int getX()
  {
    return xLocation;
  }

  @Override
  public int getY()
  {
    return yLocation;
  }

  @Override
  public int getWidth()
  {
    return width;
  }

  @Override
  public int getHeight()
  {
    return height;
  }

  public void showPopupMenu()
  {
    if (area.hasAlliedArmy())
    {
      showWhenArmyMenu();
    }
  }

  public void updateIcon()
  {
    setBackground(area.getController().getColor());
    
    if (area.hasAlliedArmy())
    {
      setIcon(TextFormat.scaleImage(SovietStruggleGUI.IMG_PATH + "budenovka.jpg", 20));
      height = 20;
      width = 20;
    }
    else
    {
      setIcon(TextFormat.scaleImage(SovietStruggleGUI.IMG_PATH + "map_marker.png", 20));
      height = 20;
      width = 20;
    }
  }

  private void showWhenArmyMenu()
  {
    JPopupMenu menu = new JPopupMenu();
    JMenuItem move = new JMenuItem("Move");

    move.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent ae)
      {
        showMoveArmyDialog();
      }
    });

    menu.add(move);
    menu.show(game.getMapPane(), xLocation + 20, yLocation);
  }

  private void showMoveArmyDialog()
  {
    List<Army> armies = area.getArmies();
    for (int i = 0; i < armies.size(); i++)
    {
      Army possibleArmy = armies.get(i);
      
      if (possibleArmy.getController() == game.getPlayerFaction())
      {
        game.showMoveArmyDialog(possibleArmy);
        return;
      }
    }
  }

  private Area area;
  private SovietStruggleGUI game;
  private int xLocation, yLocation, width, height;
}
