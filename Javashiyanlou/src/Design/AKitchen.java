package Design;

public class AKitchen implements AKitchenFactory {

	@Override
	public AFood getFood() {
		// TODO Auto-generated method stub
		return new AApple();
	}

	@Override
	public ATableware getTableWare() {
		// TODO Auto-generated method stub
		return new AKnife();
	}

}
