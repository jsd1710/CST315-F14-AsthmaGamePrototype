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
		sidebar = new Sidebar();
		activeScreen = new MapScreen();
		
		//Adding to content pane
		this.add(sidebar);
		this.add(activeScreen);
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
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}
}
