package J2SE;

public class EAriExceptionTest {
	//算术异常的情况
	//浮点数（无论是float还是double类型的浮点数）被0除，并不会引发算术异常。
	//具体说来，是操作系统为了保护应用软件而已经处理了该异常，不再抛出，最终运算结果是无穷大。
	public static void main(String[] args) {
		System.out.println("Example 1: -1.0/0=" + (-1.0/0));
		System.out.println("Example 2: +1.0/0=" + (+1.0/0));
		System.out.println("Example 3: -1/0=" + (-1/0));
		System.out.println("Example 4: +1/0=" + (-1/0));
	}
}
