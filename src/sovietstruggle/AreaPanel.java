/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovietstruggle;

/**
 *
 * @author chiggie
 */
public class AreaPanel extends javax.swing.JPanel
{

  /**
   * Creates new form areaPanel
   */
  public AreaPanel()
  {
    initComponents();
    area = null;
  }
  
  public AreaPanel(Area area)
  {
    this.area = area;
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    areaButton = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();

    areaButton.setBackground(java.awt.Color.green);
    areaButton.setText(area == null ? "Placeholder Area" : area.getName());
    areaButton.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        areaButtonActionPerformed(evt);
      }
    });

    jLabel1.setText("This is a Test label, anyone see it?");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(areaButton)
          .addGroup(layout.createSequentialGroup()
            .addGap(168, 168, 168)
            .addComponent(jLabel1)))
        .addContainerGap(168, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(areaButton)
        .addGap(84, 84, 84)
        .addComponent(jLabel1)
        .addContainerGap(173, Short.MAX_VALUE))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void areaButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_areaButtonActionPerformed
  {//GEN-HEADEREND:event_areaButtonActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_areaButtonActionPerformed

  private Area area;

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton areaButton;
  private javax.swing.JLabel jLabel1;
  // End of variables declaration//GEN-END:variables
}
