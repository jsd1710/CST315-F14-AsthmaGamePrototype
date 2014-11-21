package User;

public class User 
{
	public int money;
	public Inventory inventory;
	
	public User()
	{
		money = 5000;
		inventory = new Inventory();
		Helmet helm = new Helmet();
		inventory.addHelmet(helm);
		inventory.equippedHelmet = inventory.getHelmet("Fantasy Helmet");
	}
}
