package mainMenu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Sidebar extends JPanel
{
	MenuScreen frame;
	
	JButton worldButton;
	JButton rewardsButton;
	JButton itemsButton;
	JButton storeButton;
	JButton statsButton;
	JButton settingsButton;
	JButton logOffButton;
	
	Dimension maxButtonDimension;
	
	Sidebar(MenuScreen frame)
	{
		this.frame = frame;
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
		
		worldButton.addActionListener(this.frame);
		rewardsButton.addActionListener(this.frame);
		itemsButton.addActionListener(this.frame);
		storeButton.addActionListener(this.frame);
		statsButton.addActionListener(this.frame);
		settingsButton.addActionListener(this.frame);
		logOffButton.addActionListener(this.frame);
	}
	
	
}
