package User;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Shoes extends Gear
{
	public Shoes()
	{
		name = "EMPTY SHOES";
		try
		{
			image = new ImageIcon(ImageIO.read(Image.class.getResource("/Resources/Images/EMPTY.png")));
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public Shoes(String name, ImageIcon image)
	{
		this.name = name;
		this.image = image;
	}

	@Override
	public ImageIcon getImage() 
	{
		if (image != null)
		{
			//Convert to 50x50 Icon
			Image img = image.getImage();  
			Image newimg = img.getScaledInstance(100, 50,  java.awt.Image.SCALE_SMOOTH);  
			image = new ImageIcon(newimg); 
			
			return image;
		}
		else
		{
			System.out.println("USER HAS NO LEG PIECE EQUIPPED!");
			return null;
		}
	}

	@Override
	public String getName() 
	{
		if (name != null)
		{
			return name;
		}
		else
		{
			System.out.println("EQUIPPED LEG PIECE HAS NOT BEEN GIVEN A NAME");
			return null;
		}
	}
}
