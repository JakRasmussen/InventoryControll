import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile
{
	public static void mainWrite() 
	{
	 BufferedWriter out;
	 String read;

        try 
        {
        out = new BufferedWriter(new FileWriter("HereItIs.txt", true));
        out.newLine();
        for (int i = 0; i < InventoryAdd.inventory.size(); i++)
        	{
        	InventoryAdd.inventory.get(i).setName(InventoryAdd.inventory.get(i).getName().replaceAll(" ", "-"));
        	out.write(InventoryAdd.inventory.get(i).getSKU() + " " + InventoryAdd.inventory.get(i).getName() + " " + InventoryAdd.inventory.get(i).getAmount() + " " + InventoryAdd.inventory.get(i).getCost() + " " + InventoryAdd.inventory.get(i).getSold() + " " + InventoryAdd.inventory.get(i).getStoreCost());
        	out.newLine();
        	}
          out.close();
        }
        
        catch(IOException ex) 
        {
            System.out.println("Error writing to file HereItIs.txt");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
}