package APImain;

public class Stringo {
	public static void main(String[] args){
		String s0="abc";
		String s1=new String("abc");
		int len1=s0.length();
		int len2=s1.length();
		String s2="java";
		String s3="JAVA";
		System.out.println("equals+"+s2.equals(s3));
		System.out.println("equalsIgnore+"+s3.equalsIgnoreCase(s3));
	//使用"=="比较的是两个对象在内存中存储的地址是否一样
		boolean b=(s1==s0);
		System.out.println(b);
	//字符串的连接
		String s="Hello"+"world!";
		String ss=s0.concat(s);
		System.out.println(ss);
	//charAt()
		char c=s0.charAt(1);
		System.out.println(c);
	//字符串
		String sss="asdasdasdadddse";
		System.out.println(sss.indexOf('a'));
		System.out.println(sss.indexOf("da"));
		System.out.println(sss.lastIndexOf('d'));
		System.out.println(sss.substring(3));
		System.out.println(sss.substring(3, 6));
	//StringBuffer
		StringBuffer sm=new StringBuffer("I");
		sm.append(" java");
		sm.insert(1, " love");
		String t=sm.toString();
		System.out.println(t);
		
	}
	
}
