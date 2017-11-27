package J2SE;

public class EnumGenericStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumGenericStack<String> stack=new EnumGenericStack<String>();
	
		System.out.println("Now add some words into stack");
		
		stack.push("sss");
		System.out.println("word-'sss' added.");
		stack.push("dddddd");
		System.out.println("word-'ddd' added.");
		
		System.out.println("NOW pop words from stack.");
		
		while(!stack.isEmpty()){
			String s=(String)stack.pop();
			System.out.println("word-"+s+"has been taken out.");
		}
	}

}
