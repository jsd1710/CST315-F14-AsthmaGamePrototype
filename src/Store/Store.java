package Store;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.StringTokenizer;

import User.Head;

public class Store 
{
	//StoreItem, general class that meets any Item type with prices of item and path to image's directory
	Hashtable<String,StoreItem> headList = new Hashtable<String,StoreItem>();
	Hashtable<String,StoreItem> bodyList = new Hashtable<String,StoreItem>();
	Hashtable<String,StoreItem> glovesList = new Hashtable<String,StoreItem>();
	Hashtable<String,StoreItem> legList = new Hashtable<String,StoreItem>();
	Hashtable<String,StoreItem> itemList = new Hashtable<String,StoreItem>();
	Hashtable<String,StoreItem> powerList = new Hashtable<String,StoreItem>();
	Hashtable<String,StoreItem> shoeList = new Hashtable<String,StoreItem>();
	
	public void readHeadList(String fileName) throws IOException 
	{
		
		try
		{
			BufferedReader fin = new BufferedReader(new FileReader(new File("headList.rtf")));
			
			String fileLine;
			String[] attribute;
			StoreItem item;
			//readlines until end of txt
			while((fileLine = fin.readLine()) != null)
			{
				attribute = fileLine.split(",");
				//attribute 0 = name, 1 = item price, 2 = item path when parsed
				item = new StoreItem((attribute[0]),Double.parseDouble(attribute[1]),(attribute[2]));//name
				headList.put(attribute[0],item);
			}
			fin.close();
		}
		catch(Exception e)
		{
			 throw e;
		}				
	}	
	
	public void readBodyList(String fileName) throws IOException 
	{
		
		try
		{
			BufferedReader fin = new BufferedReader(new FileReader(new File("bodyList.rtf")));
			
			String fileLine;
			String[] attribute;
			StoreItem item;
			//readlines until end of txt
			while((fileLine = fin.readLine()) != null)
			{
				attribute = fileLine.split(",");
				//attribute 0 = name, 1 = item price, 2 = item path when parsed
				item = new StoreItem((attribute[0]),Double.parseDouble(attribute[1]),(attribute[2]));//name
				bodyList.put(attribute[0],item);
			}
			fin.close();
		}
		catch(Exception e)
		{
			 throw e;
		}				
	}	
	
	public void readLegList(String fileName) throws IOException 
	{
		
		try
		{
			BufferedReader fin = new BufferedReader(new FileReader(new File("legList.rtf")));
			
			String fileLine;
			String[] attribute;
			StoreItem item;
			//readlines until end of txt
			while((fileLine = fin.readLine()) != null)
			{
				attribute = fileLine.split(",");
				//attribute 0 = name, 1 = item price, 2 = item path when parsed
				item = new StoreItem((attribute[0]),Double.parseDouble(attribute[1]),(attribute[2]));//name
				legList.put(attribute[0],item);
			}
			fin.close();
		}
		catch(Exception e)
		{
			 throw e;
		}				
	}	
	
	public void readGlovesList(String fileName) throws IOException 
	{
		
		try
		{
			BufferedReader fin = new BufferedReader(new FileReader(new File("glovesList.rtf")));
			
			String fileLine;
			String[] attribute;
			StoreItem item;
			//readlines until end of txt
			while((fileLine = fin.readLine()) != null)
			{
				attribute = fileLine.split(",");
				//attribute 0 = name, 1 = item price, 2 = item path when parsed
				item = new StoreItem((attribute[0]),Double.parseDouble(attribute[1]),(attribute[2]));//name
				glovesList.put(attribute[0],item);
			}
			fin.close();
		}
		catch(Exception e)
		{
			 throw e;
		}				
	}
	
	public void readItemList(String fileName) throws IOException 
	{
		
		try
		{
			BufferedReader fin = new BufferedReader(new FileReader(new File("itemList.rtf")));
			
			String fileLine;
			String[] attribute;
			StoreItem item;
			//readlines until end of txt
			while((fileLine = fin.readLine()) != null)
			{
				attribute = fileLine.split(",");
				//attribute 0 = name, 1 = item price, 2 = item path when parsed
				item = new StoreItem((attribute[0]),Double.parseDouble(attribute[1]),(attribute[2]));//name
				itemList.put(attribute[0],item);
			}
			fin.close();
		}
		catch(Exception e)
		{
			 throw e;
		}				
	}	
	
	public void readPowerList(String fileName) throws IOException 
	{
		
		try
		{
			BufferedReader fin = new BufferedReader(new FileReader(new File("powerList.rtf")));
			
			String fileLine;
			String[] attribute;
			StoreItem item;
			//readlines until end of txt
			while((fileLine = fin.readLine()) != null)
			{
				attribute = fileLine.split(",");
				//attribute 0 = name, 1 = item price, 2 = item path when parsed
				item = new StoreItem((attribute[0]),Double.parseDouble(attribute[1]),(attribute[2]));//name
				powerList.put(attribute[0],item);
			}
			fin.close();
		}
		catch(Exception e)
		{
			 throw e;
		}				
	}	
	
	public void readShoeList(String fileName) throws IOException 
	{
		
		try
		{
			BufferedReader fin = new BufferedReader(new FileReader(new File("shoeList.rtf")));
			
			String fileLine;
			String[] attribute;
			StoreItem item;
			//readlines until end of txt
			while((fileLine = fin.readLine()) != null)
			{
				attribute = fileLine.split(",");
				//attribute 0 = name, 1 = item price, 2 = item path when parsed
				item = new StoreItem((attribute[0]),Double.parseDouble(attribute[1]),(attribute[2]));//name
				shoeList.put(attribute[0],item);
			}
			fin.close();
		}
		catch(Exception e)
		{
			 throw e;
		}				
	}	
}