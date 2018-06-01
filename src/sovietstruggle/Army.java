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

    area.removeArmy(this);
    newArea.addArmy(this);
    area = newArea;
    
    // battle code to be implemented
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

  public int getDivisions()
  {
    return divisions;
  }

  @Override
  public String toString()
  {
    return area.getName() + TextFormat.spaces(13) + name + TextFormat.spaces(13)
            + TextFormat.normNumFormat(getManpower());
  }
}
