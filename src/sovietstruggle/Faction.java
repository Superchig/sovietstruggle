/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovietstruggle;

import java.util.ArrayList;

/**
 *
 * @author chiggie
 */
public class Faction
{

  private String name;
  private ArrayList<Area> areas;
  private ArrayList<Army> armies;
  private int politicalPower, basePowerIncrease;
  private ArrayList<Decision> decisions;

  public Faction(String name)
  {
    this.name = name;
    areas = new ArrayList<>();
    armies = new ArrayList<>();
    politicalPower = 50;
    basePowerIncrease = 20;
    decisions = new ArrayList<>();
  }

  public int getPoliticalPower()
  {
    return politicalPower;
  }
  
  public void incPoliticalPower(int power)
  {
    politicalPower += power;
  }
  
  public void addDecision(Decision dec)
  {
    decisions.add(dec);
  }
  
  public void addDecision(String name, String desc, Action action)
  {
    decisions.add(new Decision(name, desc, this, action));
  }
  
  public ArrayList<Army> getArmies()
  {
    return armies;
  }

  public ArrayList<Decision> getDecisions()
  {
    return decisions;
  }

  public void addArmy(Army a)
  {
    armies.add(a);
  }
  
  public void removeArmy(Army a)
  {
    armies.remove(a);
  }

  public Army makeArmy(String n, Area a)
  {
    Army army = new Army(n, a, this);
    armies.add(army);
    a.addArmy(army);
    return army;
  }
  
  public void endTurn()
  {
    politicalPower += basePowerIncrease;
  }
}
