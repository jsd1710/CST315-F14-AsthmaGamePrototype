package Store;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class StoreItem 
{
	private String name;
	private int price;
	private ImageIcon image;
	
	public StoreItem()
	{
		name = null;
		price = 0;
		image = new ImageIcon();
	}
	
	public StoreItem(String name,int price,String path) throws IOException
	{
		this.name = name;
		this.price = price;
		this.image = new ImageIcon(ImageIO.read(Image.class.getResource(path)));
	}
		
	public StoreItem(int price,String path) throws IOException
	{
		 this.price = price;
		 this.image = new ImageIcon(ImageIO.read(Image.class.getResource(path)));
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return price;
	}
	
	public void setImage(String path) throws IOException
	{
		this.image = new ImageIcon(ImageIO.read(Image.class.getResource(path)));
	}
	
	public ImageIcon getImage(int width, int height)
	{
		Image img = image.getImage();  
		Image newimg = img.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);  
		image = new ImageIcon(newimg); 
		return image;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
}
