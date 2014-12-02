package mainMenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map.Entry;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Store.StoreItem;
import User.ArmorType;

@SuppressWarnings("serial")
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
		else if (action.contains("body"))
		{
			String name = action.substring(4);
			
			if (this.frame.user.inventory.owns(name,ArmorType.Body))
			{ //If player already owns the Body piece.
				System.out.println("YOU ALREADY OWN: " + name);
			}
			else if (this.frame.user.money >= this.frame.store.bodyList.get(name).getPrice())
			{ //If player can afford the Body piece.
				//Adds a new Body piece to user's inventory.
				System.out.println("You have purchased: " + name);
				this.frame.user.inventory.add(new User.Body(name,frame.store.bodyList.get(name).getImage(50, 50)), ArmorType.Body);
				
				//Removes the cost of Body piece from user's currency.
				this.frame.user.money -= this.frame.store.bodyList.get(name).getPrice();
				
				
				this.refreshCurrencyBar();
			}
			else
			{ //If play cannot afford the Body piece.
				System.out.println("CANNOT AFFORD: " + name);
			}
		}
		else if (action.contains("leg"))
		{
			String name = action.substring(3);
			
			if (this.frame.user.inventory.owns(name,ArmorType.Legs))
			{ //If player already owns the Leg piece.
				System.out.println("YOU ALREADY OWN: " + name);
			}
			else if (this.frame.user.money >= this.frame.store.legList.get(name).getPrice())
			{ //If player can afford the Leg piece.
				//Adds a new Leg piece to user's inventory.
				System.out.println("You have purchased: " + name);
				this.frame.user.inventory.add(new User.Legs(name,frame.store.legList.get(name).getImage(50, 50)), ArmorType.Legs);
				
				//Removes the cost of Leg piece from user's currency.
				this.frame.user.money -= this.frame.store.legList.get(name).getPrice();
				
				
				this.refreshCurrencyBar();
			}
			else
			{ //If play cannot afford the Leg piece.
				System.out.println("CANNOT AFFORD: " + name);
			}
		}
		else if (action.contains("gloves"))
		{
			String name = action.substring(6);
			
			if (this.frame.user.inventory.owns(name,ArmorType.Gloves))
			{ //If player already owns the Glove piece.
				System.out.println("YOU ALREADY OWN: " + name);
			}
			else if (this.frame.user.money >= this.frame.store.glovesList.get(name).getPrice())
			{ //If player can afford the Glove piece.
				//Adds a new Glove piece to user's inventory.
				System.out.println("You have purchased: " + name);
				this.frame.user.inventory.add(new User.Gloves(name,frame.store.glovesList.get(name).getImage(50, 50)), ArmorType.Gloves);
				
				//Removes the cost of Glove piece from user's currency.
				this.frame.user.money -= this.frame.store.glovesList.get(name).getPrice();
				
				
				this.refreshCurrencyBar();
			}
			else
			{ //If play cannot afford the Glove piece.
				System.out.println("CANNOT AFFORD: " + name);
			}
		}
		else if (action.contains("shoe"))
		{
			String name = action.substring(4);
			
			if (this.frame.user.inventory.owns(name,ArmorType.Shoes))
			{ //If player already owns the Shoe piece.
				System.out.println("YOU ALREADY OWN: " + name);
			}
			else if (this.frame.user.money >= this.frame.store.shoeList.get(name).getPrice())
			{ //If player can afford the Shoe piece.
				//Adds a new Shoe piece to user's inventory.
				System.out.println("You have purchased: " + name);
				this.frame.user.inventory.add(new User.Shoes(name,frame.store.shoeList.get(name).getImage(50, 50)), ArmorType.Shoes);
				
				//Removes the cost of Shoe piece from user's currency.
				this.frame.user.money -= this.frame.store.shoeList.get(name).getPrice();
				
				
				this.refreshCurrencyBar();
			}
			else
			{ //If play cannot afford the Shoe piece.
				System.out.println("CANNOT AFFORD: " + name);
			}
		}
		else if (action.contains("item"))
		{
			String name = action.substring(4);
			
			if (this.frame.user.inventory.owns(name,ArmorType.Items))
			{ //If player already owns the Item piece.
				System.out.println("YOU ALREADY OWN: " + name);
			}
			else if (this.frame.user.money >= this.frame.store.itemList.get(name).getPrice())
			{ //If player can afford the Item piece.
				//Adds a new Item piece to user's inventory.
				System.out.println("You have purchased: " + name);
				this.frame.user.inventory.add(new User.Items(name,frame.store.itemList.get(name).getImage(50, 50)), ArmorType.Items);
				
				//Removes the cost of Item piece from user's currency.
				this.frame.user.money -= this.frame.store.itemList.get(name).getPrice();
				
				
				this.refreshCurrencyBar();
			}
			else
			{ //If play cannot afford the Item piece.
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

		for (Entry<String, StoreItem> entry : frame.store.bodyList.entrySet())
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
			
			
			button.setActionCommand("body" + entry.getValue().getName());
			button.addActionListener(this);
			
			itemsPanel.add(button);
		}
		
		validate();
		itemsPanel.repaint();
	}
	
	void drawAvailbleLegItems()
	{
		itemsPanel.removeAll();

		for (Entry<String, StoreItem> entry : frame.store.legList.entrySet())
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
			
			
			button.setActionCommand("leg" + entry.getValue().getName());
			button.addActionListener(this);
			
			itemsPanel.add(button);
		}
		
		validate();
		itemsPanel.repaint();
	}
	
	void drawAvailbleGloveItems()
	{
		itemsPanel.removeAll();

		for (Entry<String, StoreItem> entry : frame.store.glovesList.entrySet())
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
			
			
			button.setActionCommand("gloves" + entry.getValue().getName());
			button.addActionListener(this);
			
			itemsPanel.add(button);
		}
		
		validate();
		itemsPanel.repaint();
	}
	
	void drawAvailbleShoeItems()
	{
		itemsPanel.removeAll();

		for (Entry<String, StoreItem> entry : frame.store.shoeList.entrySet())
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
			
			
			button.setActionCommand("shoe" + entry.getValue().getName());
			button.addActionListener(this);
			
			itemsPanel.add(button);
		}
		
		validate();
		itemsPanel.repaint();
	}
	
	void drawAvailbleItemItems()
	{
		itemsPanel.removeAll();

		for (Entry<String, StoreItem> entry : frame.store.itemList.entrySet())
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
			
			
			button.setActionCommand("item" + entry.getValue().getName());
			button.addActionListener(this);
			
			itemsPanel.add(button);
		}
		
		validate();
		itemsPanel.repaint();
	}
}