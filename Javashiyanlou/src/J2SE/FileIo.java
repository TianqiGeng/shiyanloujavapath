package J2SE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				FileInputStream file=new FileInputStream("C:/Projects/JAVA/test.txt");
				int data=0;
				while((data=file.read())!=-1){
					System.out.println(data);
				}
				file.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	//1:BufferedInpoutStream读取文件
	//BufferedInputStream file=new BufferedInputStream(new FileInputStream("文件的路径"));
	
	//2:字节改字符
	//1FileReader file=new FileReader("地址");
	//2int data=0;
	//3while((data=file.read())!=-1){
	//System.out.print((char)data);}file.close();
	
	//3:
	//BufferedReader file=new BufferedReader(new FileReader("路径"));
	//while(readLine()==null) 
}
