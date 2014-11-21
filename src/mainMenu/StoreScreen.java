package mainMenu;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class StoreScreen extends ActiveScreen
{
	JPanel storeSidebar;
	JPanel itemsPanel;
	
	StoreScreen(MenuScreen frame)
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
		
		storeSidebar = new JPanel();
		storeSidebar.setSize(150, this.currencyBar.getY()-10);
		storeSidebar.setLocation(25, 5);
		storeSidebar.setBackground(Color.blue);
		storeSidebar.setLayout(new GridLayout(1,7));
		
		itemsPanel = new JPanel();
		itemsPanel.setLocation(storeSidebar.getX() + storeSidebar.getWidth() + 5, 5);
		itemsPanel.setSize(this.getWidth()-itemsPanel.getX() - 10, this.currencyBar.getY()-10);
		itemsPanel.setBackground(Color.blue);
		itemsPanel.setLayout(new GridLayout(1,7));		
		
		this.add(storeSidebar);	
		this.add(itemsPanel);
	}
}