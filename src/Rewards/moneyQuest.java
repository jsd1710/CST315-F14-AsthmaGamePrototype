package Rewards;

public class moneyQuest {
	
	private String name;
	private int reward;
	
	public moneyQuest()
	{
		reward = 0;
		name = null;
	}
	
	public moneyQuest(String nme, int rwd)
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
