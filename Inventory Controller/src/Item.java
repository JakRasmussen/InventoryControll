
public class Item
	{
	private int SKU;
	private String name;
	private int amount; //how many we have
	private int cost; //how much we are paying for it
	private int sold; // how many we sold
	private int storeCost; // how much we paid for it
	private int fullStock; //this is what the full stock is;
public Item (int s, String n, int a, int c, int so, int sc , int fs)
	{
	SKU = s;
	name = n;
	amount = a;
	cost = c;
	sold = so;
	storeCost = sc;
	fullStock = fs;
	}
public int getSKU()
	{
	return SKU;
	}
public void setSKU(int sKU)
	{
	SKU = sKU;
	}
public String getName()
	{
	return name;
	}
public void setName(String name)
	{
	this.name = name;
	}
public int getAmount()
	{
	return amount;
	}
public void setAmount(int amount)
	{
	this.amount = amount;
	}
public int getCost()
	{
	return cost;
	}
public void setCost(int cost)
	{
	this.cost = cost;
	}
public int getSold()
	{
	return sold;
	}
public void setSold(int sold)
	{
	this.sold = sold;
	}
public int getStoreCost()
	{
	return storeCost;
	}
public void setStoreCost(int storeCost)
	{
	this.storeCost = storeCost;
	}
public int getFullStock()
{
	return fullStock;
}
}
