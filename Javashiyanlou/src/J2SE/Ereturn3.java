package J2SE;

public class Ereturn3 {
	public int test3(){
		try{
			return 520;
		}catch(Exception e){
			System.out.println();
		}finally{
			return 5820;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ereturn3 m=new Ereturn3();
		System.out.println("方法返回return:"+m.test3());
	}
	//return直接返回finally的值，try里面那个放弃使用 
}
