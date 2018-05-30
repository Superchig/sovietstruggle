/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovietstruggle;

import java.awt.Color;

/**
 *
 * @author 19changc
 */
public class EnemyFaction extends Faction
{
  public EnemyFaction(String name, Color color)
  {
    super(name, color);
  }
  
  // How the AI acts on its turn
  @Override
  public void endTurn()
  {
    // Expand armies
    
  }
}
