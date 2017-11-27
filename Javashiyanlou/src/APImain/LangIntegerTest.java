package APImain;

public class LangIntegerTest {
	public static void main(String[] args){
		Integer a=new Integer("10");
		Integer b=new Integer(11);
		
		System.out.println(a.compareTo(b));
		System.out.println(a.equals(b));
		
		float c=a.floatValue();
		System.out.println(c);
		
		String d="1010110";
		int e=Integer.parseInt(d,2);
		System.out.println(e);
	}
}
