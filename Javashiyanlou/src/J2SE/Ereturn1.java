package J2SE;

public class Ereturn1 {
	public void test1(){
	try{
		System.out.println("Try statement block...");
		return;
	}catch(Exception e){
		System.out.println("Exception statement block...");
	}finally{
		System.out.println("在try语句中return再强大，也影响不了我finally语句块的继续执行");
	}
	}
	public static void main(String[] args) {
		Ereturn1 m=new Ereturn1();
		m.test1();
		
	}
}