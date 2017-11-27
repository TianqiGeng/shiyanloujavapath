package Design;

public class SingleHunger {
	//¶öººÄ£Ê½
	private static final SingleHunger wife=new SingleHunger();
	private SingleHunger() {}
	public static SingleHunger getWife() {
		return wife;
	}
	
}
