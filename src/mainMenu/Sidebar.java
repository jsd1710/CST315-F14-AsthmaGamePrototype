package mainMenu;

import java.awt.*;

import javax.swing.*;

public class Sidebar extends JPanel
{
	MenuScreen frame;
	Color normalButtonColor;
	
	public JButton worldButton;
	public JButton rewardsButton;
	public JButton itemsButton;
	public JButton storeButton;
	public JButton statsButton;
	public JButton settingsButton;
	public JButton logOffButton;
	
	Dimension maxButtonDimension;
	
	Sidebar(MenuScreen frame)
	{
		this.frame = frame;
		initSidebar();
	}
	
	public void initSidebar()
	{
		//Sidebar panel settings
		this.setSize(150, 575);
		this.setLocation(0, 0);
		this.setBackground(Color.blue);
		this.setLayout(new GridLayout(10,1,0,10));
		
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
		
		normalButtonColor = worldButton.getBackground();
		
		this.add(worldButton,BorderLayout.PAGE_START);
		this.add(rewardsButton,BorderLayout.PAGE_START);
		this.add(itemsButton,BorderLayout.PAGE_START);
		this.add(storeButton,BorderLayout.PAGE_START);
		this.add(statsButton,BorderLayout.PAGE_START);
		this.add(Box.createVerticalGlue());
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
	
	void resetButtonColors()
	{
		if (worldButton.getBackground() == Color.gray)
		{
			worldButton.setBackground(normalButtonColor);
		}
		else if (rewardsButton.getBackground() == Color.gray)
		{
			rewardsButton.setBackground(normalButtonColor);
		}
		else if (itemsButton.getBackground() == Color.gray)
		{
			itemsButton.setBackground(normalButtonColor);
		}
		else if (storeButton.getBackground() == Color.gray)
		{
			storeButton.setBackground(normalButtonColor);
		}
		else if (statsButton.getBackground() == Color.gray)
		{
			statsButton.setBackground(normalButtonColor);
		}
		else if (settingsButton.getBackground() == Color.gray)
		{
			settingsButton.setBackground(normalButtonColor);
		}
		else if (logOffButton.getBackground() == Color.gray)
		{
			logOffButton.setBackground(normalButtonColor);
		}
	}
}
