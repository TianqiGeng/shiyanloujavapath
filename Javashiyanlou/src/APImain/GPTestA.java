package APImain;

public class GPTestA {
	
	public<T,S extends T>T GPTestDemo(T t,S s){
		System.out.println("����T���ͣ��ҵ�������"+t.getClass().getName());
		System.out.println("����S���ͣ��ҵ�������"+s.getClass().getName());
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GPTestA test=new GPTestA();
		System.out.println("1");
		GPDog d=new GPDog();
		System.out.println("2");
		GPAnimal a0=new GPAnimal();
		System.out.println("3");
		GPAnimal a1=test.GPTestDemo(a0, d);
		System.out.println("��������a���ҵ�������"+a1.getClass().getName());
		
	}

}
