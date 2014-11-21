package mainMenu;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public abstract class ActiveScreen extends JPanel
{
	MenuScreen frame;
	JPanel currencyBar;
	
	void createCurrencyBar()
	{
		currencyBar = new JPanel();
		currencyBar.setSize(200, 200);
		currencyBar.setLocation(0, 0);
		currencyBar.setBackground(Color.blue);
		//currencyBar.setLayout(null);
		this.add(currencyBar);
		
		//currencyBar.setVisible(true);
		//this.repaint();
		//this.setVisible(true);
	}
}
