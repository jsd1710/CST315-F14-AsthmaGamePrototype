package User;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Helmet extends Gear
{
	Helmet()
	{
		name = "Fantasy Helmet";
		try
		{
			image = ImageIO.read(new File("src/Resources/Images/FantasyHelmet.jpg"));
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
