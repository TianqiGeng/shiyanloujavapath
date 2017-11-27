package Design;

public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdapterEn en=new AdapterEnplugin();
		AdapterHome home=new AdapterHome();
		AdapterPluginAdapter p=new AdapterPluginAdapter(en);
		p.chargeWith2Pins();
	}

}
