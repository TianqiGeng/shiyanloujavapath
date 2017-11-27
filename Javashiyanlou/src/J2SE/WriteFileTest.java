package J2SE;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try {
			String path="C:/Projects/JAVA/mm.txt";
			String content="shiyanlou";
			FileOutputStream file=new FileOutputStream(path);
			file.write(content.getBytes());
			file.close();
			System.out.println("File created successfully...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//BufferedWriter
		try {
			
			FileWriter fw=new FileWriter("C:/Projects/JAVA/bfFile.txt");
			BufferedWriter file=new BufferedWriter(fw);
			file.write("My First Buffered File.");
			file.newLine();
			file.flush();
			file.close();
		System.out.println("File created successfully...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
