package APImain;

public class LangClass {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String objString=new String();
		Class objClass;
		objClass=objString.getClass();
		System.out.println("String对象的类型是：" +objClass.getName());
		objClass=Integer.class;
		System.out.println("String对象的类型是："+objClass.getName());
		objClass=Class.forName("java.lang.String");
		System.out.println("character对象的类型是:"+objClass.getName());
		objClass=objClass.getSuperclass();
		System.out.println("Character对象的父类是:"+objClass.getName());
	}

}
