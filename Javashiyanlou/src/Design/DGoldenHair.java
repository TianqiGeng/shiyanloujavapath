package Design;

public class DGoldenHair extends DGirlDecorator {
	private DGirl girl;
	
	public DGoldenHair(DGirl g) {
		this.girl = g;
	}

	public DGirl getGirl() {
		return girl;
	}

	public void setGirl(DGirl girl) {
		this.girl = girl;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return girl.getDescription()+"+with golden hair";
	}

}
