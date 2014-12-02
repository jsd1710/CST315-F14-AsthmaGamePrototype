package User;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Items extends Gear
{
	Items()
	{
		name = "Demon Hunter Quiver";
		try
		{
			image = new ImageIcon(ImageIO.read(Image.class.getResource("/Resources/Images/Items/demonhunter_quiver.png")));
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
	Items(String name, ImageIcon image)
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
			Image newimg = img.getScaledInstance(50, 75,  java.awt.Image.SCALE_SMOOTH);  
			image = new ImageIcon(newimg); 
			
			return image;
		}
		else
		{
			System.out.println("USER HAS NO ITEMS EQUIPPED!");
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
			System.out.println("EQUIPPED ITEMS HAVE NOT BEEN GIVEN A NAME");
			return null;
		}
	}
}
