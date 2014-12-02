package mainMenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.util.Map.Entry;


import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


import User.ArmorType;
import User.Head;


@SuppressWarnings("serial")
public class ItemsScreen extends ActiveScreen implements ActionListener
{	
	JPanel itemsBackground;
	JPanel ownedItemsBackground;
	//Buttons used for selecting what items to load	
	JButton headPanel;
	JButton glovesPanel;
	JButton bodyPanel;
	JButton itemsPanel;
	JButton legsPanel;
	
	JButton shoesPanel;
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

		ownedItemsBackground = new JPanel();
		ownedItemsBackground.setSize(itemsBackground.getX()-15,itemsBackground.getHeight());
		ownedItemsBackground.setLocation(10,5);
		ownedItemsBackground.setBackground(Color.gray);
		ownedItemsBackground.setLayout(new GridLayout(3, 3));
		
		headPanel = new JButton();
		headPanel.setSize(50, 50);
		headPanel.setLocation(itemsBackground.getWidth()/2-headPanel.getWidth()/2, (int) (itemsBackground.getHeight()*0.10));
		headPanel.setBackground(Color.white);
		headPanel.setLayout(new GridLayout(1,1));
		headPanel.setBorder(BorderFactory.createEmptyBorder());
		
		bodyPanel = new JButton();
		bodyPanel.setSize(75, 125);
		bodyPanel.setLocation(itemsBackground.getWidth()/2-bodyPanel.getWidth()/2, (int) (itemsBackground.getHeight()*0.10+headPanel.getHeight()+5));
		bodyPanel.setBackground(Color.white);
		bodyPanel.setLayout(new GridLayout(1,1));
		bodyPanel.setBorder(BorderFactory.createEmptyBorder());
		
		glovesPanel = new JButton();
		glovesPanel.setSize(75, 50);
		glovesPanel.setLocation(itemsBackground.getWidth()/2-bodyPanel.getWidth()/2-glovesPanel.getWidth()-5, (int) (itemsBackground.getHeight()*0.10+headPanel.getHeight()+5));
		glovesPanel.setBackground(Color.white);
		glovesPanel.setLayout(new GridLayout(1,1));
		glovesPanel.setBorder(BorderFactory.createEmptyBorder());
		
		itemsPanel = new JButton();
		itemsPanel.setSize(50, 75);
		itemsPanel.setLocation(itemsBackground.getWidth()/2+bodyPanel.getWidth()/2+5, (int) (itemsBackground.getHeight()*0.10+headPanel.getHeight()+5));
		itemsPanel.setBackground(Color.white);
		itemsPanel.setLayout(new GridLayout(1,1));
		itemsPanel.setBorder(BorderFactory.createEmptyBorder());
		
		legsPanel = new JButton();
		legsPanel.setSize(75, 100);
		legsPanel.setLocation(itemsBackground.getWidth()/2-legsPanel.getWidth()/2, (int) (bodyPanel.getY()+bodyPanel.getHeight()+5));
		legsPanel.setBackground(Color.white);
		legsPanel.setLayout(new GridLayout(1,1));
		legsPanel.setBorder(BorderFactory.createEmptyBorder());
		
		shoesPanel = new JButton();
		shoesPanel.setSize(100, 50);
		shoesPanel.setLocation(itemsBackground.getWidth()/2-shoesPanel.getWidth()/2, (int) (legsPanel.getY()+legsPanel.getHeight()+5));
		shoesPanel.setBackground(Color.white);
		shoesPanel.setLayout(new GridLayout(1,1));
		shoesPanel.setBorder(BorderFactory.createEmptyBorder());
		
		itemsBackground.add(headPanel);
		itemsBackground.add(bodyPanel);
		itemsBackground.add(glovesPanel);
		itemsBackground.add(itemsPanel);
		itemsBackground.add(legsPanel);
		itemsBackground.add(shoesPanel);

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
		
		this.add(ownedItemsBackground);
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
		switch (armorType)
		{		
		case Head:
			headButton.removeAll();
			ImageIcon headImage = frame.user.inventory.equippedHelmet.getImage();
			headButton.add(new JLabel(headImage));
			
		case Body:
			bodyButton.removeAll();
			ImageIcon bodyImage = frame.user.inventory.equippedBody.getImage();
			bodyButton.add(new JLabel(bodyImage));
			
		case Gloves:
			glovesButton.removeAll();
			ImageIcon glovesImage = frame.user.inventory.equippedGloves.getImage();
			glovesButton.add(new JLabel(glovesImage));
			
		case Items:
			itemsButton.removeAll();
			ImageIcon itemsImage = frame.user.inventory.equippedItems.getImage();
			itemsButton.add(new JLabel(itemsImage));
			
		case Legs:
			legsButton.removeAll();
			ImageIcon legsImage = frame.user.inventory.equippedLegs.getImage();
			legsButton.add(new JLabel(legsImage));
			
		case Shoes:
			shoesButton.removeAll();
			ImageIcon shoesImage = frame.user.inventory.equippedShoes.getImage();
			shoesButton.add(new JLabel(shoesImage));
			
		default:
		}
		
		this.repaint();
		this.setVisible(true);
	}
		
	void drawHeadInventory()
	{
		ownedItemsBackground.removeAll();
		for(Entry<String,Head> entry : frame.user.inventory.ownedHeadPieces.entrySet())
		{
			JButton button = new JButton();
			button.setLayout(new BorderLayout());
			JLabel label1 = new JLabel(entry.getValue().getName());
			button.add(BorderLayout.NORTH,label1);
			button.setToolTipText(entry.getValue().getName());
			//button.setIcon(entry.getValue().getImage(50,50));
		}
				
		ownedItemsBackground.repaint();
		
	}
	
	void drawBodyInventory()
	{
		ownedItemsBackground.removeAll();
		ownedItemsBackground.repaint();
	}
	
	void drawGloveInventory()
	{
		ownedItemsBackground.removeAll();
		ownedItemsBackground.repaint();
	}
	
	void drawLegInventory()
	{
		ownedItemsBackground.removeAll();
		ownedItemsBackground.repaint();
	}
	
	void drawShoeInventory()
	{
		ownedItemsBackground.removeAll();
		ownedItemsBackground.repaint();
	}

	
	void drawItemInventory()
	{
		ownedItemsBackground.removeAll();
		ownedItemsBackground.repaint();
	}

	public void actionPerformed(ActionEvent e) 
	{
		String action = e.getActionCommand();
		if (action.equals("Equip Head Slot"))
		{
			JTextArea textArea = new JTextArea(6, 25);
			textArea.setText("STUFFFFFFFF");
			textArea.setEditable(false);
			this.drawHeadInventory();			
			// wrap a scrollpane around it
			JScrollPane scrollPane = new JScrollPane(textArea);

			// display them in a message dialog
			JOptionPane.showMessageDialog(frame, scrollPane);
		}
		else if (action.equals("Equip Body Slot"))
		{
			System.out.println("STUFF");
			this.drawBodyInventory();
		}
		else if (action.equals("Equip Gloves Slot"))
		{
			System.out.println("STUFF");
			this.drawGloveInventory();
		}
		else if (action.equals("Equip Items Slot"))
		{
			System.out.println("STUFF");
			this.drawItemInventory();
		}
		else if (action.equals("Equip Legs Slot"))
		{
			System.out.println("STUFF");
			this.drawLegInventory();
		}
		else if (action.equals("Equip Shoes Slot"))
		{
			System.out.println("STUFF");
			this.drawShoeInventory();
		}
	}

}