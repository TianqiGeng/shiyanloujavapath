package Design;

public class AFoodaholic {
	public void eat(AKitchenFactory k){
		System.out.println(
		"A foodaholic is eating "+k.getFood().getFoodName()+" with "
		+k.getTableWare().getToolName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AFoodaholic a=new AFoodaholic();
		AKitchenFactory kf=new AKitchen();
		a.eat(kf);
	}

}
