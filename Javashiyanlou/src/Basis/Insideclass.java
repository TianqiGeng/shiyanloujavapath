package Basis;

public class Insideclass {
	private String name="lilei";
	
	public class Student{
		String ID="20170929";
		public void stuInfo(){
			System.out.println("�����ⲿ���е�name"+name);
			System.out.println("�����ڲ����е�ID"+ID);
		}
	}
	public static void main(String[] args) {
		Insideclass nn=new Insideclass();
		Student ss=nn.new Student();
		ss.stuInfo();
	}
}
