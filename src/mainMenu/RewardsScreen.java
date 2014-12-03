package mainMenu;

import java.awt.Color;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.util.Map.Entry;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class RewardsScreen extends ActiveScreen
{
	
	JPanel moneyQuestGoal;
	JPanel itemQuestGoal;
	JPanel moneyQuestType;
	JPanel itemQuestType;
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
		
		claimMoneyButton = new JButton("Claim Reward");
		claimMoneyButton.setBounds(360, 200, 125, 30);
		
		claimItemButton = new JButton("Claim Reward");
		claimItemButton.setBounds(360, 400, 125, 30);
		
		//Panel that hold Quest Type
		moneyQuestType = new JPanel();
		moneyQuestType.setLocation(50,100);
		moneyQuestType.setSize(100,100);
		moneyQuestType.setBackground(Color.blue);
		//Panel that hold Quest Type
		itemQuestType = new JPanel();
		itemQuestType.setLocation(50,300);
		itemQuestType.setSize(100,100);
		itemQuestType.setBackground(Color.blue);
		
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
		
		
		
		this.add(moneyQuestType);
		this.add(itemQuestType);
		this.add(moneyQuestGoal);
		this.add(itemQuestGoal);
		this.add(claimMoneyButton);
		this.add(claimItemButton);
	}
}
