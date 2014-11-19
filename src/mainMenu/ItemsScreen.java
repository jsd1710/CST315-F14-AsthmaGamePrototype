package mainMenu;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;

public class ItemsScreen extends ActiveScreen 
{
	ItemsScreen()
	{
		initUI();
	}
	public void initUI()
	{
		this.setSize(635, 50);
		this.setLocation(155, 5);
		this.setBackground(Color.black);
		this.setLayout(null);
	}
}
