package User;

public class User 
{
	String name;
	public int money;
	public Inventory inventory;
	
	public User()
	{
		name = "DEFAULT";
		money = 5000;
		
		inventory = new Inventory();
		
		Head helm = new Head();
		Body body = new Body();
		Gloves gloves = new Gloves();
		Items items = new Items();
		Legs legs = new Legs();
		Shoes shoes = new Shoes();
		
		inventory.add(helm, ArmorType.Head);
		inventory.add(body, ArmorType.Body);
		inventory.add(gloves, ArmorType.Gloves);
		inventory.add(items, ArmorType.Items);
		inventory.add(legs, ArmorType.Legs);
		inventory.add(shoes, ArmorType.Shoes);
		
		inventory.equip("EMPTY", ArmorType.Head);
		inventory.equip("Dragon Body", ArmorType.Body);
		inventory.equip("Demon Hunter Gloves", ArmorType.Gloves);
		inventory.equip("Demon Hunter Quiver", ArmorType.Items);
		inventory.equip("Legendary Pants", ArmorType.Legs);
		inventory.equip("Demon Hunter Boots", ArmorType.Shoes);
	}
	
	public User(String name, int money)
	{
		this.name = name;
		this.money = money;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setMoney(int money)
	{
		this.money = money;
	}
	public int getMoney()
	{
		return money;
	}
}
