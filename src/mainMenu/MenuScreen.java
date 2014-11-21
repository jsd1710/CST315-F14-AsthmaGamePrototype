package mainMenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuScreen extends JFrame implements ActionListener
{
	JPanel sidebar;
	ActiveScreen activeScreen;
	JPanel pane;
	GroupLayout gl;
	
	MenuScreen() 
	{
		initUI();
	}
	
	public void initUI()
	{
		pane = (JPanel) getContentPane();
		gl = new GroupLayout(pane);
		pane.setLayout(gl);
		
		//Content pane (Frame) settings
		setTitle("Asthma Game Mockup");
		setSize(800, 600);
		setLocationRelativeTo(null);
		this.setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Screen modules
		sidebar = new Sidebar(this);
		activeScreen = new MapScreen(this);
		
		//Adding to content pane
		this.add(sidebar);
		this.add(activeScreen);
		this.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Game started");
		
		EventQueue.invokeLater(new Runnable() 
		{
            @Override
            public void run() 
            {
                MenuScreen ex = new MenuScreen();
                ex.setVisible(true);
            }
        });
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String action = e.getActionCommand();
		
		if (action.equals("World"))
		{
			this.remove(activeScreen);
			activeScreen = new MapScreen(this);
			this.add(activeScreen);
			activeScreen.repaint();
			this.setVisible(true);
		}
		else if (action.equals("Rewards"))
		{
			System.out.println("Rewards");
		}
		else if (action.equals("Items"))
		{
			this.remove(activeScreen);
			activeScreen = new ItemsScreen(this);
			this.add(activeScreen);
			activeScreen.repaint();
			this.setVisible(true);
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
