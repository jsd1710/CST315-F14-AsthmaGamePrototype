package User;

import javax.swing.ImageIcon;

public abstract class Gear 
{
	String name;
	ImageIcon image;
	
	abstract public ImageIcon getImage();
	abstract public String getName();
}
