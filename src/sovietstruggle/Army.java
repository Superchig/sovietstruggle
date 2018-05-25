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

  // Returns previous Area
  public Area moveTo(Area newArea)
  {
    Area oldArea = area;

    area.removeArmy(this);
    newArea.addArmy(this);
    area = newArea;

    return oldArea;
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

  public void setName(String name)
  {
    this.name = name;
  }

  @Override
  public String toString()
  {
    return area.getName() + TextFormat.spaces(13) + name + TextFormat.spaces(13)
            + TextFormat.normNumFormat(getManpower());
  }
}
