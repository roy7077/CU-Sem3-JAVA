// Java program to read content from one file
// and write it into another file

// Custom paths for this program
// Reading from - sagarInput.txt
// Writing to - sagarOutput.txt

// Importing input output classes
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Class
public class Main {

	public static void main(String[] args)
	{
		try {

			FileReader fr = new FileReader("sagarInput.txt");

			FileWriter fw = new FileWriter("sagarOutput.txt");
			String str = "";

			int i;
			while ((i = fr.read()) != -1) 
			{
				str += (char)i;
			}
			System.out.println(str);
			fw.write(str);

			fr.close();
			fw.close();

			System.out.println("File reading and writing both done");
		}

	
		catch (IOException e) 
		{

			System.out.println("There are some IOException");
		}
	}
}


