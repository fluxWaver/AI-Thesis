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
				System.out.println("");
				System.out.println("(type 'road' or 'shack')");
				String two = sc.nextLine();
				System.out.println("");
				
				if((two).equals("road"))
				{
					System.out.println("You chose to continue along the road.");
					System.out.println("After a while, you see the headlights of a car driving towards you.");
					System.out.println("Do you try to wave down the driver, or continue on the road?");
					System.out.println("");
					System.out.println("(type 'road' or 'wave down')");
					String three = sc.nextLine();
					System.out.println("");
					
					if((three).equals("road"))
					{
						System.out.println("You chose to continue along the road.");
						System.out.println("You keep walking and walking, but don't find anything.");
						System.out.println("After a long time of walking, you start to lose your sense of direction.");
						System.out.println("You collapse from exhaustion, completely alone.");
						System.out.println("YOU LOSE");
					}
					
					else if((three).equals("wave down"))
					{
						System.out.println("You chose to wave the car down.");
						System.out.println("To your relief, the car notices you and slows down.");
						System.out.println("The driver is an elderly man. He doesn't explain why he's here,");
						System.out.println("yet he still offers to take you with him.");
						System.out.println("Do you get in, or continue along the road?");
						System.out.println("");
						System.out.println("(type 'get in' or 'road')");
						String four = sc.nextLine();
						System.out.println("");
						
						if((four).equals("get in"))
						{
							System.out.println("You chose to get in the car.");
						}
					}
				}
				
				else if((two).equals("shack"))
				{
					System.out.println("You chose to go in the shack.");
					System.out.println("It looks like somebody used to live in the shack, but now it's abandoned.");
					System.out.println("Among other things, you find a gas canister that has some gas in it.");
					System.out.println("You take it, walk back to your car and fill it up.");
					System.out.println("The car turns on, and you are able to continue on your way.");
					System.out.println("YOU WIN");
				}
			}
			
			else if((one).equals("woods"))
			{
				System.out.println("You chose to go into the woods.");
			}
	}
}

