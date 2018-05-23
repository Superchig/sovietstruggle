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

  public Decision(String name, String description, Action action)
  {
    this.name = name;
    this.description = description;
    this.action = action;
  }
  
  public void take()
  {
    action.act(faction);
  }
  
  @Override
  public String toString()
  {
    String result = "";
    
    result += "--- " + name + " ---";
    result += "\n" + description;
    
    return result;
  }
}
