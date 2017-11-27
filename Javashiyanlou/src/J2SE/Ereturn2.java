package J2SE;

public class Ereturn2 {
	//先将return的值计算处理并且保存到内存，然后执行finally语句块，再返回
	//之前保存的return值
	private int test2(){
		int a=250;
		try{
			return a+=222;
		}catch(Exception e){
			System.out.println();
		}finally{
			System.out.println("Finally执行，a值为："+a);
			a=0;
			System.out.println("a=0的情况");
		}
		return 250;
	}

	public static void main(String[] args) {
		Ereturn2 t=new Ereturn2();
		System.out.println("方法返回(return)"+t.test2());
	}
}