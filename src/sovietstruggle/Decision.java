/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovietstruggle;

/**
 *
 * @author 19changc
 */
public class Decision
{
  private String name, description;
  private Action action;
  private Faction faction;
  private boolean taken;

  public Decision(String name, String description, Faction faction, Action action)
  {
    this.name = name;
    this.description = description;
//    this.faction = faction;
    this.action = action;
    taken = false;
  }

  public String getDescription()
  {
    return description;
  }
  
  public void take()
  {
    action.act(faction);
    taken = true;
  }

  public boolean isTaken()
  {
    return taken;
  }
  
  @Override
  public String toString()
  {
    return name;
  }
}
