package mainMenu;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class MapScreen extends ActiveScreen
{
	JPanel worldBar;
	JButton world1Button;
	JButton world2Button;
	JButton world3Button;
	JButton world4Button;
	JButton world5Button;
	JButton worldEndlessButton;
	
	MapScreen(MenuScreen frame)
	{
		this.frame = frame;
		initUI();
	}
	
	public void initUI()
	{
		this.setSize(650, 575);
		this.setLocation(150, 0);
		this.setBackground(Color.gray);
		this.setLayout(null);
		
		worldBar = new JPanel();
		worldBar.setSize(635, 25);
		worldBar.setLocation(5, 5);
		worldBar.setBackground(Color.black);
		
		worldBar.setLayout(new GridLayout(1,6,10,0));
		world1Button = new JButton("World 1");
		world2Button = new JButton("World 2");
		world3Button = new JButton("World 3");
		world4Button = new JButton("World 4");
		world5Button = new JButton("World 5");
		worldEndlessButton = new JButton("Endless");
		
		worldBar.add(world1Button);
		worldBar.add(world2Button);
		worldBar.add(world3Button);
		worldBar.add(world4Button);
		worldBar.add(world5Button);
		worldBar.add(worldEndlessButton);
		this.add(worldBar);
		this.createCurrencyBar();
	}
}
