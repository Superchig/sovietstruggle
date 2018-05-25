/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovietstruggle;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author chiggie
 */
public class DecisionListRenderer extends DefaultListCellRenderer
{
  // Equal to SovietStruggleGUI's areas

  private Font font = new Font("Monospaced", Font.PLAIN, 12);

  @Override
  public Component getListCellRendererComponent(
          JList list, Object value, int index,
          boolean isSelected, boolean cellHasFocus)
  {
    Decision dec = (Decision) value;
    DecisionPanel panel = new DecisionPanel(dec);
    if (isSelected)
    {
      panel.setBackground(Color.yellow);
    }
    
    return panel;
  }
}
