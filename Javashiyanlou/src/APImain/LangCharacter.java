package APImain;

public class LangCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		char[] values={'*','_','%','8','L','l'};
		for(count=0;count<values.length;count++){
			if(Character.isDigit(values[count])){
				System.out.println(values[count]+"是一个数字");
			}
			if(Character.isLetter(values[count])){
				System.out.println(values[count]+"是个字母");
			}
			if(Character.isUpperCase(values[count])){
				System.out.println(values[count]+"是大写形式");
			}
			if(Character.isLetter(values[count])){
				System.out.println(values[count]+"是小写形式");
			}
			if(Character.isLetter(values[count])){
				System.out.println(values[count]+"是Unicode标识符的第一个有效字符");
			}
		}
		char c=' ';
		System.out.println("字符c是空白字符吗？"+Character.isWhitespace(c));
	}

}
