/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovietstruggle;

/**
 *
 * @author chiggie
 */
public class Army
{
  private String name;
  private Area area;
  private Faction controller;
  private int manpower;
  
  public Army(String name, Area area, Faction controller)
  {
    this.name = name;
    this.area = area;
    this.controller = controller;
    manpower = 1000;
  }
	
	public String toString()
	{
		return area.getName() + TextFormat.spaces(13) + name + TextFormat.spaces(13)
						+ TextFormat.normNumFormat(manpower);
	}
}
