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
		currencyBar.setSize(125, 25);
		currencyBar.setLocation((int) (this.getWidth()*0.98-currencyBar.getWidth()), (int) (this.getHeight()*0.98-currencyBar.getHeight()));
		currencyBar.setBackground(Color.blue);
		currencyBar.setLayout(null);
		this.add(currencyBar);
		
		//currencyBar.setVisible(true);
		//this.repaint();
		//this.setVisible(true);
	}
}
