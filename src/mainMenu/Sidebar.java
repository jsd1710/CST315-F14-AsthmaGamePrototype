package mainMenu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Sidebar extends JPanel implements ActionListener
{
	
	JButton worldButton;
	JButton rewardsButton;
	JButton itemsButton;
	JButton storeButton;
	JButton statsButton;
	JButton settingsButton;
	JButton logOffButton;
	
	Dimension maxButtonDimension;
	
	Sidebar()
	{
		initSidebar();
	}
	
	public void initSidebar()
	{
		//Sidebar panel settings
		this.setSize(150, 600);
		this.setLocation(0, 0);
		this.setBackground(Color.blue);
		this.setLayout(new GridLayout(10,1,0,10));
		
		maxButtonDimension = new Dimension();
		maxButtonDimension.width = this.getWidth();
		maxButtonDimension.height = 25;
		
		//Button initializations
		worldButton = new JButton("World");
		worldButton.setActionCommand("World");
		
		rewardsButton = new JButton("Rewards");
		rewardsButton.setActionCommand("Rewards");
		
		itemsButton = new JButton("Items");
		itemsButton.setActionCommand("Items");
		
		storeButton = new JButton("Store");
		storeButton.setActionCommand("Store");
		
		statsButton = new JButton("Stats");
		statsButton.setActionCommand("Stats");
		
		settingsButton = new JButton("Settings");
		settingsButton.setActionCommand("Settings");
		
		logOffButton = new JButton("Log Off");
		logOffButton.setActionCommand("Log Off");
		
		
		this.add(worldButton,BorderLayout.PAGE_START);
		this.add(rewardsButton,BorderLayout.PAGE_START);
		this.add(itemsButton,BorderLayout.PAGE_START);
		this.add(storeButton,BorderLayout.PAGE_START);
		this.add(statsButton,BorderLayout.PAGE_START);
		this.add(Box.createVerticalGlue());
		this.add(Box.createVerticalGlue());
		this.add(settingsButton,BorderLayout.PAGE_START);
		this.add(logOffButton,BorderLayout.PAGE_START);
		
		worldButton.addActionListener(this);
		rewardsButton.addActionListener(this);
		itemsButton.addActionListener(this);
		storeButton.addActionListener(this);
		statsButton.addActionListener(this);
		settingsButton.addActionListener(this);
		logOffButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String action = e.getActionCommand();
		
		if (action.equals("World"))
		{
			System.out.println("World");
			MenuScreen ms = (MenuScreen) this.getParent();
			ms.activeScreen = new MapScreen();
		}
		else if (action.equals("Rewards"))
		{
			System.out.println("Rewards");
		}
		else if (action.equals("Items"))
		{
			System.out.println("Items");
			try 
			{
				JFrame ms = (JFrame) SwingUtilities.getWindowAncestor(this);
				//ms.activeScreen = new ItemsScreen();
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
			
		}
		else if (action.equals("Store"))
		{
			System.out.println("Store");
		}
		else if (action.equals("Stats"))
		{
			System.out.println("Stats");
		}
		else if (action.equals("Settings"))
		{
			System.out.println("Settings");
		}
		else if (action.equals("Log Off"))
		{
			System.out.println("Log Off");
		}
	}
}
