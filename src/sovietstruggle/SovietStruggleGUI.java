/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovietstruggle;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
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

    armyListMenu = new javax.swing.JPopupMenu();
    renameArmy = new javax.swing.JMenuItem();
    mainMapMenu = new javax.swing.JPopupMenu();
    moveArmy = new javax.swing.JMenuItem();
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
    moveButton = new javax.swing.JButton();
    endTurnButton = new javax.swing.JButton();
    turnLabel = new javax.swing.JLabel();
    calendarDateLabel = new javax.swing.JLabel();
    combineButton = new javax.swing.JButton();
    mapPane = new javax.swing.JLayeredPane();
    setupAreaGUI();
    mainMap = new sovietstruggle.mapPanel();
    AreaPanel = new javax.swing.JPanel();
    areaTitle = new javax.swing.JLabel();
    areaScroll = new javax.swing.JScrollPane();
    areaList = new javax.swing.JList<>();
    updateAreaButton = new javax.swing.JButton();
    decisionPanel = new javax.swing.JPanel();
    decisionArea = new javax.swing.JPanel();
    decisionTitle = new javax.swing.JLabel();

    renameArmy.setText("Rename");
    renameArmy.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        renameArmyActionPerformed(evt);
      }
    });
    armyListMenu.add(renameArmy);

    moveArmy.setText("Move Army");
    mainMapMenu.add(moveArmy);

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Soviet Struggle");
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
    polPowDisplay.setText("" + playerFaction.getPoliticalPower());

    leninImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sovietstruggle/img/lenin_small.png"))); // NOI18N
    leninImage.setToolTipText("One man, one vote. He is the man, he gets the vote.");

    leninText.setLabelFor(leninImage);
    leninText.setText("<html>\n<p style=\"text-align:center\">\nComrade Lenin Is Always Watching!\n</p>\n</html>");
    leninText.setFocusable(false);

    armyList.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    armyList.setModel(armyModel);
    armyList.addMouseListener(new java.awt.event.MouseAdapter()
    {
      public void mousePressed(java.awt.event.MouseEvent evt)
      {
        armyListMousePressed(evt);
      }
      public void mouseReleased(java.awt.event.MouseEvent evt)
      {
        armyListMouseReleased(evt);
      }
    });
    armyScroll.setViewportView(armyList);

    armyListTitlePanel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
    armyListTitlePanel.setText("The Red Army");

    expandButton.setText("Expand Size");
    expandButton.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        expandButtonActionPerformed(evt);
      }
    });

    moveButton.setText("Move");
    moveButton.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        moveButtonActionPerformed(evt);
      }
    });

    endTurnButton.setText("End Turn");
    endTurnButton.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        endTurnButtonActionPerformed(evt);
      }
    });

    turnLabel.setText("Turn 1");

    calendarDateLabel.setText(calendarDate.getDisplayName(Calendar.MONTH,
      Calendar.SHORT, Locale.ENGLISH) + " "
    + calendarDate.get(Calendar.YEAR));

  combineButton.setText("Combine");
  combineButton.addActionListener(new java.awt.event.ActionListener()
  {
    public void actionPerformed(java.awt.event.ActionEvent evt)
    {
      combineButtonActionPerformed(evt);
    }
  });

  mapPane.setBackground(new java.awt.Color(54, 137, 220));

  mapPane.setLayer(mainMap, javax.swing.JLayeredPane.DEFAULT_LAYER);

  javax.swing.GroupLayout mapPaneLayout = new javax.swing.GroupLayout(mapPane);
  mapPane.setLayout(mapPaneLayout);
  mapPaneLayout.setHorizontalGroup(
    mapPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(mapPaneLayout.createSequentialGroup()
      .addComponent(mainMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(0, 98, Short.MAX_VALUE))
  );
  mapPaneLayout.setVerticalGroup(
    mapPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(mapPaneLayout.createSequentialGroup()
      .addComponent(mainMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(0, 1368, Short.MAX_VALUE))
  );

  javax.swing.GroupLayout PoliticalPanelLayout = new javax.swing.GroupLayout(PoliticalPanel);
  PoliticalPanel.setLayout(PoliticalPanelLayout);
  PoliticalPanelLayout.setHorizontalGroup(
    PoliticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(PoliticalPanelLayout.createSequentialGroup()
      .addContainerGap()
      .addGroup(PoliticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(PoliticalPanelLayout.createSequentialGroup()
          .addComponent(mapPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(PoliticalPanelLayout.createSequentialGroup()
          .addGroup(PoliticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PoliticalPanelLayout.createSequentialGroup()
              .addComponent(armyScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addGroup(PoliticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(expandButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(moveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(combineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PoliticalPanelLayout.createSequentialGroup()
              .addGroup(PoliticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PoliticalPanelLayout.createSequentialGroup()
                  .addComponent(polPowLabel)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(polPowDisplay)
                  .addGap(0, 0, Short.MAX_VALUE))
                .addComponent(armyListTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addGroup(PoliticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(endTurnButton)
                .addComponent(calendarDateLabel)
                .addComponent(turnLabel))))
          .addGroup(PoliticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PoliticalPanelLayout.createSequentialGroup()
              .addGap(47, 47, 47)
              .addComponent(leninImage))
            .addComponent(leninText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGap(432, 432, 432))))
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
        .addComponent(leninImage, javax.swing.GroupLayout.Alignment.TRAILING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PoliticalPanelLayout.createSequentialGroup()
          .addComponent(turnLabel)
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addComponent(calendarDateLabel)
          .addGap(3, 3, 3)
          .addComponent(endTurnButton)))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(PoliticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(armyScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(leninText, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(PoliticalPanelLayout.createSequentialGroup()
          .addComponent(expandButton)
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addComponent(moveButton)
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addComponent(combineButton)))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(mapPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
  );

  jTabbedPane1.addTab("Political", PoliticalPanel);

  areaTitle.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
  areaTitle.setText("Area List");

  areaList.setModel(areaModel);
  areaList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
  areaList.setVisibleRowCount(7);
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
          .addComponent(areaScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addComponent(updateAreaButton)))
      .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
      .addContainerGap(714, Short.MAX_VALUE))
  );

  jTabbedPane1.addTab("Areas", AreaPanel);

  decisionArea.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
  {
    public void mouseMoved(java.awt.event.MouseEvent evt)
    {
      decisionAreaMouseMoved(evt);
    }
  });
  decisionArea.addMouseListener(new java.awt.event.MouseAdapter()
  {
    public void mouseClicked(java.awt.event.MouseEvent evt)
    {
      decisionAreaMouseClicked(evt);
    }
    public void mouseExited(java.awt.event.MouseEvent evt)
    {
      decisionAreaMouseExited(evt);
    }
    public void mouseEntered(java.awt.event.MouseEvent evt)
    {
      decisionAreaMouseEntered(evt);
    }
  });

  javax.swing.GroupLayout decisionAreaLayout = new javax.swing.GroupLayout(decisionArea);
  decisionArea.setLayout(decisionAreaLayout);
  decisionAreaLayout.setHorizontalGroup(
    decisionAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGap(0, 376, Short.MAX_VALUE)
  );
  decisionAreaLayout.setVerticalGroup(
    decisionAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGap(0, 105, Short.MAX_VALUE)
  );

  updateDecisionArea();

  decisionTitle.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
  decisionTitle.setText("Decisions");

  javax.swing.GroupLayout decisionPanelLayout = new javax.swing.GroupLayout(decisionPanel);
  decisionPanel.setLayout(decisionPanelLayout);
  decisionPanelLayout.setHorizontalGroup(
    decisionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(decisionPanelLayout.createSequentialGroup()
      .addContainerGap()
      .addGroup(decisionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(decisionTitle)
        .addComponent(decisionArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addContainerGap(550, Short.MAX_VALUE))
  );
  decisionPanelLayout.setVerticalGroup(
    decisionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(decisionPanelLayout.createSequentialGroup()
      .addContainerGap()
      .addComponent(decisionTitle)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(decisionArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addContainerGap(724, Short.MAX_VALUE))
  );

  jTabbedPane1.addTab("Decisions", decisionPanel);

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(layout.createSequentialGroup()
      .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE))
  );
  layout.setVerticalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(layout.createSequentialGroup()
      .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(0, 10, Short.MAX_VALUE))
  );

  pack();
  }// </editor-fold>//GEN-END:initComponents

  private void updateAreaButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_updateAreaButtonActionPerformed
  {//GEN-HEADEREND:event_updateAreaButtonActionPerformed
    updateAreaList();
  }//GEN-LAST:event_updateAreaButtonActionPerformed

  private void moveButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_moveButtonActionPerformed
  {//GEN-HEADEREND:event_moveButtonActionPerformed
    if (!armyList.isSelectionEmpty())
    {
      showMoveArmyDialog(armyList.getSelectedValue());
    }
  }//GEN-LAST:event_moveButtonActionPerformed

  private void expandButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_expandButtonActionPerformed
  {//GEN-HEADEREND:event_expandButtonActionPerformed
    String msg = "Divisions to add (1 Division = " + DIVISION_COST + " Political Power):";

    String choice = (String) JOptionPane.showInputDialog(this, msg,
            "Add Divisions", JOptionPane.PLAIN_MESSAGE);
    if (choice == null)
    {
      return;
    }

    int divs = Integer.parseInt(choice);
    if (divs * DIVISION_COST > playerFaction.getPoliticalPower())
    {
      String rejectedMsg = "That requires " + divs * DIVISION_COST + " political power, which is more than you have.";
      JOptionPane.showMessageDialog(this, rejectedMsg, "Could Not Expand Army",
              JOptionPane.PLAIN_MESSAGE);
      return;
    }

    armyList.getSelectedValue().expand(divs);
    playerFaction.incPoliticalPower(-(divs * DIVISION_COST));
    updateDisplays();
  }//GEN-LAST:event_expandButtonActionPerformed

  private void armyListMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_armyListMousePressed
  {//GEN-HEADEREND:event_armyListMousePressed
    if (evt.isPopupTrigger() && armyList.getSelectedValue() != null)
    {
      showDropDownArmyMenu(evt);
    }
  }//GEN-LAST:event_armyListMousePressed

  private void armyListMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_armyListMouseReleased
  {//GEN-HEADEREND:event_armyListMouseReleased
    if (evt.isPopupTrigger() && armyList.getSelectedValue() != null)
    {
      showDropDownArmyMenu(evt);
    }
  }//GEN-LAST:event_armyListMouseReleased

  private void renameArmyActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_renameArmyActionPerformed
  {//GEN-HEADEREND:event_renameArmyActionPerformed
    showRenameArmyMenu(armyList.getSelectedValue());
  }//GEN-LAST:event_renameArmyActionPerformed

  private void decisionAreaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_decisionAreaMouseClicked
  {//GEN-HEADEREND:event_decisionAreaMouseClicked
    updateDisplays();
  }//GEN-LAST:event_decisionAreaMouseClicked

  private void decisionAreaMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_decisionAreaMouseEntered
  {//GEN-HEADEREND:event_decisionAreaMouseEntered
    updateDisplays();
  }//GEN-LAST:event_decisionAreaMouseEntered

  private void endTurnButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_endTurnButtonActionPerformed
  {//GEN-HEADEREND:event_endTurnButtonActionPerformed
    playerFaction.endTurn();

    System.out.println("enemyFactions: " + enemyFactions);
    for (Faction fac : enemyFactions)
    {
      fac.endTurn();
    }

    turnNumber++;
    turnLabel.setText("Turn " + turnNumber);

    calendarDate.add(Calendar.MONTH, 1);
    calendarDateLabel.setText(calendarDate.getDisplayName(Calendar.MONTH,
            Calendar.SHORT, Locale.ENGLISH) + " "
            + calendarDate.get(Calendar.YEAR));

    updateDisplays();
  }//GEN-LAST:event_endTurnButtonActionPerformed

  private void decisionAreaMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_decisionAreaMouseExited
  {//GEN-HEADEREND:event_decisionAreaMouseExited
    updateDisplays();
  }//GEN-LAST:event_decisionAreaMouseExited

  private void decisionAreaMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_decisionAreaMouseMoved
  {//GEN-HEADEREND:event_decisionAreaMouseMoved
    updateDisplays();
  }//GEN-LAST:event_decisionAreaMouseMoved

  private void combineButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_combineButtonActionPerformed
  {//GEN-HEADEREND:event_combineButtonActionPerformed
    List<Army> selected = armyList.getSelectedValuesList();
    if (selected.isEmpty())
    {
      return;
    }

    Army first = selected.get(0);
    for (Army army : selected)
    {
      if (army.getArea() != first.getArea())
      {
        return;
      }
    }

    Army result = playerFaction.makeArmy(first.getName(), first.getArea());
    result.expand(-1); // Remove first initial division

    for (Army army : selected)
    {
      result.expand(army.getDivisions());
      playerFaction.removeArmy(army);
      army.getArea().removeArmy(army);
    }

    updateDisplays();
  }//GEN-LAST:event_combineButtonActionPerformed

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
    // Initialize variables keeping track of turn and date
    turnNumber = 1;
    calendarDate = new GregorianCalendar();
    calendarDate.set(1917, 10, 8);

    // Create factions
    playerFaction = new Faction("Bolsheviks", Color.GREEN);

    enemyFactions = new ArrayList<>();

    Faction kolchak = new EnemyFaction("Kolchak", Color.GRAY);
    enemyFactions.add(kolchak);
    Faction denikin = new EnemyFaction("Denikin", new Color(153, 51, 102));
    enemyFactions.add(denikin);

    // Create areas
    areas = new ArrayList<>();

    Area moscow = createArea("Moscow", IMG_PATH + "lenin.jpg", playerFaction);
    Area latvia = createArea("Latvia",
            "https://cdn.britannica.com/700x450/53/6253-004-E40A3608.jpg",
            playerFaction);
    Area westOblasts = createArea("Western Oblasts", IMG_PATH + "lenin.jpg", playerFaction);
    Area crimea = createArea("Expanded Crimea", IMG_PATH + "lenin.jpg", playerFaction);
    Area cenRussia = createArea("Central Russia", IMG_PATH + "lenin.jpg", playerFaction);
    Area petro = createArea("Petrograd", IMG_PATH + "lenin.jpg", playerFaction);

    Area westSiber = createArea("West Siberia", IMG_PATH + "lenin.jpg", kolchak);
    Area eastSiber = createArea("East Siberia", IMG_PATH + "lenin.jpg", kolchak);
    Area southSiber = createArea("South Siberia", IMG_PATH + "lenin.jpg", kolchak);

    Area upperNorCau = createArea("Upper North Caucasus", IMG_PATH + "lenin.jpg", denikin);
    Area lowerNorCau = createArea("Lower North Caucasus", IMG_PATH + "lenin.jpg", denikin);

    // Add areas to each other as border areas
    
    // Areas controlled by player
    moscow.addBorderArea(new Area[]
    {
      westOblasts, crimea, cenRussia, petro
    });

    westOblasts.addBorderArea(new Area[]
    {
      latvia, crimea, moscow, petro
    });

    crimea.addBorderArea(new Area[]
    {
      upperNorCau, lowerNorCau, westOblasts, moscow, cenRussia
    });

    cenRussia.addBorderArea(new Area[]
    {
      crimea, moscow, petro, westSiber, southSiber
    });

    latvia.addBorderArea(westOblasts);

    petro.addBorderArea(new Area[]
    {
      westSiber, cenRussia, moscow, westOblasts
    });
    
    // Areas controlled by Denikin

    upperNorCau.addBorderArea(new Area[]
    {
      crimea, lowerNorCau
    });
    
    lowerNorCau.addBorderArea(new Area[]
    {
      upperNorCau, crimea
    });

    
    // Areas controlled by Kolchak
    
    westSiber.addBorderArea(new Area[]
    {
      eastSiber, southSiber, cenRussia, petro
    });

    eastSiber.addBorderArea(new Area[]
    {
      southSiber, westSiber
    });

    southSiber.addBorderArea(new Area[]
    {
      westSiber, eastSiber, cenRussia
    });

    areaModel = new DefaultListModel<>();
    updateAreaList();

    // Create armies
    playerFaction.makeArmy("Latvian Riflemen", latvia);

    armyModel = new DefaultListModel<>();
    for (Army a : playerFaction.getArmies())
    {
      armyModel.addElement(a);
    }

    Army denRemn = denikin.makeArmy("Denikin's Remnants", upperNorCau);
    denRemn.setDivisions(10);

    // Create decisions
    Decision dissolve = new Decision("Dissolve the Russian Constituent Assembly!",
            "The soviets represent the true will of the people! This bourgeois \"democracy\" cannot be allowed to continue.",
            playerFaction,
            (player) ->
    {
      player.incPoliticalPower(100);
    });
    playerFaction.addDecision(dissolve);

    playerFaction.addDecision("Expand the Cheka", "The security of a liberated proletariat must be ensured!",
            (player) ->
    {
      player.makeArmy("Militant Cheka", moscow);
    });

    playerFaction.addDecision("Emergency Deployment", "To defend the republic, we must call available men to our two fronts!",
            new Action()
    {
      @Override
      public void act(Faction player)
      {
        player.makeArmy("Denikin Destroyers", crimea).setDivisions(10);
        player.makeArmy("Southeastern Army", cenRussia).setDivisions(5);
        player.makeArmy("Northeastern Army", petro).setDivisions(5);
      }
    });
  }

  public Faction getPlayerFaction()
  {
    return playerFaction;
  }

  public JLayeredPane getMapPane()
  {
    return mapPane;
  }

  private void updateDisplays()
  {
    updateAreaList();
    updateAreaButtons();
    updateArmyList();
    updateDecisionArea();
    updatePolPowDisplay();
  }

  private void updateAreaList()
  {
    areaModel.clear();
    for (Area a : areas)
    {
      areaModel.addElement(a);
    }
  }

  private void updateAreaButtons()
  {
    for (Component comp : mapPane.getComponents())
    {
      if (comp instanceof AreaButton)
      {
        AreaButton button = (AreaButton) comp;
        button.updateIcon();
      }
    }
  }

  private void updateArmyList()
  {
    armyModel.clear();
    for (Army a : playerFaction.getArmies())
    {
      armyModel.addElement(a);
    }
  }

  public void updateDecisionArea()
  {
    decisionArea.setLayout(new BoxLayout(decisionArea, BoxLayout.PAGE_AXIS));
    decisionArea.removeAll();
    for (Decision dec : playerFaction.getDecisions())
    {
      if (!dec.isTaken())
      {
        decisionArea.add(new DecisionPanel(dec, this));
      }
    }

    decisionArea.revalidate();
    decisionArea.repaint();
  }

  private void updatePolPowDisplay()
  {
    polPowDisplay.setText("" + playerFaction.getPoliticalPower());
  }

  private void setupAreaGUI()
  {
    mapPane.setLayout(null);

    // Player
    setupAreaButton(getArea("Moscow"), 232, 263);
    setupAreaButton(getArea("Western Oblasts"), 215, 211);
    setupAreaButton(getArea("Latvia"), 198, 189);
    setupAreaButton(getArea("Expanded Crimea"), 210, 317);
    setupAreaButton(getArea("Central Russia"), 253, 325);
    setupAreaButton(getArea("Petrograd"), 250, 226);

    // Kolchak
    setupAreaButton(getArea("West Siberia"), 381, 290);
    setupAreaButton(getArea("East Siberia"), 591, 228);
    setupAreaButton(getArea("South Siberia"), 375, 378);

    // Denikin
    setupAreaButton(getArea("Upper North Caucasus"), 179, 363);
    setupAreaButton(getArea("Lower North Caucasus"), 191, 380);

    updateAreaButtons();
  }

  private Area createArea(String name, String imgPath, Faction fac)
  {
    Area area = new Area(name, imgPath, fac, this);
    areas.add(area);
    fac.addArea(area);
    return area;
  }

  private AreaButton setupAreaButton(Area area, int x, int y)
  {
    AreaButton button = new AreaButton(area, this, x, y);
    mapPane.add(button, 10);
    button.updateBounds();

    return button;
  }

  public void showMoveArmyDialog(Army army)
  {
    Area choice = (Area) JOptionPane.showInputDialog(this,
            "Where do you want to move this army to?",
            "Move Army", JOptionPane.PLAIN_MESSAGE, null,
            army.getArea().getBorderAreas().toArray(), "Choose!");

    if (choice == null)
    {
      return;
    }

    army.moveTo(choice);
    updateDisplays();
  }

  public void showMainMapMenu(AreaButton aButton)
  {
    mainMapMenu.show(mapPane, aButton.getX() + 20, aButton.getY());
  }

  public void showPlainDialog(String text, String title)
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

  private void showDropDownArmyMenu(MouseEvent evt)
  {
    armyListMenu.show(this, evt.getX() + 20, evt.getY() + 155);
  }

  private void showRenameArmyMenu(Army army)
  {
    String choice = (String) JOptionPane.showInputDialog(null, "Rename Army", "Rename:", JOptionPane.PLAIN_MESSAGE);
    if (choice == null)
    {
      return;
    }

    army.setName(choice);
  }

  private Area getArea(String name)
  {
    for (Area a : areas)
    {
      if (name.equals(a.getName()))
      {
        return a;
      }
    }

    return null;
  }

  // Custom variables declaration
  public static final String IMG_PATH = "src/sovietstruggle/img/";
  private static final String TEXT_PATH = "src/sovietstruggle/text/";
  private static final Color BG_COLOR = new Color(214, 217, 223);
  private static final int DIVISION_COST = 5;

  private int turnNumber;
  private Calendar calendarDate;

  // Use parallel arrays structure with areas and areaModel
  private ArrayList<Area> areas;
  // Assigned as areaList's model in NetBeans Design section
  private DefaultListModel<Area> areaModel;
  // Use parallel arrays structure with playerFaction.armies and armyModel
  private DefaultListModel<Army> armyModel;

  private Faction playerFaction;
  private ArrayList<Faction> enemyFactions;

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel AreaPanel;
  private javax.swing.JPanel PoliticalPanel;
  private javax.swing.JList<Area> areaList;
  private javax.swing.JScrollPane areaScroll;
  private javax.swing.JLabel areaTitle;
  private javax.swing.JList<Army> armyList;
  private javax.swing.JPopupMenu armyListMenu;
  private javax.swing.JLabel armyListTitlePanel;
  private javax.swing.JScrollPane armyScroll;
  private javax.swing.JLabel calendarDateLabel;
  private javax.swing.JButton combineButton;
  private javax.swing.JPanel decisionArea;
  private javax.swing.JPanel decisionPanel;
  private javax.swing.JLabel decisionTitle;
  private javax.swing.JButton endTurnButton;
  private javax.swing.JButton expandButton;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JLabel leninImage;
  private javax.swing.JLabel leninText;
  private sovietstruggle.mapPanel mainMap;
  private javax.swing.JPopupMenu mainMapMenu;
  private javax.swing.JLayeredPane mapPane;
  private javax.swing.JMenuItem moveArmy;
  private javax.swing.JButton moveButton;
  private javax.swing.JLabel polPowDisplay;
  private javax.swing.JLabel polPowLabel;
  private javax.swing.JMenuItem renameArmy;
  private javax.swing.JLabel turnLabel;
  private javax.swing.JButton updateAreaButton;
  // End of variables declaration//GEN-END:variables
}
