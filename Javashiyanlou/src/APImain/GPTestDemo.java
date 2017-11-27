package APImain;

public class GPTestDemo {
	public static void main(String[] args){
		GPTest<Integer> intob=new GPTest<Integer>(88);
		intob.showType();
		int i=intob.getOb();
		System.out.println("value="+i);
		System.out.println("------------------");
		
		GPTest<String> strob=new GPTest<String>("Hello Geng!");
		strob.showType();
		String s=strob.getOb();
		System.out.println("value="+s);
	}
}
