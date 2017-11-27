package Design;

public class DTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DGirl g=new DAmericanGirl();
		System.out.println(g.getDescription());
		DGoldenHair g2=new DGoldenHair(g);
		System.out.println(g2.getDescription());
		DTall g3=new DTall(g2);
		System.out.println(g3.getDescription());
	}

}
