package APImain;

public class LangClass {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String objString=new String();
		Class objClass;
		objClass=objString.getClass();
		System.out.println("String����������ǣ�" +objClass.getName());
		objClass=Integer.class;
		System.out.println("String����������ǣ�"+objClass.getName());
		objClass=Class.forName("java.lang.String");
		System.out.println("character�����������:"+objClass.getName());
		objClass=objClass.getSuperclass();
		System.out.println("Character����ĸ�����:"+objClass.getName());
	}

}
