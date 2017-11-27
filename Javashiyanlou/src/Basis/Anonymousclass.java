package Basis;

public class Anonymousclass {
	
	public Inner getInner(final String name,String city){
	  return new Inner(){
		private String nameStr=name;
		public String getName(){
			return nameStr;
		}
		};
	}
	interface Inner{
		String getName();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymousclass mm=new Anonymousclass();
		Inner inner=mm.getInner("Inner", "NewYork");
		System.out.println(inner.getName());
	}

}
