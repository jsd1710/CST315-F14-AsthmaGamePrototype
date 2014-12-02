package mainMenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Map.Entry;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Store.StoreItem;
import User.Head;
import User.Inventory;


public class ItemsScreen extends ActiveScreen 
{
	JPanel itemsBackground;
	JPanel ownedItemsBackground;
	
	//Buttons used for selecting what items to load
	JButton headButton;
	JButton bodyButton;
	JButton legsButton;
	JButton glovesButton;
	JButton shoesButton;
	JButton itemButton;
	JButton powerButton;
	
	JButton headPanel;
	JButton glovesPanel;
	JButton bodyPanel;
	JButton itemsPanel;
	JButton legsPanel;
	JButton shoesPanel;
	
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
		ownedItemsBackground.setSize(350,540);
		ownedItemsBackground.setLocation(0,0);
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
		
		this.add(ownedItemsBackground);
		this.add(itemsBackground);
		drawEquippedHeadSpace();
		drawEquippedBodySpace();
		drawEquippedGlovesSpace();
		drawEquippedItemsSpace();
		drawEquippedLegsSpace();
		drawEquippedShoesSpace();
	}
	
	void drawEquippedHeadSpace()
	{
		headPanel.removeAll();
		ImageIcon headImage = frame.user.inventory.equippedHelmet.getImage();
		
		headPanel.add(new JLabel(headImage));
		this.repaint();
		this.setVisible(true);
	}
	
	void drawEquippedBodySpace()
	{
		bodyPanel.removeAll();
		ImageIcon bodyImage = frame.user.inventory.equippedBody.getImage();
		
		bodyPanel.add(new JLabel(bodyImage));
		this.repaint();
		this.setVisible(true);
	}
	void drawEquippedGlovesSpace()
	{
		glovesPanel.removeAll();
		ImageIcon glovesImage = frame.user.inventory.equippedGloves.getImage();
		
		glovesPanel.add(new JLabel(glovesImage));
		this.repaint();
		this.setVisible(true);
	}
	void drawEquippedItemsSpace()
	{
		itemsPanel.removeAll();
		ImageIcon itemsImage = frame.user.inventory.equippedItems.getImage();
		
		itemsPanel.add(new JLabel(itemsImage));
		this.repaint();
		this.setVisible(true);
	}
	void drawEquippedLegsSpace()
	{
		legsPanel.removeAll();
		ImageIcon legsImage = frame.user.inventory.equippedLegs.getImage();
		
		legsPanel.add(new JLabel(legsImage));
		this.repaint();
		this.setVisible(true);
	}
	void drawEquippedShoesSpace()
	{
		shoesPanel.removeAll();
		ImageIcon shoesImage = frame.user.inventory.equippedShoes.getImage();
		
		shoesPanel.add(new JLabel(shoesImage));
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
		if (action.equals("Head"))
		{
			this.drawHeadInventory();			
		}			
		else if (action.equals("Body"))
		{
			this.drawBodyInventory();
		}	
		
		else if (action.equals("Legs"))
		{
			this.drawLegInventory();
		}	
		
		else if (action.equals("Gloves"))
		{
			this.drawGloveInventory();
		}	
		
		else if (action.equals("Shoes"))
		{
			this.drawShoeInventory();
		}	
		
		else if (action.equals("Item"))
		{
			this.drawItemInventory();
		}	

	}
	
}
