package APImain;

import java.io.File;
import java.io.IOException;

public class IOFileDemo {
	public static void main(String[] args){
		File f1=new File("C:/Projects/JAVA/1.txt");
		File f2=new File("C:/Projects/JAVA","7.txt");
		File f3=new File("C:/Projects"+File.separator+"JAVA");
		File f4=new File(f3,"8.txt");
		
		try {
			System.out.println(f1+"f1");
			System.out.println(f2.createNewFile()+"f2.createNewFile()");
			System.out.println(f3.delete()+"f3.delete()");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File[] files=File.listRoots();
		for(File file:files){
			System.out.println(file);
			if(file.length()>0){
				String[] filenames=file.list();
				for(String filename:filenames){
					System.out.println(filename);
				}
			}
		}
	}
}
