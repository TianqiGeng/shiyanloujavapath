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
		CStudent st1=new CStudent("1","����");
		students.add(st1);
		CStudent temp=students.get(0);
		System.out.println("�����ѧ��:"+temp.id+":"+temp.name);
		
		CStudent st2=new CStudent("2","����");
		students.add(0, st2);
		CStudent temp2=students.get(0);
		System.out.println("�����ѧ��:"+temp2.id+":"+temp2.name);
		
		CStudent[] student={new CStudent("3","����"),new CStudent("4","����")};
		students.addAll(Arrays.asList(student));
		CStudent temp3=students.get(2);
		CStudent temp4=students.get(3);
		System.out.println("�����ѧ��"+temp3.id+":"+temp3.name);
		System.out.println("�����ѧ��"+temp4.id+":"+temp4.name);
		
		CStudent[] student2={new CStudent("5","����"),new CStudent("6","�԰�")};
		students.addAll(2,Arrays.asList(student2));
		CStudent temp5=students.get(2);
		CStudent temp6=students.get(3);
		System.out.println("�����ѧ��"+temp5.id+":"+temp3.name);
		System.out.println("�����ѧ��"+temp6.id+":"+temp3.name);
		
	}
	//��ȡListԪ��
	public void testGet(){
		int size=students.size();
				for(int i=0;i<size;i++){
					CStudent st=students.get(i);
					System.out.println("ѧ����"+st.id+":"+st.name);
				}
				
	}
	
	//������
	public void testIterator(){
		Iterator<CStudent> it=students.iterator();
		System.out.println("������ѧ����ͨ�����������ʣ�:");
		while(it.hasNext()){
			CStudent st=it.next();
			System.out.println("ѧ��"+st.id+":"+st.name);
		}
	}
	
	//ͨ��for each �������ʼ���Ԫ��
	public void testForEach(){
		System.out.println("������ѧ����ͨ��for each��:");
		for (CStudent obj:students){
			CStudent st=obj;
			System.out.println("ѧ��"+st.id+":"+st.name);
		}
	}
	
	//�޸�
	public void testModify(){
		students.set(4, new CStudent("3","���"));
	}
	
	//ɾ��
	public void testRemove(){
		CStudent st=students.get(0);
		System.out.println("����ѧ��:"+st.id+":"+st.name+",�Ҽ�����ɾ��");
		students.remove(st);
		System.out.println("�ɹ�ɾ����");
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
