package User;

import java.util.Hashtable;

public class Inventory 
{
	Hashtable<String,Helmet> ownedHelmets;
	public Helmet equippedHelmet;
	
	Inventory()
	{
		ownedHelmets = new Hashtable<String,Helmet>();
	}
	
	void addHelmet(Helmet helmet)
	{
		ownedHelmets.put(helmet.name, helmet);
	}
	void removeHelmet(Helmet helmet)
	{
		ownedHelmets.put(helmet.name, helmet);
	}
	Helmet getHelmet(String name)
	{
		return ownedHelmets.get(name);
	}
}
