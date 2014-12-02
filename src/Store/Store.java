package Store;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.StringTokenizer;

import User.Head;

public class Store 
{
	//StoreItem, general class that meets any Item type with prices of item and path to image's directory
	public Hashtable<String,StoreItem> headList;
	public Hashtable<String,StoreItem> bodyList;
	public Hashtable<String,StoreItem> glovesList;
	public Hashtable<String,StoreItem> legList;
	public Hashtable<String,StoreItem> itemList;
	public Hashtable<String,StoreItem> shoeList;
	
	public Store() throws IOException
	{
		headList = new Hashtable<String,StoreItem>();
		bodyList = new Hashtable<String,StoreItem>();
		glovesList = new Hashtable<String,StoreItem>();
		legList = new Hashtable<String,StoreItem>();
		itemList = new Hashtable<String,StoreItem>();
		shoeList = new Hashtable<String,StoreItem>();
		
		readHeadList();
		readBodyList();
		readLegList();
		readGlovesList();
		readItemList();
		readShoeList();
	}
	
	public void readHeadList() throws IOException 
	{
		
		try
		{
			BufferedReader fin = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/Store/gearList/headList.txt")));
			
			String fileLine;
			String[] attribute;
			StoreItem item;
			
			//readlines until end of txt
			while((fileLine = fin.readLine()) != null)
			{
				attribute = fileLine.split(",");
				//attribute 0 = name, 1 = item price, 2 = item path when parsed
				item = new StoreItem((attribute[0]),Integer.parseInt(attribute[1]),(attribute[2]));//name
				headList.put(attribute[0],item);
				System.out.println("Added " + attribute[0] + " to the store!");
			}
			fin.close();
		}
		catch(Exception e)
		{
			 throw e;
		}				
	}	
	
	public void readBodyList() throws IOException 
	{
		
		try
		{
			BufferedReader fin = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/Store/gearList/bodyList.txt")));
			
			String fileLine;
			String[] attribute;
			StoreItem item;
			//readlines until end of txt
			while((fileLine = fin.readLine()) != null)
			{
				attribute = fileLine.split(",");
				//attribute 0 = name, 1 = item price, 2 = item path when parsed
				item = new StoreItem((attribute[0]),Integer.parseInt(attribute[1]),(attribute[2]));//name
				bodyList.put(attribute[0],item);
				System.out.println("Added " + attribute[0] + " to the store!");
			}
			fin.close();
		}
		catch(Exception e)
		{
			 throw e;
		}				
	}	
	
	public void readLegList() throws IOException 
	{
		
		try
		{
			BufferedReader fin = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/Store/gearList/legList.txt")));
			
			String fileLine;
			String[] attribute;
			StoreItem item;
			//readlines until end of txt
			while((fileLine = fin.readLine()) != null)
			{
				attribute = fileLine.split(",");
				//attribute 0 = name, 1 = item price, 2 = item path when parsed
				item = new StoreItem((attribute[0]),Integer.parseInt(attribute[1]),(attribute[2]));//name
				legList.put(attribute[0],item);
				System.out.println("Added " + attribute[0] + " to the store!");
			}
			fin.close();
		}
		catch(Exception e)
		{
			 throw e;
		}				
	}	
	
	public void readGlovesList() throws IOException 
	{
		
		try
		{
			BufferedReader fin = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/Store/gearList/glovesList.txt")));
			
			String fileLine;
			String[] attribute;
			StoreItem item;
			//readlines until end of txt
			while((fileLine = fin.readLine()) != null)
			{
				attribute = fileLine.split(",");
				//attribute 0 = name, 1 = item price, 2 = item path when parsed
				item = new StoreItem((attribute[0]),Integer.parseInt(attribute[1]),(attribute[2]));//name
				glovesList.put(attribute[0],item);
				System.out.println("Added " + attribute[0] + " to the store!");
			}
			fin.close();
		}
		catch(Exception e)
		{
			 throw e;
		}				
	}
	
	public void readItemList() throws IOException 
	{
		
		try
		{
			BufferedReader fin = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/Store/gearList/itemList.txt")));
			
			String fileLine;
			String[] attribute;
			StoreItem item;
			//readlines until end of txt
			while((fileLine = fin.readLine()) != null)
			{
				attribute = fileLine.split(",");
				//attribute 0 = name, 1 = item price, 2 = item path when parsed
				item = new StoreItem((attribute[0]),Integer.parseInt(attribute[1]),(attribute[2]));//name
				itemList.put(attribute[0],item);
				System.out.println("Added " + attribute[0] + " to the store!");
			}
			fin.close();
		}
		catch(Exception e)
		{
			 throw e;
		}				
	}	
	
	public void readShoeList() throws IOException 
	{
		
		try
		{
			BufferedReader fin = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/Store/gearList/shoeList.txt")));
			
			String fileLine;
			String[] attribute;
			StoreItem item;
			//readlines until end of txt
			while((fileLine = fin.readLine()) != null)
			{
				attribute = fileLine.split(",");
				//attribute 0 = name, 1 = item price, 2 = item path when parsed
				item = new StoreItem((attribute[0]),Integer.parseInt(attribute[1]),(attribute[2]));//name
				shoeList.put(attribute[0],item);
				System.out.println("Added " + attribute[0] + " to the store!");
			}
			fin.close();
		}
		catch(Exception e)
		{
			 throw e;
		}				
	}	
}