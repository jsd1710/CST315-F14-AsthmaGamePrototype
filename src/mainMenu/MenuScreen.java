package mainMenu;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuScreen extends JFrame implements ActionListener
{
	Sidebar sidebar;
	ActiveScreen activeScreen;
	JPanel pane;
	GroupLayout gl;
	User.User user;
	
	MenuScreen() 
	{
		user = new User.User();
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
		sidebar.worldButton.setBackground(Color.gray);
		
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
			switchActiveScreen(new MapScreen(this));
			sidebar.worldButton.setBackground(Color.gray);
		}
		else if (action.equals("Rewards"))
		{
			switchActiveScreen(new RewardsScreen(this));
			sidebar.rewardsButton.setBackground(Color.gray);
		}
		else if (action.equals("Items"))
		{
			switchActiveScreen(new ItemsScreen(this));
			sidebar.itemsButton.setBackground(Color.gray);
		}
		else if (action.equals("Store"))
		{
			switchActiveScreen(new StoreScreen(this));
			sidebar.storeButton.setBackground(Color.gray);
		}
		else if (action.equals("Stats"))
		{
			switchActiveScreen(new StatsScreen(this));
			sidebar.statsButton.setBackground(Color.gray);
		}
		else if (action.equals("Settings"))
		{
			switchActiveScreen(new SettingsScreen(this));
			sidebar.settingsButton.setBackground(Color.gray);
		}
		else if (action.equals("Log Off"))
		{
			System.out.println("Log Off");
			sidebar.resetButtonColors();
			sidebar.logOffButton.setBackground(Color.gray);
		}
	}
	
	void switchActiveScreen(ActiveScreen switchToThis)
	{
		this.remove(activeScreen);
		activeScreen = switchToThis;
		this.add(activeScreen);
		activeScreen.repaint();
		this.setVisible(true);
		sidebar.resetButtonColors();
	}
}
