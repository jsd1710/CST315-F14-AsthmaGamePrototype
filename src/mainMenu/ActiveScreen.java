package mainMenu;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class ActiveScreen extends JPanel
{
	MenuScreen frame;
	JPanel currencyBar;
	
	void createCurrencyBar()
	{
		currencyBar = new JPanel();
		currencyBar.setSize(125, 25);
		currencyBar.setLocation(this.getWidth()-currencyBar.getWidth() - 10, this.getHeight()-currencyBar.getHeight()-10);
		currencyBar.setBackground(Color.blue);
		currencyBar.setLayout(new GridLayout(2,1));
		
		JLabel playerCurrency = new JLabel("Money: " + Integer.toString(frame.user.money));
		playerCurrency.setForeground(Color.white);
		currencyBar.add(playerCurrency);
		
		this.add(currencyBar);
	}
}
