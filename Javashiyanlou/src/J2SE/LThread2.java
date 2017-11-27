package J2SE;

public class LThread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			System.out.println("Thanks!There is"+i);
		}
	}

}
