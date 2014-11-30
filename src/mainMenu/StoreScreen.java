package mainMenu;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class StoreScreen extends ActiveScreen implements ActionListener
{
	JPanel storeSidebar;
	JPanel itemsPanel;
	
	JButton headButton;
	JButton bodyButton;
	JButton legsButton;
	JButton glovesButton;
	JButton shoesButton;
	JButton itemButton;
	JButton powerButton;
	
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
		storeSidebar.setLocation(10, 5);
		storeSidebar.setBackground(Color.blue);
		storeSidebar.setLayout(new GridLayout(7,1));
		
		headButton = new JButton("Head");
		headButton.setActionCommand("Head");
		
		bodyButton = new JButton("Body");
		bodyButton.setActionCommand("Body");
		
		legsButton = new JButton("Legs");
		legsButton.setActionCommand("Legs");
		
		glovesButton = new JButton("Gloves");
		glovesButton.setActionCommand("Gloves");
		
		shoesButton = new JButton("Shoes");
		shoesButton.setActionCommand("Shoes");
		
		itemButton = new JButton("Item");
		itemButton.setActionCommand("Item");
		
		powerButton = new JButton("Power");
		powerButton.setActionCommand("Power");
		
		storeSidebar.add(headButton);
		storeSidebar.add(bodyButton);
		storeSidebar.add(legsButton);
		storeSidebar.add(glovesButton);
		storeSidebar.add(shoesButton);
		storeSidebar.add(itemButton);
		storeSidebar.add(powerButton);
		
		headButton.addActionListener(this.frame);
		bodyButton.addActionListener(this.frame);
		bodyButton.addActionListener(this.frame);
		glovesButton.addActionListener(this.frame);
		shoesButton.addActionListener(this.frame);
		itemButton.addActionListener(this.frame);
		powerButton.addActionListener(this.frame);
		
		itemsPanel = new JPanel();
		itemsPanel.setLocation(storeSidebar.getX() + storeSidebar.getWidth() + 5, 5);
		itemsPanel.setSize(this.getWidth()-itemsPanel.getX() - 10, this.currencyBar.getY()-10);
		itemsPanel.setBackground(Color.blue);
		itemsPanel.setLayout(new GridLayout(1,7));		
		
		this.add(storeSidebar);	
		this.add(itemsPanel);
	}

	public void actionPerformed(ActionEvent e)
	{
		String action = e.getActionCommand();
		
		if (action.equals("Head"))
		{
			System.out.println("bbtest");
			this.drawAvailbleHeadItems();			
		}			
		else if (action.equals("Body"))
		{
			this.drawAvailbleBodyItems();
		}	
		
		else if (action.equals("Legs"))
		{
			this.drawAvailbleLegItems();
		}	
		
		else if (action.equals("Gloves"))
		{
			this.drawAvailbleGloveItems();
		}	
		
		else if (action.equals("Shoes"))
		{
			this.drawAvailbleShoeItems();
		}	
		
		else if (action.equals("Item"))
		{
			this.drawAvailbleItemItems();
		}	
		
		else if (action.equals("Power"))
		{
			this.drawAvailblePowerItems();
		}	
	}
	
	void drawAvailbleHeadItems()
	{
		
	}
	
	void drawAvailbleBodyItems()
	{
		
	}
	
	void drawAvailbleLegItems()
	{
		
	}
	
	void drawAvailbleGloveItems()
	{
		
	}
	
	void drawAvailbleShoeItems()
	{
		
	}
	
	void drawAvailbleItemItems()
	{
		
	}
	void drawAvailblePowerItems()
	{
		
	}
}