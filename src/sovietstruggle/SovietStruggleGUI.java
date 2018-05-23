/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovietstruggle;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

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
    PoliticalPanel = new javax.swing.JPanel();
    polPowLabel = new javax.swing.JLabel();
    polPowDisplay = new javax.swing.JLabel();
    leninImage = new javax.swing.JLabel();
    leninText = new javax.swing.JLabel();
    armyScroll = new javax.swing.JScrollPane();
    armyList = new javax.swing.JList<>();
    armyListTitlePanel = new javax.swing.JLabel();
    expandButton = new javax.swing.JButton();
    trainButton = new javax.swing.JButton();
    moveButton = new javax.swing.JButton();
    AreaPanel = new javax.swing.JPanel();
    areaTitle = new javax.swing.JLabel();
    areaScroll = new javax.swing.JScrollPane();
    areaList = new javax.swing.JList<>();
    updateAreaButton = new javax.swing.JButton();
    FactionsPanel = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Soviet Struggle");
    setPreferredSize(new java.awt.Dimension(650, 600));
    setResizable(false);

    jTabbedPane1.setMaximumSize(new java.awt.Dimension(1000, 1000));
    jTabbedPane1.setPreferredSize(new java.awt.Dimension(600, 525));
    jTabbedPane1.setRequestFocusEnabled(false);

    PoliticalPanel.setBackground(BG_COLOR);
    PoliticalPanel.setPreferredSize(new java.awt.Dimension(600, 400));

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

    armyList.setModel(armyModel);
    armyScroll.setViewportView(armyList);

    armyListTitlePanel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
    armyListTitlePanel.setText("The Red Army");

    expandButton.setText("Expand Size");

    trainButton.setText("Train");

    moveButton.setText("Move");

    javax.swing.GroupLayout PoliticalPanelLayout = new javax.swing.GroupLayout(PoliticalPanel);
    PoliticalPanel.setLayout(PoliticalPanelLayout);
    PoliticalPanelLayout.setHorizontalGroup(
      PoliticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(PoliticalPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(PoliticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(armyListTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(PoliticalPanelLayout.createSequentialGroup()
            .addGroup(PoliticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(PoliticalPanelLayout.createSequentialGroup()
                .addComponent(polPowLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(polPowDisplay))
              .addGroup(PoliticalPanelLayout.createSequentialGroup()
                .addComponent(armyScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PoliticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(expandButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(trainButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(moveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(PoliticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(PoliticalPanelLayout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addComponent(leninImage))
          .addComponent(leninText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(450, 450, 450))
    );
    PoliticalPanelLayout.setVerticalGroup(
      PoliticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(PoliticalPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(PoliticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PoliticalPanelLayout.createSequentialGroup()
            .addGroup(PoliticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(polPowLabel)
              .addComponent(polPowDisplay))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(armyListTitlePanel))
          .addComponent(leninImage, javax.swing.GroupLayout.Alignment.TRAILING))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(PoliticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(leninText, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(armyScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(PoliticalPanelLayout.createSequentialGroup()
            .addComponent(expandButton)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(trainButton)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(moveButton)))
        .addContainerGap(254, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Political", PoliticalPanel);

    areaTitle.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
    areaTitle.setText("Area List");

    areaList.setModel(areaModel);
    areaList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    areaList.setVisibleRowCount(4);
    areaList.setCellRenderer(new AreaListRenderer(areas));
    areaScroll.setViewportView(areaList);

    updateAreaButton.setText("Update Areas");
    updateAreaButton.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        updateAreaButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout AreaPanelLayout = new javax.swing.GroupLayout(AreaPanel);
    AreaPanel.setLayout(AreaPanelLayout);
    AreaPanelLayout.setHorizontalGroup(
      AreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(AreaPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(AreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(areaTitle)
          .addGroup(AreaPanelLayout.createSequentialGroup()
            .addComponent(areaScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(updateAreaButton)))
        .addContainerGap(345, Short.MAX_VALUE))
    );
    AreaPanelLayout.setVerticalGroup(
      AreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(AreaPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(areaTitle)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(AreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(areaScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(updateAreaButton))
        .addContainerGap(372, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Areas", AreaPanel);

    javax.swing.GroupLayout FactionsPanelLayout = new javax.swing.GroupLayout(FactionsPanel);
    FactionsPanel.setLayout(FactionsPanelLayout);
    FactionsPanelLayout.setHorizontalGroup(
      FactionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 740, Short.MAX_VALUE)
    );
    FactionsPanelLayout.setVerticalGroup(
      FactionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 486, Short.MAX_VALUE)
    );

    jTabbedPane1.addTab("Factions", FactionsPanel);

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

  private void updateAreaButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_updateAreaButtonActionPerformed
  {//GEN-HEADEREND:event_updateAreaButtonActionPerformed
    updateAreaList();
  }//GEN-LAST:event_updateAreaButtonActionPerformed

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
				// Modified slightly to allow for initial dialog open
				SovietStruggleGUI game = new SovietStruggleGUI();
        game.setVisible(true);
				
				String intro = TextFormat.readFile(TEXT_PATH + "intro.txt");
				
				game.showPlainDialog(intro,
								"Dictatorship of the Proletariat!");
      }
    });
  }

  private void initGame()
  {
		// Create areas
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
    
		// Create factions
    playerFaction = new Faction("Bolsheviks");

		// Create armies
		playerFaction.makeArmy("Latvian Riflemen", latvia);
		
		armyModel = new DefaultListModel<>();
		for (Army a : playerFaction.getArmies())
		{
			armyModel.addElement(a.toString());
		}
  }
	
	private void updateAreaList()
	{
		areaModel.clear();
    for (Area a : areas)
    {
      areaModel.addElement(a.toString());
    }
	}
	
	private void showPlainDialog(String text, String title)
	{
		JTextArea msg = new JTextArea(text);
		msg.setLineWrap(true);
		msg.setWrapStyleWord(true);
		msg.setEditable(false);
		msg.setBorder(BorderFactory.createEmptyBorder());
		msg.setRows(10);
		msg.setColumns(30);
		msg.setBackground(BG_COLOR);
		
		JScrollPane scrollPane = new JScrollPane(msg);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		scrollPane.setBackground(BG_COLOR);
		
		JOptionPane.showMessageDialog(this, scrollPane, title,
						JOptionPane.PLAIN_MESSAGE);
	}

  // Custom variables declaration
  private static final String IMG_PATH = "src/sovietstruggle/img/";
	private static final String TEXT_PATH = "src/sovietstruggle/text/";
	private static final Color BG_COLOR = new Color(214, 217, 223);
	
  // Use parallel arrays structure with areas and areaModel
  private ArrayList<Area> areas;
	// Assigned as areaList's model in NetBeans Design section
  private DefaultListModel<String> areaModel;
	// Use parallel arrays structure with playerFaction.armies and armyModel
	private DefaultListModel<String> armyModel;
  
  private Faction playerFaction;
  private ArrayList<Faction> enemyFactions;

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel AreaPanel;
  private javax.swing.JPanel FactionsPanel;
  private javax.swing.JPanel PoliticalPanel;
  private javax.swing.JList<String> areaList;
  private javax.swing.JScrollPane areaScroll;
  private javax.swing.JLabel areaTitle;
  private javax.swing.JList<String> armyList;
  private javax.swing.JLabel armyListTitlePanel;
  private javax.swing.JScrollPane armyScroll;
  private javax.swing.JButton expandButton;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JLabel leninImage;
  private javax.swing.JLabel leninText;
  private javax.swing.JButton moveButton;
  private javax.swing.JLabel polPowDisplay;
  private javax.swing.JLabel polPowLabel;
  private javax.swing.JButton trainButton;
  private javax.swing.JButton updateAreaButton;
  // End of variables declaration//GEN-END:variables
}
