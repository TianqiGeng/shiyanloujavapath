package APImain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CSetTest {
	public List<CStudent> students;

	public CSetTest() {
		students=new ArrayList<CStudent>();
	}
	
	public void testAdd(){
		CStudent st1=new CStudent("1","张三");
		students.add(st1);
		
		CStudent st2=new CStudent("2","李四");
		students.add(st2);
		
		CStudent[] student={new CStudent("3","王五"),new CStudent("4","马六")};
		students.addAll(Arrays.asList(student));
		
		CStudent[] student2={new CStudent("5","周七"),new CStudent("6","赵八")};
		students.addAll(Arrays.asList(student2));
		
		
	}
	/*foreach*/
	public void testForEach() {
		System.out.println("有如下学生（通过for each）：");
		for(Object obj:students){
			CStudent st=(CStudent)obj;
			System.out.println("学生："+st.id+":"+st.name);
		}
	}
	public static void main(String[] args){
		CSetTest st=new CSetTest();
		st.testAdd();
		st.testForEach();
		CPD pd=new CPD("1","张老师");
		System.out.println("请："+pd.name+"选择小组成员！");
		
		Scanner console=new Scanner(System.in);
		
		for(int i=0;i<3;i++){
			System.out.println("请输入学生ID");
			String studentID=console.next();
			for(CStudent s:st.students){
				if(s.id.equals(studentID)){
					pd.students.add(s);
				}
			}
		}
		st.testForEachForSer(pd);
		console.close();
	}
	public void testForEachForSer(CPD pd){
		for(CStudent s:pd.students){
			System.out.println("选择了学生"+s.id+":"+s.name);
		}
	}
}
