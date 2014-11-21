package mainMenu;

import java.awt.Color;
import javax.swing.JPanel;

public class ItemsScreen extends ActiveScreen 
{
	JPanel itemsBackground;
	JPanel headPanel;
	JPanel glovesPanel;
	JPanel bodyPanel;
	JPanel itemsPanel;
	JPanel legsPanel;
	JPanel bootsPanel;
	
	ItemsScreen(MenuScreen frame)
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
		
		itemsBackground = new JPanel();
		itemsBackground.setSize(290, this.currencyBar.getY()-10);
		itemsBackground.setLocation(this.getWidth()-300, 5);
		itemsBackground.setBackground(Color.blue);
		itemsBackground.setLayout(null);
		
		headPanel = new JPanel();
		headPanel.setSize(50, 50);
		headPanel.setLocation(itemsBackground.getWidth()/2-headPanel.getWidth()/2, (int) (itemsBackground.getHeight()*0.10));
		headPanel.setBackground(Color.white);
		headPanel.setLayout(null);
		
		bodyPanel = new JPanel();
		bodyPanel.setSize(75, 125);
		bodyPanel.setLocation(itemsBackground.getWidth()/2-bodyPanel.getWidth()/2, (int) (itemsBackground.getHeight()*0.10+headPanel.getHeight()+5));
		bodyPanel.setBackground(Color.white);
		bodyPanel.setLayout(null);
		
		glovesPanel = new JPanel();
		glovesPanel.setSize(75, 50);
		glovesPanel.setLocation(itemsBackground.getWidth()/2-bodyPanel.getWidth()/2-glovesPanel.getWidth()-5, (int) (itemsBackground.getHeight()*0.10+headPanel.getHeight()+5));
		glovesPanel.setBackground(Color.white);
		glovesPanel.setLayout(null);
		
		itemsPanel = new JPanel();
		itemsPanel.setSize(50, 75);
		itemsPanel.setLocation(itemsBackground.getWidth()/2+bodyPanel.getWidth()/2+5, (int) (itemsBackground.getHeight()*0.10+headPanel.getHeight()+5));
		itemsPanel.setBackground(Color.white);
		itemsPanel.setLayout(null);
		
		legsPanel = new JPanel();
		legsPanel.setSize(75, 100);
		legsPanel.setLocation(itemsBackground.getWidth()/2-legsPanel.getWidth()/2, (int) (bodyPanel.getY()+bodyPanel.getHeight()+5));
		legsPanel.setBackground(Color.white);
		legsPanel.setLayout(null);
		
		bootsPanel = new JPanel();
		bootsPanel.setSize(100, 50);
		bootsPanel.setLocation(itemsBackground.getWidth()/2-bootsPanel.getWidth()/2, (int) (legsPanel.getY()+legsPanel.getHeight()+5));
		bootsPanel.setBackground(Color.white);
		bootsPanel.setLayout(null);
		
		itemsBackground.add(headPanel);
		itemsBackground.add(bodyPanel);
		itemsBackground.add(glovesPanel);
		itemsBackground.add(itemsPanel);
		itemsBackground.add(legsPanel);
		itemsBackground.add(bootsPanel);
		
		this.add(itemsBackground);
	}
}
