/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovietstruggle;

import java.awt.event.ActionEvent;
import javax.swing.JButton;

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
    game.showMainMapMenu(this);
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

  public boolean hasAlliedArmy()
  {
    return area.hasAlliedArmy();
  }

  private Area area;
  private SovietStruggleGUI game;
  private int xLocation, yLocation, width, height;
}
