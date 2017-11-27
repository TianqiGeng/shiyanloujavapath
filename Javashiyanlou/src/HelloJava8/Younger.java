package HelloJava8;
interface Younger {
	default void print(){
		System.out.println("I am youger.");
	}
	static  void sayHi(){
		System.out.println("Young is capital.");
	}
}
