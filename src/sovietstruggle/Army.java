/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovietstruggle;

import java.util.Arrays;

/**
 *
 * @author chiggie
 */
public class Army
{

  private String name;
  private Area area;
  private Faction controller;
  private int divisions;

  public Army(String name, Area area, Faction controller)
  {
    this.name = name;
    this.area = area;
    this.controller = controller;
    divisions = 1;
  }

  // Should handle what happens if there is an enemy army in the area (battle)
  public void moveTo(Area newArea)
  {
    Area oldArea = area;
    directMoveTo(newArea);

    if (newArea.hasEnemyToThisArmy(this))
    {
      Army defender = area.getAlliedArmy();
      System.out.println("defender: " + defender);
      handleBattle(defender, oldArea);  
    }
    else
    {
      area.setController(controller);
    }
  }

  private void handleBattle(Army defender, Area oldArea)
  {
    // To be implemented
    int origDivisions = divisions, origDefenderDivisions = defender.divisions;

    for (int rounds = 0; rounds < 3; rounds++)
    {
      System.out.println("--- Round " + rounds + " ---");
      handleBattleRound(defender);

      if (defender.divisions < 0.7 * origDefenderDivisions)
      {
        defender.retreat(origDefenderDivisions);
        area.setController(controller);
        System.out.println("Attacker wins!");
        return;
      }
      else if (divisions < 0.7 * origDivisions)
      {
        System.out.println("Defender wins!");
        retreat(origDivisions);
        return;
      }
    }
    
    directMoveTo(oldArea);
  }

  private void handleBattleRound(Army defender)
  {
    // "roll dice" represented with random numbers in array
    int[] allyRolls = new int[divisions >= 3 ? 3 : divisions];
    int[] defenderRolls = new int[defender.divisions >= 2 ? 2 : 1];

    // Simulate rolling of dice
    for (int i = 0; i < allyRolls.length; i++)
    {
      allyRolls[i] = (int) (Math.random() * 6) + 1;
      if (i < defenderRolls.length)
      {
        defenderRolls[i] = (int) (Math.random() * 6) + 1;
      }
    }

    // Calculate and act on division losses
    for (int dice = 0; dice < defenderRolls.length; dice++)
    {
      System.out.println("allyRolls: " + Arrays.toString(allyRolls));
      System.out.println("defenderRolls: " + Arrays.toString(defenderRolls));
      int allyMaxPos = TextFormat.findMaxPos(allyRolls);
      int allyMax = allyRolls[allyMaxPos];
      allyRolls[allyMaxPos] = -1; // Represent removed die with -1

      int defenderMaxPos = TextFormat.findMaxPos(defenderRolls);
      int defenderMax = defenderRolls[defenderMaxPos];
      defenderRolls[defenderMaxPos] = -1;

      if (allyMax > defenderMax)
      {
        System.out.println("Defender lost a division.");
        defender.divisions--;
      }
      else if (defenderMax >= allyMax)
      {
        System.out.println("Attacker lost a division.");
        divisions--;
      }
    }
  }

  private void directMoveTo(Area newArea)
  {
    area.removeArmy(this);
    newArea.addArmy(this);
    area = newArea;
  }

  /**
   * Destroys the army, removing it from its area and controlling faction.
   */
  public void destroy()
  {
    divisions = 0;
    area.removeArmy(this);
    area = null;
    controller.removeArmy(this);
    controller = null;
  }

  /**
   * Handles what happens when an army is forced to retreat. It either moves to
   * a random allied border area with around 50% of its original divisions or it
   * is destroyed entirely.
   */
  private void retreat(int origDivisions)
  {
    Area areaToRetreat = area.getRandAlliedArea(this);
    if (areaToRetreat == null) // defender's area is surrounded by enemies
    {
      destroy();
    }
    else
    {
      directMoveTo(areaToRetreat);
      divisions = origDivisions / 2;
      if (origDivisions / 2 == 0)
      {
        destroy();
      }
      else if (areaToRetreat.getArmies().size() == 2)
      {
        System.out.println("Combining armies in " + area.getName());
        Army first = areaToRetreat.getArmies().get(0);
        Army second = areaToRetreat.getArmies().get(1);
        Army combined = controller.makeArmy(name, area);
        
        combined.divisions = first.divisions + second.divisions;
        System.out.println("Num armies in " + area.getName() + ": " + areaToRetreat.getArmies().size());
      }
    }
  }

  public void expand(int numDivs)
  {
    divisions += numDivs;
  }

  public int getManpower()
  {
    return divisions * 5000;
  }

  public Faction getController()
  {
    return controller;
  }

  public String getName()
  {
    return name;
  }

  public Area getArea()
  {
    return area;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setDivisions(int divisions)
  {
    this.divisions = divisions;
  }

  public int getDivisions()
  {
    return divisions;
  }

  @Override
  public String toString()
  {
    return TextFormat.convMaxLen(area.getName(), 20) + TextFormat.convMaxLen(name, 20)
            + TextFormat.normNumFormat(getManpower());
  }
}
