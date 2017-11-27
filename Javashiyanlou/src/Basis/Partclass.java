package Basis;

public class Partclass {
	public void peopleInfo(){
		final String sex="man";
		class Student{
			String ID="2017929";
			public void print(){
				System.out.println("�����ⲿ��ķ����еĳ���sex:"+sex);
				System.out.println("�����ڲ����еı���ID"+ID);
			}
		}
		Student a=new Student();
		a.print();
	}
	public void peopleInfo(boolean b){
		if(b){
			final String sex="man";
			class Student{
				String ID="2017929";
				public void print(){
					System.out.println("�����ⲿ��ķ����еĳ���sex:"+sex);
					System.out.println("�����ڲ����еı���ID"+ID);
				}
			}
			Student a=new Student();
			a.print();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Partclass b=new Partclass();
		System.out.println("�����ڷ�����=========");
		b.peopleInfo();
		System.out.println("��������������:=======");
		b.peopleInfo(true);;
		
	}
}
