package User;

import java.util.Hashtable;

public class Inventory 
{
	Hashtable<String, Gear> ownedHeadPieces;
	Head equippedHead;
	Hashtable<String, Gear> ownedBodyPieces;
	Body equippedBody;
	Hashtable<String, Gear> ownedGlovePieces;
	Gloves equippedGloves;
	Hashtable<String, Gear> ownedItemPieces;
	Items equippedItems;
	Hashtable<String, Gear> ownedLegPieces;
	Legs equippedLegs;
	Hashtable<String, Gear> ownedShoePieces;
	Shoes equippedShoes;
	
	
	Inventory()
	{
		ownedHeadPieces = new Hashtable<String,Gear>();
		ownedBodyPieces = new Hashtable<String,Gear>();
		ownedGlovePieces = new Hashtable<String,Gear>();
		ownedItemPieces = new Hashtable<String,Gear>();
		ownedLegPieces = new Hashtable<String,Gear>();
		ownedShoePieces = new Hashtable<String,Gear>();
		
		add(new Head(), ArmorType.Head);
		add(new Body(), ArmorType.Body);
		add(new Gloves(), ArmorType.Gloves);
		add(new Items(), ArmorType.Items);
		add(new Legs(), ArmorType.Legs);
		add(new Shoes(), ArmorType.Shoes);
		
		equip("EMPTY HEAD", ArmorType.Head);
		equip("EMPTY BODY", ArmorType.Body);
		equip("EMPTY GLOVES", ArmorType.Gloves);
		equip("EMPTY ITEMS", ArmorType.Items);
		equip("EMPTY LEGS", ArmorType.Legs);
		equip("EMPTY SHOES", ArmorType.Shoes);
	}
	
	public Hashtable<String,Gear> getOwned(ArmorType armorType)
	{
		switch (armorType)
		{
		case Head:
			return ownedHeadPieces;
		case Body:
			return ownedBodyPieces;
		case Legs:
			return ownedLegPieces;
		case Gloves:
			return ownedGlovePieces;
		case Items: 
			return ownedItemPieces;
		case Shoes: 
			return ownedShoePieces;
		default:
			return null;
		}
	}
	
	public Gear getEquipped(ArmorType armorType)
	{
		switch (armorType)
		{
		case Head:
			return equippedHead;
		case Body:
			return equippedBody;
		case Legs:
			return equippedLegs;
		case Gloves:
			return equippedGloves;
		case Items: 
			return equippedItems;
		case Shoes: 
			return equippedShoes;
		default:
			return null;
		}
	}	
	public boolean equip(String name, ArmorType armorType)
	{
		switch (armorType)
		{
		case Head:
			if (ownedHeadPieces.containsKey(name))
			{
				equippedHead = (Head) ownedHeadPieces.get(name);
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
				equippedBody = (Body) ownedBodyPieces.get(name);
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
				equippedGloves = (Gloves) ownedGlovePieces.get(name);
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
				equippedItems = (Items) ownedItemPieces.get(name);
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
				equippedLegs = (Legs) ownedLegPieces.get(name);
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
				equippedShoes = (Shoes) ownedShoePieces.get(name);
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
