package J2SE;

public class LCreateThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
	    //继承Thread类并重写它的run()方法，然后用这个子类来创建对象并调用start()方法。
	    //通过定义一个类，实现Runnable接口，实现run()方法。

		LThread1 thread1=new LThread1();
		//这里再次用到了匿名内部类
		Thread thread2=new Thread(new LThread2());
		
		thread1.start();
		thread2.start();
		
	}

}
