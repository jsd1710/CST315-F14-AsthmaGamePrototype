package mainMenu;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class ItemsScreen extends ActiveScreen implements ActionListener
{
	JPanel itemsBackground;
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
		headButton.removeAll();
		ImageIcon headImage = frame.user.inventory.equippedHelmet.getImage();
		
		headButton.add(new JLabel(headImage));
		this.repaint();
		this.setVisible(true);
	}
	
	void drawEquippedBodySpace()
	{
		bodyButton.removeAll();
		ImageIcon bodyImage = frame.user.inventory.equippedBody.getImage();
		
		bodyButton.add(new JLabel(bodyImage));
		this.repaint();
		this.setVisible(true);
	}
	void drawEquippedGlovesSpace()
	{
		glovesButton.removeAll();
		ImageIcon glovesImage = frame.user.inventory.equippedGloves.getImage();
		
		glovesButton.add(new JLabel(glovesImage));
		this.repaint();
		this.setVisible(true);
	}
	void drawEquippedItemsSpace()
	{
		itemsButton.removeAll();
		ImageIcon itemsImage = frame.user.inventory.equippedItems.getImage();
		
		itemsButton.add(new JLabel(itemsImage));
		this.repaint();
		this.setVisible(true);
	}
	void drawEquippedLegsSpace()
	{
		legsButton.removeAll();
		ImageIcon legsImage = frame.user.inventory.equippedLegs.getImage();
		
		legsButton.add(new JLabel(legsImage));
		this.repaint();
		this.setVisible(true);
	}
	void drawEquippedShoesSpace()
	{
		shoesButton.removeAll();
		ImageIcon shoesImage = frame.user.inventory.equippedShoes.getImage();
		
		shoesButton.add(new JLabel(shoesImage));
		this.repaint();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String action = e.getActionCommand();
		if (action.equals("Equip Head Slot"))
		{
			JTextArea textArea = new JTextArea(6, 25);
			textArea.setText("STUFFFFFFFF");
			textArea.setEditable(false);

			// wrap a scrollpane around it
			JScrollPane scrollPane = new JScrollPane(textArea);

			// display them in a message dialog
			JOptionPane.showMessageDialog(frame, scrollPane);
		}
		else if (action.equals("Equip Body Slot"))
		{
			System.out.println("STUFF");
		}
		else if (action.equals("Equip Gloves Slot"))
		{
			System.out.println("STUFF");
		}
		else if (action.equals("Equip Items Slot"))
		{
			System.out.println("STUFF");
		}
		else if (action.equals("Equip Legs Slot"))
		{
			System.out.println("STUFF");
		}
		else if (action.equals("Equip Shoes Slot"))
		{
			System.out.println("STUFF");
		}
	}
}
