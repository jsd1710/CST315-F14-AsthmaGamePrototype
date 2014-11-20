package mainMenu;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;

public class ItemsScreen extends ActiveScreen 
{
	ItemsScreen(MenuScreen frame)
	{
		this.frame = frame;
		initUI();
	}
	public void initUI()
	{
		this.setSize(650, 600);
		this.setLocation(150, 0);
		this.setBackground(Color.white);
	}
}
