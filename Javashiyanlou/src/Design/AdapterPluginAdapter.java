package Design;

public class AdapterPluginAdapter implements AdapterCn{
	private AdapterEn en;
	public AdapterPluginAdapter(AdapterEn enPlugin){
		this.en=enPlugin;
	}
	
	
	// �����ص㣬������ʵ����Ӣ��Ĳ�ͷ��Ȼ�����ع���ĳ�緽��ΪӢ��ķ���
	@Override
	public void chargeWith2Pins() {
		// TODO Auto-generated method stub
		en.chargeWith3Pins();
	}
	
}
