package Design;

public class AdapterCnTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdapterCn cnPlugin=new AdapterCnplugin();
		AdapterHome home=new AdapterHome(cnPlugin);
		home.charge();
	}

}	
