package Rewards;

public class itemQuest {
	//Items are pulled from the items that can be purchased in the store
	private String name;
	private int reward;
	
	public itemQuest()
	{
		reward = 0;
		name = null;
	}
	
	public itemQuest(String nme, int rwd)
	{
		name = nme;
		reward = rwd;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getReward()
	{
		return reward;
	}
	
	public void setName(String nme)
	{
		name = nme;
	}
	
	public void setReward(int rwd)
	{
		reward = rwd;
	}
}
