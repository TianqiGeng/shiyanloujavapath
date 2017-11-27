package HelloJava8;

public class NewFeaturesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewFeaturesTest tester=new NewFeaturesTest();
		System.out.println();
		//带有类型声明的表达式
		MathOperation addition=(int a,int b)->a+b;
		//没有类型声明的表达式
		MathOperation subtraction=(a,b)->a+b;
		//带有大括号和return语句的表达式
		MathOperation multiplication=(int a,int b)->{return a*b;};
		//没有大括号和return语句的表达式
		MathOperation division=(int a,int b)->a/b;;
		//输出结果
		System.out.println("10+5="+tester.operate(10, 5, addition));
		System.out.println("10-5="+tester.operate(10, 5, subtraction));
		System.out.println("10*5="+tester.operate(10, 5, addition));
		System.out.println("10/5="+tester.operate(10, 5, addition));
	
		//没有括号的表达式
		GreetingService gg=message->
		System.out.println("Hello"+message);
		
		//有括号的表达式
		GreetingService g21=(message)->
		System.out.println("Hello"+message);
         // 调用sayMessage方法输出结果
         gg.sayMessage("Shiyanlou");
         g21.sayMessage("Classmate");
	}
	private int operate(int a,int b,MathOperation mathoperation){
		return mathoperation.operation(a,b);
	}
}
