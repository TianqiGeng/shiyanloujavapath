package APImain;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOTest {
	
	public void copy(InputStream in,OutputStream out) throws IOException{
		byte[] buf=new byte[4096];
		int len=in.read(buf);
		while(len!=-1){
			out.write(buf,0,len);
			len=in.read(buf);
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		IOTest b=new IOTest();
		System.out.println("ÇëÊäÈë×Ö·û:");
		b.copy(System.in, System.out);
	}

}
