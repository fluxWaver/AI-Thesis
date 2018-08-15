/**
 * 
 */
package mainPackage;

import java.util.Scanner;

/**
 * @author riceb
 *
 */

public class Driver2 
{
	public Driver2() 
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("You are driving at night down a solitary road in the middle of nowhere.");
		System.out.println("Your car runs out of gas. Do you continue to walk along the road,");
		System.out.println("or walk into the woods beside the road?");
		System.out.println("");
		System.out.println("(type 'road' or 'woods')");
		String one = sc.nextLine();
		System.out.println("");
		if((one).equals("road"))
		{
			System.out.println("You chose to continue along the road.");
			System.out.println("You walk until you find a small shack on the road. Do you go inside");
			System.out.println("Or continue walking along the road?");
			String two = sc.nextLine();
			System.out.println("");
			if((two).equals("road"))
			{
				System.out.println("You chose to continue along the road.");
			}
		}
	}

}
