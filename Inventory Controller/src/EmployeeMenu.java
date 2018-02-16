
import java.io.IOException;
import java.util.*;

public class EmployeeMenu
	{
		public static void initialMenu() throws IOException
		{
			int decision = 0;
			try
			{
				autoCheckStock();
				Scanner employeeIn = new Scanner(System.in);
				System.out.println("What would you like to look at? \n(1)Orders \n(2)Expences \n(3)Go Back");
				decision = employeeIn.nextInt();
			}
			catch(InputMismatchException exc)
			{
				System.out.println("You need to enter a number, either 1 or 2");
				initialMenu();
			}
			if(decision == 1)
					orders();
			else if(decision == 2)
					expences();
			else if(decision == 3)
					InitialMenu.firstQuestion();
			else
				{
					System.out.println("Please enter either 1 or 2");
					initialMenu();
				}
		}

		private static void expences() throws IOException
			{
				int bottomLine = 0;
				for(int i = 0 ; i < InventoryAdd.inventory.size() ; i++)
					{ 
						int income = InventoryAdd.inventory.get(i).getSold() * InventoryAdd.inventory.get(i).getAmount();
						int expences = InventoryAdd.inventory.get(i).getAmount() * InventoryAdd.inventory.get(i).getStoreCost();
						System.out.println( "For: " + InventoryAdd.inventory.get(i).getName() + " We have sold: " + InventoryAdd.inventory.get(i).getSold() + " And it cost :" + expences); 
						bottomLine += income - expences;
					}
				System.out.println();
				System.out.println("The bottom line is: " + bottomLine);
				System.out.println();
				initialMenu();
				
			}

		private static void orders() throws IOException
			{
				System.out.println();
				for(int i = 0 ; i < InventoryAdd.inventory.size() ; i++)
					{
						System.out.println(InventoryAdd.inventory.get(i).getName() + " # sold: " + InventoryAdd.inventory.get(i).getSold());
					}
				System.out.println();
				initialMenu();
				
			}
		private static void autoCheckStock()
		{
			for(int i = 0; i < InventoryAdd.inventory.size() ; i++)
				{
					int isFull = InventoryAdd.inventory.get(i).getFullStock() - InventoryAdd.inventory.get(i).getAmount();
					if(isFull >= 1)
						{
							System.out.println("Ordering " + isFull + " of " + InventoryAdd.inventory.get(i).getName());
							InventoryAdd.inventory.get(i).setAmount(InventoryAdd.inventory.get(i).getFullStock());
						}
				}
			System.out.println();
		}
	}

