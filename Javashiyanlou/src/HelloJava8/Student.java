package HelloJava8;

public class Student implements Younger,Learner{
	public void print(){
		Younger.super.print();
		Learner.super.print();
		Younger.sayHi();
		System.out.println("I am a Student");
	}
}
