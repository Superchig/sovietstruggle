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
  
  public Faction(String name)
  {
    this.name = name;
    areas = new ArrayList<>();
    armies = new ArrayList<>();
  }

	public ArrayList<Army> getArmies()
	{
		return armies;
	}
  
  public void addArmy(Army a)
  {
    armies.add(a);
  }
  
  public Army makeArmy(String n, Area a)
  {
		Army army = new Army(n, a, this);
		a.addArmy(army);
    return army;
  }
}
