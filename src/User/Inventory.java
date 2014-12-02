package User;

import java.util.Hashtable;

public class Inventory 
{
	public Hashtable<String,Head> ownedHeadPieces;
	public Head equippedHelmet;
	public Hashtable<String,Body> ownedBodyPieces;
	public Body equippedBody;
	public Hashtable<String,Gloves> ownedGlovePieces;
	public Gloves equippedGloves;
	public Hashtable<String,Items> ownedItemPieces;
	public Items equippedItems;
	public Hashtable<String,Legs> ownedLegPieces;
	public Legs equippedLegs;
	public Hashtable<String,Shoes> ownedShoePieces;
	public Shoes equippedShoes;
	
	
	Inventory()
	{
		ownedHeadPieces = new Hashtable<String,Head>();
		ownedBodyPieces = new Hashtable<String,Body>();
		ownedGlovePieces = new Hashtable<String,Gloves>();
		ownedItemPieces = new Hashtable<String,Items>();
		ownedLegPieces = new Hashtable<String,Legs>();
		ownedShoePieces = new Hashtable<String,Shoes>();
	}
	
	boolean equip(String name, ArmorType armorType)
	{
		switch (armorType)
		{
		case Head:
			if (ownedHeadPieces.containsKey(name))
			{
				equippedHelmet = ownedHeadPieces.get(name);
				return true;
			}
			else
			{
				System.out.println("You do not own the helmet: " + name);
				return false;
			}
		case Body:
			if (ownedBodyPieces.containsKey(name))
			{
				equippedBody = ownedBodyPieces.get(name);
				return true;
			}
			else
			{
				System.out.println("You do not own the chest piece: " + name);
				return false;
			}
		case Gloves:
			if (ownedGlovePieces.containsKey(name))
			{
				equippedGloves = ownedGlovePieces.get(name);
				return true;
			}
			else
			{
				System.out.println("You do not own the glove piece: " + name);
				return false;
			}
		case Items:
			if (ownedItemPieces.containsKey(name))
			{
				equippedItems = ownedItemPieces.get(name);
				return true;
			}
			else
			{
				System.out.println("You do not own the item: " + name);
				return false;
			}
		case Legs:
			if (ownedLegPieces.containsKey(name))
			{
				equippedLegs = ownedLegPieces.get(name);
				return true;
			}
			else
			{
				System.out.println("You do not own the leg piece: " + name);
				return false;
			}
		case Shoes:
			if (ownedShoePieces.containsKey(name))
			{
				equippedShoes = ownedShoePieces.get(name);
				return true;
			}
			else
			{
				System.out.println("You do not own the shoe piece: " + name);
				return false;
			}
		default:
			System.out.println("Not a valid armor selection.");
			return false;
			
		}
		
	}
	//servers as buy method
	public void add(Gear gear, ArmorType armorType)
	{
		switch (armorType)
		{
		case Head:
			ownedHeadPieces.put(gear.getName(), (Head) gear);
			System.out.println(gear.getName() + " was added to your inventory!");
			break;
		case Body:
			ownedBodyPieces.put(gear.getName(), (Body) gear);
			System.out.println(gear.getName() + " was added to your inventory!");
			break;
		case Gloves:
			ownedGlovePieces.put(gear.getName(), (Gloves) gear);
			System.out.println(gear.getName() + " was added to your inventory!");
			break;
		case Items:
			ownedItemPieces.put(gear.getName(), (Items) gear);
			System.out.println(gear.getName() + " was added to your inventory!");
			break;
		case Legs:
			ownedLegPieces.put(gear.getName(), (Legs) gear);
			System.out.println(gear.getName() + " was added to your inventory!");
			break;
		case Shoes:
			ownedShoePieces.put(gear.getName(), (Shoes) gear);
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
		case Head:
			ownedHeadPieces.remove(name);
			break;
		case Body:
			ownedBodyPieces.remove(name);
			break;
		case Gloves:
			ownedGlovePieces.remove(name);
			break;
		case Items:
			ownedItemPieces.remove(name);
			break;
		case Legs:
			ownedLegPieces.remove(name);
			break;
		case Shoes:
			ownedLegPieces.remove(name);
			break;
		default:
			System.out.println("No valid armor removed from your inventory.");
		}
		
	}
	
	Gear get(String name, ArmorType armorType)
	{
		switch (armorType)
		{
		case Head:
			return ownedHeadPieces.get(name);
		case Body:
			return ownedBodyPieces.get(name);
		case Gloves:
			return ownedGlovePieces.get(name);
		case Items:
			return ownedItemPieces.get(name);
		case Legs:
			return ownedLegPieces.get(name);	
		case Shoes:
			return ownedShoePieces.get(name);	
		default:
			System.out.println("No valid armor was found.");
			return null;	
		}
		
	}
	
	public boolean owns(String name, ArmorType armorType)
	{
		switch (armorType)
		{
		case Head:
			return ownedHeadPieces.containsKey(name);
		case Body:
			return ownedBodyPieces.containsKey(name);
		case Gloves:
			return ownedGlovePieces.containsKey(name);
		case Items:
			return ownedItemPieces.containsKey(name);
		case Legs:
			return ownedLegPieces.containsKey(name);	
		case Shoes:
			return ownedShoePieces.containsKey(name);	
		default:
			System.out.println("No valid armor was found.");
			return false;	
		}
		
	}
}
