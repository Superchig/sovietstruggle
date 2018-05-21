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
public class TextFormat
{
	public static String spaces(int numSpaces)
	{
		String result = "";
		
		for (int i = 0; i < numSpaces; i++)
		{
			result += " ";
		}
		
		return result;
	}
}
