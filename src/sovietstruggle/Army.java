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
  private SovietStruggleGUI game;
  private int divisions;

  public Army(String name, Area area, Faction controller)
  {
    this.name = name;
    this.area = area;
    this.controller = controller;
    game = area.getGame();
    divisions = 1;
  }

  // Should handle what happens if there is an enemy army in the area (battle)
  public void moveTo(Area newArea)
  {
    game.logPrintln(name + " moves to " + newArea.getName());
    Area oldArea = area;
    directMoveTo(newArea);

    if (newArea.hasEnemyToThisArmy(this))
    {
      Army defender = area.getAlliedArmy();
      game.logPrintln(oldArea.getName() + "'s " + name + " attacks "
              + newArea.getName() + "'s " + defender.getName());
      handleBattle(defender, oldArea);
    }
    else
    {
      conquer(area);
    }
  }

  private void handleBattle(Army defender, Area oldArea)
  {
    game.logPrintln("Attacked: " + defender.getName());
    
    int origDivisions = divisions, origDefenderDivisions = defender.divisions;

    double ranNum = Math.random();
    int numRounds;
    if (ranNum < 0.33)
    {
      numRounds = 1;
    }
    else if (ranNum < 0.66)
    {
      numRounds = 3;
    }
    else
    {
      numRounds = 100;
    }

    game.logPrintln("numRounds: " + numRounds);
    for (int rounds = 0; rounds < numRounds; rounds++)
    {
//      game.logPrintln("--- Round " + rounds + " ---");
      handleBattleRound(defender);

      if (defender.divisions < 0.7 * origDefenderDivisions)
      {
        defender.retreat(origDefenderDivisions);
        conquer(area);
//        game.logPrintln("Attacker wins!");
        int attLosses = origDivisions - divisions;
        game.logPrintln("Attacker has lost " + attLosses + " divisions");
        int defLosses = origDefenderDivisions - defender.divisions;
        game.logPrintln("Defender has lost " + defLosses + " divisions");
        return;
      }
      else if (divisions < 0.7 * origDivisions)
      {
//        game.logPrintln("Defender wins!");
        retreat(origDivisions);
        int attLosses = origDivisions - divisions;
        game.logPrintln("Attacker has lost " + attLosses + " divisions");
        int defLosses = origDefenderDivisions - defender.divisions;
        game.logPrintln("Defender has lost " + defLosses + " divisions");
        return;
      }
    }

    int attLosses = origDivisions - divisions;
    game.logPrintln("Attacker has lost " + attLosses + " divisions");
    int defLosses = origDefenderDivisions - defender.divisions;
    game.logPrintln("Defender has lost " + defLosses + " divisions");
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
//      game.logPrintln("allyRolls: " + Arrays.toString(allyRolls));
//      game.logPrintln("defenderRolls: " + Arrays.toString(defenderRolls));
      int allyMaxPos = TextFormat.findMaxPos(allyRolls);
      int allyMax = allyRolls[allyMaxPos];
      allyRolls[allyMaxPos] = -1; // Represent removed die with -1

      int defenderMaxPos = TextFormat.findMaxPos(defenderRolls);
      int defenderMax = defenderRolls[defenderMaxPos];
      defenderRolls[defenderMaxPos] = -1;

      if (allyMax > defenderMax)
      {
//        game.logPrintln("Defender lost a division.");
        defender.divisions--;
      }
      else if (defenderMax >= allyMax)
      {
//        game.logPrintln("Attacker lost a division.");
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
        game.logPrintln("Combining armies in " + area.getName());
        Army first = areaToRetreat.getArmies().get(0);
        Army second = areaToRetreat.getArmies().get(1);
        Army combined = controller.makeArmy(name, area);

        combined.divisions = first.divisions + second.divisions;
        game.logPrintln("Num armies in " + area.getName() + ": " + areaToRetreat.getArmies().size());
      }
    }
  }

  private void conquer(Area area)
  {
    area.setController(controller);
    Faction defender = area.getController();
    defender.removeArea(area);
    controller.addArea(area);
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
