package Basis;

public class InterfaceCat implements InterfaceAnimal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("aaaaaaaaaa");
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("bbbbbbb");
	}
	public static void main(String[] args){
		 InterfaceCat c=new  InterfaceCat();
		 c.eat();
		 c.travel();
	}

}
