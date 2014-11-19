package mainMenu;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class MapScreen extends ActiveScreen
{
	JButton world1Button;
	JButton world2Button;
	JButton world3Button;
	JButton world4Button;
	JButton world5Button;
	JButton worldEndlessButton;
	
	MapScreen()
	{
		initUI();
	}
	
	public void initUI()
	{
		this.setSize(635, 50);
		this.setLocation(155, 5);
		this.setBackground(Color.black);
		
		this.setLayout(new GridLayout(1,6,10,0));
		world1Button = new JButton("World 1");
		world2Button = new JButton("World 2");
		world3Button = new JButton("World 3");
		world4Button = new JButton("World 4");
		world5Button = new JButton("World 5");
		worldEndlessButton = new JButton("Endless");
		
		this.add(world1Button);
		this.add(world2Button);
		this.add(world3Button);
		this.add(world4Button);
		this.add(world5Button);
		this.add(worldEndlessButton);
	}
}
