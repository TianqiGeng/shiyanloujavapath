package Basis;

public class Polymorphic1test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphic1Animal a =new Polymorphic1Animal();
		Polymorphic1Animal b=new Polymorphic1Dog();
		Polymorphic1Dog c=new Polymorphic1Dog();
		a.bark();
		b.bark();
		c.bark();
		c.dogType();
		
		
	}

}
