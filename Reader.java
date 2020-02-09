import java.io.*;
import java.util.*;
	
public class Reader
{
	static int numCaptions = 23;
	static int images = 24; // each meme line has the file name, toptext position, bottomtext position
	static int[] indexStarts = { 0, 8, 12, 15, 18, 18, 20, 22};
	static int[] sizes = { 8, 4, 3, 3, 0, 2, 2, 2};
	public static String[] getCaption() throws IOException
	{
		Random generator = new Random();
		BufferedReader reader = new BufferedReader(new FileReader("topCaptions.in"));
		int temp = generator.nextInt(numCaptions);
		for(int i = 0; i < temp * 2 - 2; i++)
		{
			reader.readLine();
		}
		String[] returned = {reader.readLine(), reader.readLine()};
		reader.close();
		return returned;
	}
	
	public static String[] getImageName() throws IOException // also returns the indices in string form
	{
		Random generator = new Random();
		BufferedReader reader = new BufferedReader(new FileReader("images.in"));
		
		for(int i = 0; i < generator.nextInt(images) - 1; i++)
		{
			reader.readLine();
		}
		
		StringTokenizer st = new StringTokenizer(reader.readLine());
		String[] returned = {st.nextToken(), st.nextToken(), st.nextToken()};
		reader.close();
		return returned;
	}
	
	public static String[] getImageName(int index) throws IOException // also returns the indices in string form
	{
		Random generator = new Random();
		BufferedReader reader = new BufferedReader(new FileReader("images.in"));
		
		for(int i = 0; i < indexStarts[index - 1]; i++)
		{
			reader.readLine();
		}
		
		for(int i = 0; i < generator.nextInt(sizes[index - 1]); i++)
		{
			reader.readLine();
		}
		
		StringTokenizer st = new StringTokenizer(reader.readLine());
		String[] returned = {st.nextToken(), st.nextToken(), st.nextToken()};
		reader.close();
		return returned;
	}
}
