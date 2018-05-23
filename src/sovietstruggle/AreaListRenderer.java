/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovietstruggle;

import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author chiggie
 */
public class AreaListRenderer extends DefaultListCellRenderer
{
  // Equal to SovietStruggleGUI's areas

  private ArrayList<Area> areas;
  private Font font = new Font("Monospaced", Font.PLAIN, 16);

  public AreaListRenderer(ArrayList<Area> areas)
  {
    super();

    this.areas = areas;
  }

  @Override
  public Component getListCellRendererComponent(
          JList list, Object value, int index,
          boolean isSelected, boolean cellHasFocus)
  {

    JLabel label = (JLabel) super.getListCellRendererComponent(
            list, value, index, isSelected, cellHasFocus);
    label.setIcon(areas.get(index).getImage());
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.BOTTOM);
    label.setFont(font);
    return label;
  }
}
