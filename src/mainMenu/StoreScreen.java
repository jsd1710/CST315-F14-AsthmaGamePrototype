package mainMenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.util.Map.Entry;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Store.StoreItem;
import User.ArmorType;
import User.Body;
import User.Gear;
import User.Gloves;
import User.Head;
import User.Items;
import User.Legs;
import User.Shoes;

@SuppressWarnings("serial")
public class StoreScreen extends ActiveScreen implements ActionListener
{
	JPanel storeSidebar;
	JPanel itemsPanel;
	
	Color normalButtonColor;
	
	JButton headButton;
	JButton bodyButton;
	JButton legsButton;
	JButton glovesButton;
	JButton shoesButton;
	JButton itemButton;
	
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
		storeSidebar.setLayout(new GridLayout(6,1,0,25));
		
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
		
		storeSidebar.add(headButton);
		storeSidebar.add(bodyButton);
		storeSidebar.add(legsButton);
		storeSidebar.add(glovesButton);
		storeSidebar.add(shoesButton);
		storeSidebar.add(itemButton);
		
		headButton.addActionListener(this);
		bodyButton.addActionListener(this);
		legsButton.addActionListener(this);
		glovesButton.addActionListener(this);
		shoesButton.addActionListener(this);
		itemButton.addActionListener(this);
		
		itemsPanel = new JPanel();
		itemsPanel.setLocation(storeSidebar.getX() + storeSidebar.getWidth() + 5, 5);
		itemsPanel.setSize(this.getWidth()-itemsPanel.getX() - 10, this.currencyBar.getY()-10);
		itemsPanel.setBackground(Color.blue);
		itemsPanel.setLayout(new GridLayout(0,3));		
		
		this.add(storeSidebar);	
		this.add(itemsPanel);
		
		normalButtonColor = headButton.getBackground();
	}

	public void actionPerformed(ActionEvent e)
	{
		String action = e.getActionCommand();
		
		if (action.equals("Head"))
		{
			this.drawStoreItems(ArmorType.Head);
			resetButtonColors();
			headButton.setBackground(Color.gray);
		}			
		else if (action.equals("Body"))
		{
			this.drawStoreItems(ArmorType.Body);
			resetButtonColors();
			bodyButton.setBackground(Color.gray);
		}	
		else if (action.equals("Legs"))
		{
			this.drawStoreItems(ArmorType.Legs);
			resetButtonColors();
			legsButton.setBackground(Color.gray);
		}	
		else if (action.equals("Gloves"))
		{
			this.drawStoreItems(ArmorType.Gloves);
			resetButtonColors();
			glovesButton.setBackground(Color.gray);
		}	
		else if (action.equals("Shoes"))
		{
			this.drawStoreItems(ArmorType.Shoes);
			resetButtonColors();
			shoesButton.setBackground(Color.gray);
		}	
		else if (action.equals("Item"))
		{
			this.drawStoreItems(ArmorType.Items);
			resetButtonColors();
			itemButton.setBackground(Color.gray);
		}	
		else if (action.contains("Head: "))
		{
			String name = action.substring(6);
			purchaseItem(name, ArmorType.Head);
		}
		else if (action.contains("Body: "))
		{
			String name = action.substring(6);
			purchaseItem(name, ArmorType.Body);
		}
		else if (action.contains("Legs: "))
		{
			String name = action.substring(6);
			purchaseItem(name, ArmorType.Legs);
		}
		else if (action.contains("Gloves: "))
		{
			String name = action.substring(8);
			purchaseItem(name, ArmorType.Gloves);
		}
		else if (action.contains("Shoes: "))
		{
			String name = action.substring(7);
			purchaseItem(name, ArmorType.Shoes);
		}
		else if (action.contains("Items: "))
		{
			String name = action.substring(7);
			purchaseItem(name, ArmorType.Items);
			
		}
	}
	
	void purchaseItem(String name, ArmorType armorType)
	{
		
		if (this.frame.user.inventory.owns(name,armorType))
		{ //If player already owns the item.
			System.out.println("YOU ALREADY OWN: " + name);
		}
		else if (this.frame.user.getMoney() >= this.frame.store.get(name, armorType).getPrice())
		{ //If player can afford the item.
			//Adds a new item to user's inventory.
			System.out.println("You have purchased: " + name);
			
			Gear item = null;
			switch (armorType)
			{
			case Head:
				item = new Head(name,frame.store.get(name,armorType).getImage(50, 50));
				break;
			case Body:
				item = new Body(name,frame.store.get(name,armorType).getImage(50, 50));
				break;
			case Legs:
				item = new Legs(name,frame.store.get(name,armorType).getImage(50, 50));
				break;
			case Gloves:
				item = new Gloves(name,frame.store.get(name,armorType).getImage(50, 50));
				break;
			case Items:
				item = new Items(name,frame.store.get(name,armorType).getImage(50, 50));
				break;
			case Shoes:
				item = new Shoes(name,frame.store.get(name,armorType).getImage(50, 50));
				break;
			}
			
			this.frame.user.inventory.add(item, armorType);
			
			//Removes the cost of item from user's currency.
			this.frame.user.setMoney(this.frame.user.getMoney() - this.frame.store.get(name,armorType).getPrice());
			
			
			this.refreshCurrencyBar();
		}
		else
		{ //If play cannot afford the Item piece.
			System.out.println("CANNOT AFFORD: " + name);
		}
	}

	void drawStoreItems(ArmorType armorType)
	{
		itemsPanel.removeAll();
		Hashtable<String, StoreItem> choice = frame.store.getAll(armorType);
		
		for (Entry<String, StoreItem> entry : choice.entrySet())
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
			
			
			button.setActionCommand(armorType + ": "+ entry.getValue().getName());
			//System.out.println(armorType + ": "+ entry.getValue().getName());
			button.addActionListener(this);
			
			itemsPanel.add(button);
		}
		
		validate();
		itemsPanel.repaint();
	}
	
	void resetButtonColors()
	{
		if (headButton.getBackground() == Color.gray)
		{
			headButton.setBackground(normalButtonColor);
		}
		else if (bodyButton.getBackground() == Color.gray)
		{
			bodyButton.setBackground(normalButtonColor);
		}
		else if (legsButton.getBackground() == Color.gray)
		{
			legsButton.setBackground(normalButtonColor);
		}
		else if (glovesButton.getBackground() == Color.gray)
		{
			glovesButton.setBackground(normalButtonColor);
		}
		else if (shoesButton.getBackground() == Color.gray)
		{
			shoesButton.setBackground(normalButtonColor);
		}
		else if (itemButton.getBackground() == Color.gray)
		{
			itemButton.setBackground(normalButtonColor);
		}
	}
}