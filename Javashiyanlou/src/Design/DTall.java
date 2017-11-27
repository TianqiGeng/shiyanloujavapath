package Design;

public class DTall extends DGirlDecorator {
	private DGirl girl;
	
	public DTall(DGirl g) {
		this.girl = g;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return girl.getDescription()+"+is very tall";
	}

}
