import java.io.IOException;
import java.util.*;
import java.io.*;

public class InitialMenu
	{
		public static int eOrB;
		static ArrayList <Item> cart = new ArrayList <Item>();
	public static void firstQuestion() throws IOException
	{
	InventoryAdd.addArray();
		try
		{
			Scanner userIn = new Scanner(System.in);
			System.out.println("Are you an employee or a buyer? \n(0) Buyer \n(1) Employee");
			eOrB = userIn.nextInt();
			checkEOrB();
		}
		catch(InputMismatchException exc)
		{
			System.out.println("You need to enter a number.");
			firstQuestion();
		}
		
	}
	public static void checkEOrB() throws IOException
	{
		if(eOrB == 1)
			{
				try
					{
				Scanner pass = new Scanner(System.in);
				System.out.println("What is the password?");
				int thePass = pass.nextInt();
				if(thePass == 1234)
					{
						EmployeeMenu.initialMenu(); // This will call the method to run the rest of the employee code.
					}
				else
					{
						System.out.println("That is not the right password.");
						firstQuestion();
					}
					}
				catch(InputMismatchException exc)
					{
						System.out.println("You need to enter a number.");
						checkEOrB();
					}
			}
		else if(eOrB == 0)
			{
			buyerExperience();
			}
		else
			{
				System.out.println("You need to enter either 0 or 1");
				firstQuestion();
			}
	}
	public static void buyerExperience() throws IOException
		{//work
		
		System.out.println("Would you like to ");
		System.out.println("1). Shop from the inventory");
		System.out.println("2). Search our database");
		Scanner userIn = new Scanner(System.in);
		int choice = userIn.nextInt();
		if (choice == 1)
			{
			InventoryAdd.printInventory();
			Scanner userIn1 = new Scanner(System.in);
			int choice1 = userIn1.nextInt();
			cart.add(InventoryAdd.inventory.get(choice1 - 1));
			InventoryAdd.inventory.get(choice1 -1).setAmount(InventoryAdd.inventory.get(choice1-1 ).getAmount() - 1);
			InventoryAdd.inventory.get(choice1 - 1).setSold(InventoryAdd.inventory.get(choice1 - 1).getAmount() + 1);
			shopChoice();
			}
		else 
			{
			searchFunction.illSearch();
			Scanner userIn1 = new Scanner(System.in);
			int choice1 = userIn1.nextInt();
			cart.add(InventoryAdd.inventory.get(choice1-1));
			InventoryAdd.inventory.get(choice1-1).setAmount(InventoryAdd.inventory.get(choice1-1).getAmount() - 1);
			InventoryAdd.inventory.get(choice1 - 1).setSold(InventoryAdd.inventory.get(choice1 - 1).getAmount() + 1);
			shopChoice();
			}
		}
	public static void shopChoice() throws IOException
		{
		System.out.println("Would you like to continue shopping?");
		System.out.println("1). Yes");
		System.out.println("2). No");
		Scanner userIn1 = new Scanner(System.in);
		int choice1 = userIn1.nextInt();
		if (choice1 == 1)
			{
			buyerExperience();
			}
		else 
			{
			checkout();
			}
		}
	public static void checkout()
		{
		System.out.println("You are buying");
		System.out.println("");
		int total = 0;
		for(int i = 0; i < cart.size(); i++)
			{
			System.out.println(cart.get(i).getName());
			total = total + cart.get(i).getCost();
			}
		System.out.println("");
		System.out.println("Your total is $" + total);
		}
	}
