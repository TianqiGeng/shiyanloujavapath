package APImain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try {
			File inFile=new File("C:/Users/TianQiGeng/Desktop/pic/test.pptx");
			File outFile=new File("C:/Users/TianQiGeng/Desktop/pic/test.txt");
			
			FileInputStream fis=new FileInputStream(inFile);
			FileOutputStream fos=new FileOutputStream(outFile);
			int c;
			while((c=fis.read())!=-1){
				fos.write(c);
			}
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("FileStreamsTest:"+e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("FileStreamTest:"+e);
		}
		
	}

}
