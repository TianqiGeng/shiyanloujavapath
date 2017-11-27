package APImain;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CMapTest {
	public Map<String,CCourse> courses;

	public CMapTest() {
		this.courses = new HashMap<String,CCourse>();
	}
	
	public void testPut(){
		Scanner console=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("������γ� ID��");
			String ID=console.next();
			CCourse cr=courses.get(ID);
			if(cr==null){
				System.out.println("������γ����ƣ�");
				String name=console.next();
				CCourse newCourse=new CCourse(ID,name);
				
				courses.put(ID,newCourse);
				System.out.println("�ɹ���ӿγ�"+courses.get(ID).name);
			}
			else{
				System.out.println("�ÿγ�ID�ѱ�ռ��");
				continue;
			}
		}
	}
	public void testKeySet(){
		Set<String> ketset=courses.keySet();
		for(String crID:ketset){
			CCourse cr=courses.get(crID);	
			if(cr!=null){
				System.out.println("�γ̣�"+cr.name);
			}
		}
	}
	public void testRemove(){
		Scanner console=new Scanner(System.in);
		while(true){
			System.out.println("������Ҫɾ���Ŀγ�ID��");
			String ID=console.next();
			CCourse cr=courses.get(ID);
			System.out.println(cr.id+cr.name+"mmmmmmmmmm");
			if(cr == null){
				System.out.println("��ID�����ڣ�");
				continue;
			}
			courses.remove(ID);
			System.out.println("�ɹ�ɾ���γ�"+cr.name);
			break;
		}
			
		}
		public void testEntrySet(){
			Set<Entry<String,CCourse>> entrySet=courses.entrySet();
			for(Entry<String,CCourse> entry:entrySet){
				System.out.println("ȡ�ü�"+entry.getKey());
				System.out.println("��Ӧ��ֵΪ��"+entry.getValue().name);
			}
	}
		public void testModify(){
			System.out.println("������Ҫ�޸ĵĿγ�ID��");
			Scanner console=new Scanner(System.in);
			while(true){
				String crID=console.next();
				System.out.println("dwds"+crID+":crID");
				CCourse course=courses.get(crID);
				System.out.println(course.id+course.name+"dddddddd");
				if(course == null){
					System.out.println("��ID�����ڣ����������룡");
					continue;
				}
				System.out.println("��ǰ�ÿγ�ID������Ӧ�Ŀγ�Ϊ��"+course.name);
				System.out.println("�������µĿγ����ƣ�");
				String name=console.next();
				CCourse newCourse=new CCourse(crID,name);
				courses.put(crID, newCourse);
				System.out.println("�޸ĳɹ���");
				break;
			}
		}
		public static void main(String[] args){
			CMapTest mt=new CMapTest();
			mt.testPut();
			mt.testKeySet();
			mt.testRemove();
			mt.testModify();
			mt.testEntrySet();
		}
}
