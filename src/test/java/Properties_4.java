import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

public class Properties_4 
{
	public static void  main(String args[]) throws FileNotFoundException
	{
		FileReader file=new FileReader("db.properties");
		Properties propert=new Properties();
		try {
			propert.load(file);
		    }
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}

	