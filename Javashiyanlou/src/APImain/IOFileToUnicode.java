package APImain;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOFileToUnicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				try {
				FileInputStream	fis = new FileInputStream("C:/Projects/JAVA/nihsahdeu.txt");
				InputStreamReader dis=new InputStreamReader(fis);
				BufferedReader reader=new BufferedReader(dis);
				String s;
				while((s=reader.readLine())!=null){
					System.out.println("read:"+s);
				}
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			
			}
	}

	}
