package Design;

public class SingleHunger {
	//����ģʽ
	private static final SingleHunger wife=new SingleHunger();
	private SingleHunger() {}
	public static SingleHunger getWife() {
		return wife;
	}
	
}
