package mainMenu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class RewardsScreen extends ActiveScreen
{
	
	JPanel moneyQuestGoal;
	JPanel itemQuestGoal;
	JPanel moneyQuestReward;
	JPanel itemQuestReward;
	JPanel itemRewardArea;
	JButton claimMoneyButton;
	JButton claimItemButton;
	
	
	RewardsScreen(MenuScreen frame)
	{
		this.frame = frame;
		initUI();
	}
	
	public void initUI()
	{
		this.setSize(650, 575);
		this.setLocation(150, 0);
		this.setBackground(Color.white);
		this.setLayout(null);
		
		this.createCurrencyBar();
		
		claimMoneyButton = new JButton("Claim Money");
		claimMoneyButton.setBounds(360, 200, 125, 30);
		
		claimItemButton = new JButton("Claim Item");
		claimItemButton.setBounds(360, 400, 125, 30);
		
		//Panel that hold Quest Type
		moneyQuestReward = new JPanel();
		moneyQuestReward.setLocation(50,100);
		moneyQuestReward.setSize(100,100);
		moneyQuestReward.setBackground(Color.blue);
		//Panel that hold Quest Type
		itemQuestReward = new JPanel();
		itemQuestReward.setLocation(50,300);
		itemQuestReward.setSize(100,100);
		itemQuestReward.setBackground(Color.blue);
		
		//Panel that updates quest mission
		moneyQuestGoal = new JPanel();
		moneyQuestGoal.setLocation(180,100);
		moneyQuestGoal.setSize(300,100);
		moneyQuestGoal.setBackground(Color.blue);
		//Panel that updates quest mission
		itemQuestGoal = new JPanel();
		itemQuestGoal.setLocation(180,300);
		itemQuestGoal.setSize(300,100);
		itemQuestGoal.setBackground(Color.blue);
			
		this.add(moneyQuestReward);
		this.add(itemQuestReward);
		this.add(moneyQuestGoal);
		this.add(itemQuestGoal);
		this.add(claimMoneyButton);
		this.add(claimItemButton);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String action = e.getActionCommand();
		
		if (action.equals("Claim Money"))
		{

		}			
		else if (action.equals("Claim Item"))
		{

		}	
	}
}
