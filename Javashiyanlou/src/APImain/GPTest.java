package APImain;

public class GPTest<T> {
	private T ob;

	public GPTest(T ob) {
		super();
		this.ob = ob;
	}

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	public void showType(){
		System.out.println("T��ʵ�������ǣ�"+ob.getClass().getName());
	}
}
