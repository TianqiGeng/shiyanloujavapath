package Basis;

public class Encapsulation1 {
	private double height;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double heightt) {
			height = heightt;
		}
	
	
	public static void main(String[] args) {
		Encapsulation1 mm = new Encapsulation1();
		mm.setHeight(170.0);
		System.out.println(mm.getHeight());
		System.out.println();

	}
}




