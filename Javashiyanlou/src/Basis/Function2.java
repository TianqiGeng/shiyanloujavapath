package Basis;

public class Function2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function2 gg=new Function2();
		double rAve;
		int a=78;
		int b=99;
		rAve=gg.calcAve(a, b);
		System.out.print("ƽ����"+rAve);
	}
	public double calcAve(int a,int b){
		double ave=(a+b)/2;
		return ave;
	}
}
