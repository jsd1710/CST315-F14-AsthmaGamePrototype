package Store;

public class StoreItem 
{
	private static String name;
	private static double price;
	private static String path;
	
	public StoreItem()
	{
		name = null;
		price = 0;
		path = null;
	}
	
	public StoreItem(String nme,double pce,String pth)
	{
		name = nme;
		price = pce;
		path = pth;
	}
		
	public StoreItem(double pce,String pth)
	{
		 price = pce;
		 path = pth;
	}
	
	public static void setPrice(double pce)
	{
		price = pce;
	}
	public double getPRice()
	{
		return price;
	}
	
	public static void setPath(String pth)
	{
		path = pth;
	}
	
	public String getPath()
	{
		return path;
	}
	
	public String getName()
	{
		return name;
	}
	
	public static void setName(String nme)
	{
		name = nme;
	}
	
}
