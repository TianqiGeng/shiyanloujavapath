package J2SE;

public class LThread1 extends Thread{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("Hello!This is"+i);
		}
	}
}
