package APImain;

public class LangBooleanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean a=new Boolean(true);
		System.out.println("aΪ"+a);
		
		Boolean b=new Boolean("true");
		Boolean c=new Boolean("ok");
		System.out.println("bΪ"+b);
		System.out.println("cΪ"+c);
		System.out.println("a��booleanValue()Ϊ"+a.booleanValue());
		System.out.println("a��b�����"+a.equals(b));
		
	}

}
