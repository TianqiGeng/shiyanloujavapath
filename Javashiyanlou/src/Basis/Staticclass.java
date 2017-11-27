package Basis;


public class Staticclass {
	private String name="LiLei";
	
	static String ID="dddddddddddddddddddd";
	
	public static class Student{
		String ID="2222222";
		public void stuInfo(){
			System.out.println("�����ⲿ���е�name:"+(new Staticclass().name));
			System.out.println("�����ⲿ���е�ID:"+Staticclass.ID);
			System.out.println("�����ڲ����е�ID:"+ID);
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student b=new Student();
		b.stuInfo();
	}

}
