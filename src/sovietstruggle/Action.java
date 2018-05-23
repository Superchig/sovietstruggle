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
@FunctionalInterface
public interface Action
{
  public void act(Faction playerFaction);
}
