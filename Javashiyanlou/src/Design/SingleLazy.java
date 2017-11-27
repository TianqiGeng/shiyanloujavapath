package Design;

public class SingleLazy {
	//ÀÁººÄ£Ê½
	private static SingleLazy wife;
	private SingleLazy(){}
	public static SingleLazy getWife() {
		if(wife==null){
			wife=new SingleLazy();
		}
		return wife;
	}
	
	
}
