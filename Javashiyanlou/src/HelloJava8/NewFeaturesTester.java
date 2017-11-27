package HelloJava8;

public class NewFeaturesTester {
	final static String salutation="Hello";
	
	public static void main(String[] args) {
	
		GreetingService greetService1=message->
		System.out.println(salutation+message);
		greetService1.sayMessage("shiyanlou");
	}
}
