import java.io.*;
import java.util.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;


public class Drawer
{
	public static void main(String[] args) throws IOException
	{
		String[] captionStuff = Reader.getCaption();
		String[] imageStuff = Reader.getImageName(Integer.parseInt(captionStuff[1]));
		int size = Integer.parseInt(imageStuff[1]);
		BufferedImage meme = ImageIO.read(new File(imageStuff[0]));	
		Graphics2D g2d = meme.createGraphics();
		g2d.setColor(Color.black);
		Font f = new Font("meme", Font.BOLD, size);
		g2d.setFont(f);
		ArrayList<String> lines = new ArrayList<String>();
		for(int i = 0; i < captionStuff[0].length() - 1; i++)
		{
			if(captionStuff[0].substring(i, i + 2).equals("\\n"))
			{
				lines.add(captionStuff[0].substring(0, i));
				captionStuff[0] = captionStuff[0].substring(i + 2); // shoudln't crash since \n wouldn't be at the end
				i = 0;
			} else if (i == captionStuff[0].length() - 2)
			{
				lines.add(captionStuff[0]);
			}
		}

		int starterY = size;
		for(String l: lines)
		{
			g2d.drawString(l, 0, starterY);
			starterY += size + size / 3;
		}
		
		g2d.dispose();
		File file = new File("daMeme.png");
        ImageIO.write(meme, "png", file);
	}
}
