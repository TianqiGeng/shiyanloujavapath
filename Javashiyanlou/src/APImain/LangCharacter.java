package APImain;

public class LangCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		char[] values={'*','_','%','8','L','l'};
		for(count=0;count<values.length;count++){
			if(Character.isDigit(values[count])){
				System.out.println(values[count]+"��һ������");
			}
			if(Character.isLetter(values[count])){
				System.out.println(values[count]+"�Ǹ���ĸ");
			}
			if(Character.isUpperCase(values[count])){
				System.out.println(values[count]+"�Ǵ�д��ʽ");
			}
			if(Character.isLetter(values[count])){
				System.out.println(values[count]+"��Сд��ʽ");
			}
			if(Character.isLetter(values[count])){
				System.out.println(values[count]+"��Unicode��ʶ���ĵ�һ����Ч�ַ�");
			}
		}
		char c=' ';
		System.out.println("�ַ�c�ǿհ��ַ���"+Character.isWhitespace(c));
	}

}
