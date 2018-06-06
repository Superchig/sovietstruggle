/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovietstruggle;

import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author chiggie
 */
public class Area
{

  private static final int IMAGE_HEIGHT = 86;
  private String name;
  private ArrayList<Army> armies;
  private ArrayList<Area> borderAreas;
  private Icon image;
  private Faction controller;
  private SovietStruggleGUI game;

  public Area(String name, String imgPath, Faction controller,
          SovietStruggleGUI game)
  {
    this.name = name;
    this.controller = controller;
    this.game = game;
    armies = new ArrayList<>();
    borderAreas = new ArrayList<>();
    image = TextFormat.scaleImage(imgPath, IMAGE_HEIGHT);
  }

  public void addArmy(Army a)
  {
    armies.add(a);
  }

  public void removeArmy(Army a)
  {
    armies.remove(a);
  }

  public void addBorderArea(Area a)
  {
    if (!borderAreas.contains(a))
    {
      borderAreas.add(a);
    }
  }

  public void addBorderArea(Area[] areaAry)
  {
    for (Area a : areaAry)
    {
      if (!borderAreas.contains(a))
      {
        borderAreas.add(a);
      }
    }
  }

  public void removeBorderArea(Area a)
  {
    borderAreas.remove(a);
  }

  public void removeBorderArea(Area[] areaAry)
  {
    for (Area a : areaAry)
    {
      borderAreas.remove(a);
    }
  }

  public boolean bordersEnemy()
  {
    for (Area a : borderAreas)
    {
      if (a.getController() != controller)
      {
        return true;
      }
    }

    return false;
  }

  public ArrayList<Area> getBorderAreas()
  {
    return borderAreas;
  }

  public Area getRandBorderArea()
  {
    int index = (int) (Math.random() * borderAreas.size());
    return borderAreas.get(index);
  }

  // Returns random border area that is an an enemy to this area
  public Area getRandEnemyBorderArea()
  {
    ArrayList<Area> enemyBorderAreas = new ArrayList<>();
    for (Area area : borderAreas)
    {
      // Checks if enemy area has an army allied to itself, which is technically an enemy army
      if (area.controller != controller)
      {
        enemyBorderAreas.add(area);
      }
    }

    int index = (int) (Math.random() * enemyBorderAreas.size());
    return enemyBorderAreas.get(index);
  }

  // Returns random border area that is an ally to army
  public Area getRandAlliedArea(Army army)
  {
    ArrayList<Area> allyBorderAreas = new ArrayList<>();
    for (Area area : borderAreas)
    {
      if (area.controller == army.getController())
      {
        allyBorderAreas.add(area);
      }
    }

    int index = (int) (Math.random() * allyBorderAreas.size());
    return allyBorderAreas.isEmpty() ? null : allyBorderAreas.get(index);
  }

  public String getName()
  {
    return name;
  }

  public Icon getImage()
  {
    return image;
  }

  public ArrayList<Army> getArmies()
  {
    return armies;
  }

  public Faction getController()
  {
    return controller;
  }

  public void setController(Faction controller)
  {
    this.controller = controller;
  }

  public boolean hasAlliedToPlayerArmy()
  {
    for (Army a : armies)
    {
      if (a.getController() == game.getPlayerFaction())
      {
        return true;
      }
    }

    return false;
  }

  /**
   * Returns whether or not this area has an army that is an enemy to the player
   *
   * @return whether or not there is an enemy army
   */
  public boolean hasEnemyToPlayerArmy()
  {
//    System.out.println("Does " + name + " have allied army? " + hasAlliedToPlayerArmy());
    for (Army army : armies)
    {
      if (army.getController() != game.getPlayerFaction())
      {
        return true;
      }
    }

    return false;
  }

  /**
   * Returns whether or not this area has an army that is an enemy to a provided
   * army.
   *
   * @param armyToCheck army to check against for enemy
   * @return whether or not there is an enemy army to a given army
   */
  public boolean hasEnemyToThisArmy(Army armyToCheck)
  {
    for (Army army : armies)
    {
      if (army.getController() != armyToCheck.getController())
      {
        return true;
      }
    }

    return false;
  }

  /**
   * Returns whether or not this area has an army that is allied to its
   * controller.
   *
   * @return whether or not there is an allied army
   */
  public boolean hasAlliedToSelfArmy()
  {
    for (Army army : armies)
    {
      if (army.getController() == controller)
      {
        return true;
      }
    }

    return false;
  }

  // Returns null if there is no allied army
  public Army getAlliedArmy()
  {
    for (Army a : armies)
    {
      if (a.getController() == controller)
      {
        return a;
      }
    }

    return null;
  }

  @Override
  public String toString()
  {
    String result = name + TextFormat.spaces(13 - name.length());

    boolean hasAllied = hasAlliedToPlayerArmy();
    boolean hasEnemy = hasEnemyToPlayerArmy();

    if (hasAllied)
    {
      result += "Allied Army"
              + TextFormat.spaces("No Allied Army  ".length() - "Allied Army".length());
    }
    else
    {
      result += "No Allied Army  ";
    }

    if (hasEnemy)
    {
      result += " Enemy Army";
    }
    else
    {
      result += " No Enemy Armies";
    }

    return result;
  }
}
