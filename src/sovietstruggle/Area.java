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

  public Area(String name, String imgPath, Faction controller)
  {
    this.name = name;
    this.controller = controller;
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
      borderAreas.add(a);
  }

  public void addBorderArea(Area[] areaAry)
  {
    for (Area a : areaAry)
    {
      if (!borderAreas.contains(a))
        borderAreas.add(a);
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
    int index = (int)(Math.random() * borderAreas.size());
    return borderAreas.get(index);
  }
  
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
    
    int index = (int)(Math.random() * enemyBorderAreas.size());
    return enemyBorderAreas.get(index);
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

  public boolean hasAlliedArmy()
  {
    for (Army a : armies)
    {
      if (a.getController() == controller)
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

    boolean hasAllied = false;
    for (Army army : armies)
    {
      if (army.getController() == controller)
      {
        hasAllied = true;
        break;
      }
    }

    if (hasAllied)
    {
      result += "Allied Army"
              + TextFormat.spaces("No Allied Army  ".length() - "Allied Army".length());
    } else
    {
      result += "No Allied Army  ";
    }

    if (!hasAllied && armies.size() == 1)
    {
      result += "1 Enemy Army";
    } else if (!hasAllied && !armies.isEmpty())
    {
      result += armies.size() + " Enemy Armies";
    } else
    {
      result += "No Enemy Armies";
    }

    return result;
  }
}
