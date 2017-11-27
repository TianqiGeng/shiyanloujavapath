package J2SE;

public class LThreadTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LThreadState state=new LThreadState();
		Thread thread=new Thread(state);
		System.out.println("Create new thread: "+thread.getState());

		thread.start();
		System.out.println("Start the thread: "+thread.getState());
		
		Thread.sleep(100);
		System.out.println("Waiting for a moment (time): " + thread.getState());
		
		Thread.sleep(1000);
		System.out.println("Waiting for a moment (time): " + thread.getState());
		
		state.notifyNow();
		System.out.println("Wake up the thread: "+thread.getState());
		
		Thread.sleep(1000);
		System.out.println("Terminate the thread: "+thread.getState());
	}

}
