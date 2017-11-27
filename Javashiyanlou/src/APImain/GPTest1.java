package APImain;

import java.util.ArrayList;
import java.util.List;

public class GPTest1 {
	public void GPTestDemo(List<?> s){
		for(Object obj:s){
			System.out.println("我的类型是"+obj.getClass().getName());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GPTest1 test=new GPTest1();
		GPDog a0=new GPDog();
		GPAnimal a1=new GPAnimal();
		List<GPAnimal> s=new ArrayList<GPAnimal>();
		s.add(a0);
		s.add(a1);
		test.GPTestDemo(s);
	}

}
