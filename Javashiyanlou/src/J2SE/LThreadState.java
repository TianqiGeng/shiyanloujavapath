package J2SE;

public class LThreadState implements Runnable {
	
	public synchronized void waitForAMonent() throws InterruptedException{
		wait(500);
	}
	
	public synchronized void waitForever() throws InterruptedException{
		wait();
		//不填入时间就意味着使当前线程永久等待，
        //只能等到其他线程调用notify()或notifyAll()方法才能唤醒
	}
	
	public synchronized void notifyNow() throws InterruptedException{
		notify();
	}
	
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			waitForAMonent();
			waitForever();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
