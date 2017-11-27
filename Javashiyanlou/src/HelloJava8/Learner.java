package HelloJava8;

 interface Learner {
	default void print(){
		System.out.println("I am a learner.");
	}
}
