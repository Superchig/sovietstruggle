/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovietstruggle;

import java.awt.Color;
import java.util.ArrayList;

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
  
  // Creates or epands armies in random, bordered areas
  public void distributeArmies(int numArmies)
  {
    ArrayList<Area> eligibleAreas = new ArrayList<>();
    
    for (Area area : getAreas())
    {
      if (area.bordersEnemy() &&
              !(area.hasAlliedToPlayerArmy() && area.getAlliedArmy().getDivisions() >= 20))
        eligibleAreas.add(area);
    }
    
    for (int i = 0; i < numArmies; i++)
    {
      int rand = (int)(Math.random() * eligibleAreas.size());
      Area area = eligibleAreas.get(rand);
      if (area.hasAlliedToPlayerArmy())
      {
        area.getAlliedArmy().expand(1);
      }
      else
      {
        makeArmy(area.getName() + " Army Group", area);
      }
    }
  }
  
  // Precondition: Area has allied army
  private void decideToAttack(Area fromArea)
  {
    Army army = fromArea.getAlliedArmy();
    Area attacked = fromArea.getRandEnemyBorderArea();
    
    if (!attacked.getArmies().isEmpty())
    {
      army.moveTo(attacked);
    }
     // This army is allied to the enemy, so it's more of an enemy army
    else if (attacked.hasAlliedToPlayerArmy())
    {
      
    }
  }
  
  // How the AI acts on its turn
  @Override
  public void endTurn()
  {
    // Create new armies
    int numAreas = getAreas().size();
    if (numAreas >= 1 && numAreas <= 3)
    {
      distributeArmies(numAreas);
    }
    else
    {
      distributeArmies((numAreas + 1) / 2 + 1);
    }
    
    // Decide whether or not to attack and where to attack
    ArrayList<Area> armedAreas = new ArrayList<>();
    for (Area a : getAreas())
    {
      if (a.bordersEnemy() && a.hasAlliedToPlayerArmy())
      {
        decideToAttack(a);
      }
    }
  }
}
