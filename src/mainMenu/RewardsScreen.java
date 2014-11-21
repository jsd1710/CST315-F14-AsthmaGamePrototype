package mainMenu;

import java.awt.Color;

import javax.swing.JPanel;

public class RewardsScreen extends ActiveScreen
{
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
	}
}
