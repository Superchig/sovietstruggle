/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovietstruggle;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.NumberFormat;

/**
 *
 * @author chiggie
 */
public class TextFormat
{

  private static NumberFormat fmt = NumberFormat.getNumberInstance();

  public static String spaces(int numSpaces)
  {
    String result = "";

    for (int i = 0; i < numSpaces; i++)
    {
      result += " ";
    }

    return result;
  }

  public static String normNumFormat(int num)
  {
    return fmt.format(num);
  }

  public static String readFile(String path)
  {
    try
    {
      byte[] encoded = Files.readAllBytes(Paths.get(path));
      return new String(encoded, Charset.defaultCharset())
              .replace("\n\n", "rEaN").replace("\n", " ")
              .replace("rEaN", "\n\n");
    } catch (IOException e)
    {
      e.printStackTrace();
      return "Error In Reading File";
    }
  }
}
