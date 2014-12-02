package mainMenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map.Entry;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Store.StoreItem;
import User.ArmorType;

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
		
		headButton.addActionListener(this);
		bodyButton.addActionListener(this);
		bodyButton.addActionListener(this);
		glovesButton.addActionListener(this);
		shoesButton.addActionListener(this);
		itemButton.addActionListener(this);
		powerButton.addActionListener(this);
		
		itemsPanel = new JPanel();
		itemsPanel.setLocation(storeSidebar.getX() + storeSidebar.getWidth() + 5, 5);
		itemsPanel.setSize(this.getWidth()-itemsPanel.getX() - 10, this.currencyBar.getY()-10);
		itemsPanel.setBackground(Color.blue);
		itemsPanel.setLayout(new GridLayout(0,3));		
		
		this.add(storeSidebar);	
		this.add(itemsPanel);
	}

	public void actionPerformed(ActionEvent e)
	{
		String action = e.getActionCommand();
		
		if (action.equals("Head"))
		{
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
		else if (action.contains("head"))
		{
			String name = action.substring(4);
			
			if (this.frame.user.inventory.owns(name,ArmorType.Head))
			{ //If player already owns the Head piece.
				System.out.println("YOU ALREADY OWN: " + name);
			}
			else if (this.frame.user.money >= this.frame.store.headList.get(name).getPrice())
			{ //If player can afford the Head piece.
				//Adds a new Head piece to user's inventory.
				System.out.println("You have purchased: " + name);
				this.frame.user.inventory.add(new User.Head(name,frame.store.headList.get(name).getImage(50, 50)), ArmorType.Head);
				
				//Removes the cost of Head piece from user's currency.
				this.frame.user.money -= this.frame.store.headList.get(name).getPrice();
				
				
				this.refreshCurrencyBar();
			}
			else
			{ //If play cannot afford the Head piece.
				System.out.println("CANNOT AFFORD: " + name);
			}
		}
	}
	
	void drawAvailbleHeadItems()
	{
		itemsPanel.removeAll();

		for (Entry<String, StoreItem> entry : frame.store.headList.entrySet())
		{
			JButton button = new JButton();
			button.setLayout(new BorderLayout());
			JLabel label1 = new JLabel(entry.getValue().getName());
			JLabel label2 = new JLabel(Integer.toString(entry.getValue().getPrice()));
			button.add(BorderLayout.NORTH,label1);
			button.add(BorderLayout.SOUTH,label2);
			button.setToolTipText(entry.getValue().getName());
			
			button.setVerticalTextPosition(SwingConstants.CENTER);
		    button.setHorizontalTextPosition(SwingConstants.RIGHT);
			
			button.setIcon(entry.getValue().getImage(50,50));
			
			button.setBackground(Color.gray);
			button.setBorder(BorderFactory.createLineBorder(Color.black));;
			
			
			button.setActionCommand("head" + entry.getValue().getName());
			button.addActionListener(this);
			
			itemsPanel.add(button);
		}
		
		validate();
		itemsPanel.repaint();
	}
	
	void drawAvailbleBodyItems()
	{
		itemsPanel.removeAll();
		itemsPanel.repaint();
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