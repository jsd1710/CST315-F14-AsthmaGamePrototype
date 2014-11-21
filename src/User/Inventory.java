package User;

import java.util.Hashtable;

public class Inventory 
{
	Hashtable<String,Helmet> ownedHelmets;
	public Helmet equippedHelmet;
	Hashtable<String,Body> ownedBody;
	public Body equippedBody;
	
	
	Inventory()
	{
		ownedHelmets = new Hashtable<String,Helmet>();
		ownedBody = new Hashtable<String,Body>();
	}
	
	boolean equip(String name, ArmorType armorType)
	{
		switch (armorType)
		{
		case Helmet:
			if (ownedHelmets.containsKey(name))
			{
				equippedHelmet = ownedHelmets.get(name);
				return true;
			}
			else
			{
				System.out.println("You do not own the helmet: " + name);
				return false;
			}
		case Body:
			if (ownedBody.containsKey(name))
			{
				equippedBody = ownedBody.get(name);
				return true;
			}
			else
			{
				System.out.println("You do not own the chest piece: " + name);
				return false;
			}
		default:
			System.out.println("Not a valid armor selection.");
			return false;
			
		}
		
	}
	
	void add(Gear gear, ArmorType armorType)
	{
		switch (armorType)
		{
		case Helmet:
			ownedHelmets.put(gear.getName(), (Helmet) gear);
			System.out.println(gear.getName() + " was added to your inventory!");
			break;
		case Body:
			ownedBody.put(gear.getName(), (Body) gear);
			System.out.println(gear.getName() + " was added to your inventory!");
			break;
		default:
			System.out.println("No valid armor added to your inventory.");
		}
	}
	
	void remove(String name, ArmorType armorType)
	{
		switch (armorType)
		{
		case Helmet:
			ownedHelmets.remove(name);
			break;
		case Body:
			ownedBody.remove(name);
			break;
		default:
			System.out.println("No valid armor removed from your inventory.");
		}
		
	}
	
	Gear get(String name, ArmorType armorType)
	{
		switch (armorType)
		{
		case Helmet:
			return ownedHelmets.get(name);
		case Body:
			return ownedBody.get(name);
		default:
			System.out.println("No valid armor was found.");
			return null;	
		}
		
	}
}
