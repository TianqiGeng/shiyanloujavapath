package Design;

public class AdapterPluginAdapter implements AdapterCn{
	private AdapterEn en;
	public AdapterPluginAdapter(AdapterEn enPlugin){
		this.en=enPlugin;
	}
	
	
	// 这是重点，适配器实现了英标的插头，然后重载国标的充电方法为英标的方法
	@Override
	public void chargeWith2Pins() {
		// TODO Auto-generated method stub
		en.chargeWith3Pins();
	}
	
}
