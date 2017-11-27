package J2SE;

public class Etrycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("i am try block.");
			Class<?> tempClass=Class.forName("");
			System.out.println("Bye!Try block.");
			
		}catch(ClassNotFoundException e){
			System.out.println("I an catch block.");
			e.printStackTrace();
			System.out.println("Goodbye!Catch block.");
		}finally{
			System.out.println("I am finally block.");
		}
	}

}
