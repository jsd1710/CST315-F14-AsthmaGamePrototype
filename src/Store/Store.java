package Store;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

import User.ArmorType;

public class Store 
{
	//StoreItem, general class that meets any Item type with prices of item and path to image's directory
	Hashtable<String,StoreItem> headList;
	Hashtable<String,StoreItem> bodyList;
	Hashtable<String,StoreItem> glovesList;
	Hashtable<String,StoreItem> legList;
	Hashtable<String,StoreItem> itemList;
	Hashtable<String,StoreItem> shoeList;
	
	public Store() throws IOException
	{
		headList = new Hashtable<String,StoreItem>();
		bodyList = new Hashtable<String,StoreItem>();
		glovesList = new Hashtable<String,StoreItem>();
		legList = new Hashtable<String,StoreItem>();
		itemList = new Hashtable<String,StoreItem>();
		shoeList = new Hashtable<String,StoreItem>();
		
		readStoreItems(ArmorType.Head);
		readStoreItems(ArmorType.Body);
		readStoreItems(ArmorType.Legs);
		readStoreItems(ArmorType.Gloves);
		readStoreItems(ArmorType.Items);
		readStoreItems(ArmorType.Shoes);
	}
	
	public void add(String name, StoreItem item, ArmorType armorType)
	{
		switch (armorType)
		{
		case Head:
			headList.put(name,item);
			break;
		case Body:
			bodyList.put(name,item);
			break;
		case Legs:
			legList.put(name,item);
			break;
		case Gloves:
			glovesList.put(name,item);
			break;
		case Items:
			itemList.put(name,item);
			break;
		case Shoes:
			shoeList.put(name,item);
			break;
		}
	}
	
	public StoreItem get(String name, ArmorType armorType)
	{
		switch (armorType)
		{
		case Head:
			return headList.get(name);
		case Body:
			return bodyList.get(name);
		case Gloves:
			return glovesList.get(name);
		case Legs:
			return legList.get(name);
		case Items:
			return itemList.get(name);
		case Shoes:
			return shoeList.get(name);
			
		default:
			return null;
		}
	}
	
	public Hashtable<String,StoreItem> getAll(ArmorType armorType)
	{
		switch (armorType)
		{
		case Head:
			return headList;
		case Body:
			return bodyList;
		case Gloves:
			return glovesList;
		case Legs:
			return legList;
		case Items:
			return itemList;
		case Shoes:
			return shoeList;
			
		default:
			return null;
		}
	}
	
	public void readStoreItems(ArmorType armorType) throws IOException
	{
		try 
		{
			BufferedReader fin = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/Resources/Store/" + armorType + "List.txt")));
			
			String fileLine;
			String[] attribute;
			StoreItem item;
			
			//readlines until end of txt
			while((fileLine = fin.readLine()) != null)
			{
				attribute = fileLine.split(",");
				//attribute 0 = name, 1 = item price, 2 = item path when parsed
				item = new StoreItem((attribute[0]),Integer.parseInt(attribute[1]),(attribute[2]));//name
				
				add(attribute[0], item, armorType);
				
				System.out.println("Added " + attribute[0] + " to the store!");
			}
			fin.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}				
}