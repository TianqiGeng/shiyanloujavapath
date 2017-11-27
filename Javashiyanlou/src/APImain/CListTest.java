package APImain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CListTest {
	public List<CStudent> students;

	public CListTest() {
		this.students =new ArrayList<CStudent>();
	}
	
	public void testAdd(){
		CStudent st1=new CStudent("1","张三");
		students.add(st1);
		CStudent temp=students.get(0);
		System.out.println("添加了学生:"+temp.id+":"+temp.name);
		
		CStudent st2=new CStudent("2","李四");
		students.add(0, st2);
		CStudent temp2=students.get(0);
		System.out.println("添加了学生:"+temp2.id+":"+temp2.name);
		
		CStudent[] student={new CStudent("3","王五"),new CStudent("4","马六")};
		students.addAll(Arrays.asList(student));
		CStudent temp3=students.get(2);
		CStudent temp4=students.get(3);
		System.out.println("添加了学生"+temp3.id+":"+temp3.name);
		System.out.println("添加了学生"+temp4.id+":"+temp4.name);
		
		CStudent[] student2={new CStudent("5","周七"),new CStudent("6","赵八")};
		students.addAll(2,Arrays.asList(student2));
		CStudent temp5=students.get(2);
		CStudent temp6=students.get(3);
		System.out.println("添加了学生"+temp5.id+":"+temp3.name);
		System.out.println("添加了学生"+temp6.id+":"+temp3.name);
		
	}
	//获取List元素
	public void testGet(){
		int size=students.size();
				for(int i=0;i<size;i++){
					CStudent st=students.get(i);
					System.out.println("学生："+st.id+":"+st.name);
				}
				
	}
	
	//迭代器
	public void testIterator(){
		Iterator<CStudent> it=students.iterator();
		System.out.println("如有下学生（通过迭代器访问）:");
		while(it.hasNext()){
			CStudent st=it.next();
			System.out.println("学生"+st.id+":"+st.name);
		}
	}
	
	//通过for each 方法访问集合元素
	public void testForEach(){
		System.out.println("有如下学生（通过for each）:");
		for (CStudent obj:students){
			CStudent st=obj;
			System.out.println("学生"+st.id+":"+st.name);
		}
	}
	
	//修改
	public void testModify(){
		students.set(4, new CStudent("3","吴酒"));
	}
	
	//删除
	public void testRemove(){
		CStudent st=students.get(0);
		System.out.println("我是学生:"+st.id+":"+st.name+",我即将被删除");
		students.remove(st);
		System.out.println("成功删除！");
		testForEach();
	}
	public static void main(String[] args) {
        CListTest lt = new CListTest();
        lt.testAdd();
        lt.testGet();
        lt.testIterator();
        lt.testForEach();
        lt.testModify();
        lt.testForEach();
        lt.testRemove();

    }
}
