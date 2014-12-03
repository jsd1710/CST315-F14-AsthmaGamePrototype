package mainMenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.util.Hashtable;
import java.util.Map.Entry;


import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


import User.ArmorType;
import User.Gear;


@SuppressWarnings("serial")
public class ItemsScreen extends ActiveScreen implements ActionListener
{	
	JPanel itemsBackground;
	JPanel ownedItemsPanel;
	
	//Buttons used for selecting what items to load	
	JButton headButton;
	JButton glovesButton;
	JButton bodyButton;
	JButton itemsButton;
	JButton legsButton;
	JButton shoesButton;

	
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
		
		ownedItemsPanel = new JPanel();
		ownedItemsPanel.setSize(itemsBackground.getX()-15,itemsBackground.getHeight());
		ownedItemsPanel.setLocation(10,5);
		ownedItemsPanel.setBackground(Color.gray);
		ownedItemsPanel.setLayout(new GridLayout(0, 4));

		headButton = new JButton();
		headButton.setSize(50, 50);
		headButton.setLocation(itemsBackground.getWidth()/2-headButton.getWidth()/2, (int) (itemsBackground.getHeight()*0.10));
		headButton.setBackground(Color.white);
		headButton.setLayout(new GridLayout(1,1));
		headButton.setBorder(BorderFactory.createEmptyBorder());
		headButton.setActionCommand("Equip Head Slot");
		
		bodyButton = new JButton();
		bodyButton.setSize(75, 125);
		bodyButton.setLocation(itemsBackground.getWidth()/2-bodyButton.getWidth()/2, (int) (itemsBackground.getHeight()*0.10+headButton.getHeight()+5));
		bodyButton.setBackground(Color.white);
		bodyButton.setLayout(new GridLayout(1,1));
		bodyButton.setBorder(BorderFactory.createEmptyBorder());
		bodyButton.setActionCommand("Equip Body Slot");
		
		glovesButton = new JButton();
		glovesButton.setSize(75, 50);
		glovesButton.setLocation(itemsBackground.getWidth()/2-bodyButton.getWidth()/2-glovesButton.getWidth()-5, (int) (itemsBackground.getHeight()*0.10+headButton.getHeight()+5));
		glovesButton.setBackground(Color.white);
		glovesButton.setLayout(new GridLayout(1,1));
		glovesButton.setBorder(BorderFactory.createEmptyBorder());
		glovesButton.setActionCommand("Equip Gloves Slot");
		
		itemsButton = new JButton();
		itemsButton.setSize(50, 75);
		itemsButton.setLocation(itemsBackground.getWidth()/2+bodyButton.getWidth()/2+5, (int) (itemsBackground.getHeight()*0.10+headButton.getHeight()+5));
		itemsButton.setBackground(Color.white);
		itemsButton.setLayout(new GridLayout(1,1));
		itemsButton.setBorder(BorderFactory.createEmptyBorder());
		itemsButton.setActionCommand("Equip Items Slot");
		
		legsButton = new JButton();
		legsButton.setSize(75, 100);
		legsButton.setLocation(itemsBackground.getWidth()/2-legsButton.getWidth()/2, (int) (bodyButton.getY()+bodyButton.getHeight()+5));
		legsButton.setBackground(Color.white);
		legsButton.setLayout(new GridLayout(1,1));
		legsButton.setBorder(BorderFactory.createEmptyBorder());
		legsButton.setActionCommand("Equip Legs Slot");
		
		shoesButton = new JButton();
		shoesButton.setSize(100, 50);
		shoesButton.setLocation(itemsBackground.getWidth()/2-shoesButton.getWidth()/2, (int) (legsButton.getY()+legsButton.getHeight()+5));
		shoesButton.setBackground(Color.white);
		shoesButton.setLayout(new GridLayout(1,1));
		shoesButton.setBorder(BorderFactory.createEmptyBorder());
		shoesButton.setActionCommand("Equip Shoes Slot");
		
		headButton.addActionListener(this);
		bodyButton.addActionListener(this);
		glovesButton.addActionListener(this);
		itemsButton.addActionListener(this);
		legsButton.addActionListener(this);
		shoesButton.addActionListener(this);
		
		itemsBackground.add(headButton);
		itemsBackground.add(bodyButton);
		itemsBackground.add(glovesButton);
		itemsBackground.add(itemsButton);
		itemsBackground.add(legsButton);
		itemsBackground.add(shoesButton);
		
		this.add(ownedItemsPanel);
		this.add(itemsBackground);
		
		drawEquippedGear(ArmorType.Head);
		drawEquippedGear(ArmorType.Body);
		drawEquippedGear(ArmorType.Gloves);
		drawEquippedGear(ArmorType.Items);
		drawEquippedGear(ArmorType.Legs);
		drawEquippedGear(ArmorType.Shoes);
	}
	
	void drawEquippedGear(ArmorType armorType)
	{
		ImageIcon image = frame.user.inventory.getEquipped(armorType).getImage();
		String name = frame.user.inventory.getEquipped(armorType).getName();
		switch (armorType)
		{		
		case Head:
			headButton.removeAll();
			headButton.add(new JLabel(image));
			headButton.setToolTipText(name);
			break;
		case Body:
			bodyButton.removeAll();
			bodyButton.add(new JLabel(image));
			bodyButton.setToolTipText(name);
			break;
		case Gloves:
			glovesButton.removeAll();
			glovesButton.add(new JLabel(image));
			glovesButton.setToolTipText(name);
			break;
		case Items:
			itemsButton.removeAll();
			itemsButton.add(new JLabel(image));
			itemsButton.setToolTipText(name);
			break;
		case Legs:
			legsButton.removeAll();
			legsButton.add(new JLabel(image));
			legsButton.setToolTipText(name);
			break;
		case Shoes:
			shoesButton.removeAll();
			shoesButton.add(new JLabel(image));
			shoesButton.setToolTipText(name);
			break;
		}
		validate();
		this.repaint();
	}
		
	void drawInventory(ArmorType armorType)
	{
		ownedItemsPanel.removeAll();
		Hashtable<String, Gear> choice = frame.user.inventory.getOwned(armorType);
		
		for (Entry<String, Gear> entry : choice.entrySet())
		{
			JButton button = new JButton();
			button.setLayout(new BorderLayout());
			JLabel label1 = new JLabel(entry.getValue().getName());
			button.add(BorderLayout.NORTH,label1);
			
			button.setToolTipText(entry.getValue().getName());
			
			button.setVerticalTextPosition(SwingConstants.CENTER);
		    button.setHorizontalTextPosition(SwingConstants.RIGHT);
			
			button.setIcon(entry.getValue().getImage());
			
			button.setBackground(Color.gray);
			button.setBorder(BorderFactory.createLineBorder(Color.black));;
			
			
			button.setActionCommand("Equip " + armorType + " Slot: " + entry.getValue().getName());
			button.addActionListener(this);
			
			ownedItemsPanel.add(button);
		}
		
		validate();
		itemsButton.repaint();
	}

	public void actionPerformed(ActionEvent e) 
	{
		String action = e.getActionCommand();
		
		if (action.equals("Equip Head Slot"))
		{
			drawInventory(ArmorType.Head);
		}
		else if (action.equals("Equip Body Slot"))
		{
			drawInventory(ArmorType.Body);
		}
		else if (action.equals("Equip Gloves Slot"))
		{
			drawInventory(ArmorType.Gloves);
		}
		else if (action.equals("Equip Items Slot"))
		{
			drawInventory(ArmorType.Items);
		}
		else if (action.equals("Equip Legs Slot"))
		{
			drawInventory(ArmorType.Legs);
		}
		else if (action.equals("Equip Shoes Slot"))
		{
			drawInventory(ArmorType.Shoes);
		}
		else if (action.contains("Equip Head Slot: "))
		{
			String name = action.substring(17);
			frame.user.inventory.equip(name,ArmorType.Head);
			drawEquippedGear(ArmorType.Head);
		}
		else if (action.contains("Equip Body Slot: "))
		{
			String name = action.substring(17);
			frame.user.inventory.equip(name,ArmorType.Body);
			drawEquippedGear(ArmorType.Body);
		}
		else if (action.contains("Equip Legs Slot: "))
		{
			String name = action.substring(17);
			frame.user.inventory.equip(name,ArmorType.Legs);
			drawEquippedGear(ArmorType.Legs);
		}
		else if (action.contains("Equip Items Slot: "))
		{
			String name = action.substring(18);
			frame.user.inventory.equip(name,ArmorType.Items);
			drawEquippedGear(ArmorType.Items);
		}
		else if (action.contains("Equip Gloves Slot: "))
		{
			String name = action.substring(19);
			frame.user.inventory.equip(name,ArmorType.Gloves);
			drawEquippedGear(ArmorType.Gloves);
		}
		else if (action.contains("Equip Shoes Slot: "))
		{
			String name = action.substring(18);
			frame.user.inventory.equip(name,ArmorType.Shoes);
			drawEquippedGear(ArmorType.Shoes);
		}
	}

}