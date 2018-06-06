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
//      System.out.println(area.getName() + " borders enemy? " + area.bordersEnemy());
//      if (area.bordersEnemy() &&
//              ((area.hasAlliedToSelfArmy() && area.getAlliedArmy().getDivisions() < 20) ||
//              !area.hasAlliedToSelfArmy()))
//        eligibleAreas.add(area);
      if (area.bordersEnemy())
      {
        if (!area.hasAlliedToSelfArmy())
        {
          eligibleAreas.add(area);
        }
        else if (area.getAlliedArmy().getDivisions() < 20)
        {
          eligibleAreas.add(area);
        }
      }
    }
    
    if (eligibleAreas.isEmpty())
    {
      return;
    }
    
//    System.out.println(toString() + " eligibleAreas: " + eligibleAreas);
    
    for (int i = 0; i < numArmies; i++)
    {
      int rand = (int)(Math.random() * eligibleAreas.size());
      Area area = eligibleAreas.get(rand);
      if (area.hasAlliedToSelfArmy())
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
    Double ranNum = Math.random() * 100;
    System.out.println("ranNum: " + ranNum);
    System.out.println("attacked: " + attacked.getName());
    
    if (attacked.getArmies().isEmpty() && ranNum < 80)
    {
      army.moveTo(attacked);
    }
    else if (attacked.hasAlliedToPlayerArmy())
    {
      int attDivs = army.getDivisions(), defDivs = attacked.getAlliedArmy().getDivisions();
      double attToDefRatio = attDivs / defDivs;
      
      if (attToDefRatio >= 5.0)
      {
        army.moveTo(attacked);
      }
      if (attToDefRatio >= 3.0 && ranNum < 80)
      {
        army.moveTo(attacked);
      }
      else if (attToDefRatio >= 2.0 && ranNum < 55) // 2 : 1 ratio
      {
        army.moveTo(attacked);
      }
      else if (attToDefRatio >= 3.0/2.0 && ranNum < 30)
      {
        army.moveTo(attacked);
      }
      else if (attToDefRatio >= 3.0/4.0 && ranNum < 10)
      {
        army.moveTo(attacked);
      }
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
    for (Area a : getAreas())
    {
      if (a.bordersEnemy() && a.hasAlliedToSelfArmy())
      {
        decideToAttack(a);
      }
    }
  }
}
