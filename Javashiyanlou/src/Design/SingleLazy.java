package Design;

public class SingleLazy {
	//����ģʽ
	private static SingleLazy wife;
	private SingleLazy(){}
	public static SingleLazy getWife() {
		if(wife==null){
			wife=new SingleLazy();
		}
		return wife;
	}
	
	
}
