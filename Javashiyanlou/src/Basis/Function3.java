package Basis;

public class Function3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function3 fu=new Function3();
		fu.f(333);
		fu.f(333.33f);
		fu.f("dddd+ddd");
		fu.f("sdfs", "rrr");
		fu.f("fff", 33);
		
		
	}
	void f(int i){
		System.out.println("i="+i);
	}
	void f(float f){
		System.out.println("f="+f);
	}
	void f(String s){
		System.out.println("s="+s);
	}
	void f(String s1,String s2){
		System.out.println("s1+s2="+(s1+s2));
	}
	void f(String s,int i){
		System.out.println("s="+s+",i="+i);
	}
	
	
	

}
