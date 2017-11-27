package Design;

public class AdapterHome {
	private AdapterCn cnPlugin;
	
	public AdapterHome(){}
	
	public AdapterHome(AdapterCn cnPlugin){
		this.cnPlugin=cnPlugin;
	}
	
	public AdapterCn getCnPlugin() {
		return cnPlugin;
	}
	public void setCnPlugin(AdapterCn cnPlugin) {
		this.cnPlugin = cnPlugin;
	}
	//¹ú¼Ê³äµç
	public void charge(){
		cnPlugin.chargeWith2Pins();
	}
}
