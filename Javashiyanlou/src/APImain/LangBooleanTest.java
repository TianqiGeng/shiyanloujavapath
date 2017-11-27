package APImain;

public class LangBooleanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean a=new Boolean(true);
		System.out.println("a为"+a);
		
		Boolean b=new Boolean("true");
		Boolean c=new Boolean("ok");
		System.out.println("b为"+b);
		System.out.println("c为"+c);
		System.out.println("a的booleanValue()为"+a.booleanValue());
		System.out.println("a和b相等吗？"+a.equals(b));
		
	}

}
