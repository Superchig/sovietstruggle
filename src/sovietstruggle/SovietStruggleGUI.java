/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovietstruggle;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author chiggie
 */
public class SovietStruggleGUI extends javax.swing.JFrame
{

  /**
   * Creates new form SovietStruggleGUI
   */
  public SovietStruggleGUI()
  {
    // Added to create game
    initGame();

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

    jTabbedPane1 = new javax.swing.JTabbedPane();
    jPanel3 = new javax.swing.JPanel();
    polPowLabel = new javax.swing.JLabel();
    polPowDisplay = new javax.swing.JLabel();
    leninImage = new javax.swing.JLabel();
    leninText = new javax.swing.JLabel();
    armyScroll = new javax.swing.JScrollPane();
    armyList = new javax.swing.JList<>();
    jLabel1 = new javax.swing.JLabel();
    expandButton = new javax.swing.JButton();
    trainButton = new javax.swing.JButton();
    moveButton = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    areaList = new javax.swing.JList<>();
    jButton1 = new javax.swing.JButton();
    jPanel4 = new javax.swing.JPanel();
    jPanel5 = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Soviet Struggle");
    setPreferredSize(new java.awt.Dimension(650, 600));
    setResizable(false);

    jTabbedPane1.setMaximumSize(new java.awt.Dimension(1000, 1000));
    jTabbedPane1.setPreferredSize(new java.awt.Dimension(600, 525));
    jTabbedPane1.setRequestFocusEnabled(false);

    jPanel3.setPreferredSize(new java.awt.Dimension(600, 400));

    polPowLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
    polPowLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sovietstruggle/img/hammer_and_sickle.png"))); // NOI18N
    polPowLabel.setText("Political Power:");

    polPowDisplay.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
    polPowDisplay.setText("jLabel1");

    leninImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sovietstruggle/img/lenin_small.png"))); // NOI18N
    leninImage.setToolTipText("One man, one vote. He is the man, he gets the vote.");

    leninText.setLabelFor(leninImage);
    leninText.setText("<html>\n<p style=\"text-align:center\">\nComrade Lenin Is Always Watching!\n</p>\n</html>");
    leninText.setFocusable(false);

    armyList.setModel(new javax.swing.AbstractListModel<String>()
    {
      String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
      public int getSize() { return strings.length; }
      public String getElementAt(int i) { return strings[i]; }
    });
    armyScroll.setViewportView(armyList);

    jLabel1.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
    jLabel1.setText("The Red Army");

    expandButton.setText("Expand Size");

    trainButton.setText("Train");

    moveButton.setText("Move");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(polPowLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(polPowDisplay))
              .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(armyScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(expandButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(trainButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(moveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addComponent(leninImage))
          .addComponent(leninText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(450, 450, 450))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(polPowLabel)
              .addComponent(polPowDisplay))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1))
          .addComponent(leninImage, javax.swing.GroupLayout.Alignment.TRAILING))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(leninText, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(armyScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(expandButton)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(trainButton)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(moveButton)))
        .addContainerGap(134, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Political", jPanel3);

    jLabel2.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
    jLabel2.setText("Area List");

    areaList.setModel(areaModel);
    areaList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    areaList.setVisibleRowCount(4);
    areaList.setCellRenderer(new AreaListRenderer(areas));
    jScrollPane1.setViewportView(areaList);

    jButton1.setText("Initialize");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel2)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton1)))
        .addContainerGap(357, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton1))
        .addContainerGap(372, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Areas", jPanel2);

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 740, Short.MAX_VALUE)
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 486, Short.MAX_VALUE)
    );

    jTabbedPane1.addTab("Factions", jPanel4);

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 740, Short.MAX_VALUE)
    );
    jPanel5Layout.setVerticalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 486, Short.MAX_VALUE)
    );

    jTabbedPane1.addTab("tab4", jPanel5);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, Short.MAX_VALUE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  /**
   * @param args the command line arguments
   */
  public static void main(String args[])
  {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try
    {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
      {
        if ("Nimbus".equals(info.getName()))
        {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex)
    {
      java.util.logging.Logger.getLogger(SovietStruggleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(SovietStruggleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(SovietStruggleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(SovietStruggleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new SovietStruggleGUI().setVisible(true);
      }
    });
  }

  private void initGame()
  {
    areas = new ArrayList<>();
    areas.add(new Area("Moscow", IMG_PATH + "lenin.jpg"));
    areas.add(new Area("West Ukraine", IMG_PATH + "lenin_small.png"));
    
    Area latvia = new Area("Latvia", "https://cdn.britannica.com/700x450/53/6253-004-E40A3608.jpg");
    areas.add(latvia);

    areaModel = new DefaultListModel<>();
    for (Area a : areas)
    {
      areaModel.addElement(a.toString());
    }
    
    playerFaction = new Faction("Bolsheviks");
    
    Army latRifle = new Army("Latvian Riflemen", latvia, playerFaction);
    playerFaction.addArmy(latRifle);
    latvia.addArmy(latRifle);
  }

  // Custom variables declaration
  private final String IMG_PATH = "src/sovietstruggle/img/";

  // Use parallel arrays structure with areas and areaModel
  private ArrayList<Area> areas;
  private DefaultListModel<String> areaModel;
  
  private Faction playerFaction;
  private ArrayList<Faction> enemyFactions;

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JList<String> areaList;
  private javax.swing.JList<String> armyList;
  private javax.swing.JScrollPane armyScroll;
  private javax.swing.JButton expandButton;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JLabel leninImage;
  private javax.swing.JLabel leninText;
  private javax.swing.JButton moveButton;
  private javax.swing.JLabel polPowDisplay;
  private javax.swing.JLabel polPowLabel;
  private javax.swing.JButton trainButton;
  // End of variables declaration//GEN-END:variables
}
