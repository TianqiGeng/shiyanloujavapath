package Design;

public class OVideoFans implements OObserver {
	private String name;
	
	public OVideoFans(String name) {
		this.name = name;
	}
	

	@Override
	public void update(OSubject s) {
		// TODO Auto-generated method stub
		System.out.println(this.name+",new videos are available!");
		System.out.println(s);
	}

}
