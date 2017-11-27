package APImain;

import java.util.Random;

public class UtilRandom {
	public static void main(String[] args){
	Random n=new Random();
	
	int a=n.nextInt(100);
	System.out.println(a);
	
	long b=n.nextLong();
	System.out.println(b);
	
	float c=n.nextFloat();
	System.out.println(c);
	
	Double d=n.nextDouble();
	System.out.println(d);
	
	}
}
