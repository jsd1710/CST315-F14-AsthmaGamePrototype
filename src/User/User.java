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
