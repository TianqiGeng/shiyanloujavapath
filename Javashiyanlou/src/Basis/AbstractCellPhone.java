package Basis;

public class AbstractCellPhone extends AbstracTelephone {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("�ҿ��Դ�绰��");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("�ҿ��Է�����");
	}
	public static void main(String[] args){
		AbstractCellPhone cp=new AbstractCellPhone();
		cp.call();
		cp.message();
	}

}
