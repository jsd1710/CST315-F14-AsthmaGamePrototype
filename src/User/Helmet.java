package User;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Helmet extends Gear
{
	Helmet()
	{
		name = "Fantasy Helmet";
		try
		{
			image = new ImageIcon(ImageIO.read(new File("src/Resources/Images/FantasyHelmet.jpg")));
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
	Helmet(String name, ImageIcon image)
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
			Image newimg = img.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);  
			image = new ImageIcon(newimg); 
			
			return image;
		}
		else
		{
			System.out.println("USER HAS NO HELMET EQUIPPED!");
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
			System.out.println("EQUIPPED HELMET HAS NOT BEEN GIVEN A NAME");
			return null;
		}
	}
}
