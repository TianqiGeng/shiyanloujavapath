package Design;

public class GeneralfactorymodelFactoryTest {

	public static void main(String[] args){
		//��ͨ����ģʽ
		/*GeneralfactorymodelHumanFactory a=new GeneralfactorymodelHumanFactory();
		GeneralfactorymodelHuman male=a.createHuman("female");
		male.eat();
		male.sleep();
		male.beat();*/
		//�������ģʽ
		/*GeneralfactorymodelHumanFactory a=new GeneralfactorymodelHumanFactory();
		GeneralfactorymodelHuman male=a.createMale();
		male.eat();
		male.sleep();
		male.beat();*/
		//��̬����ģʽ
		GeneralfactorymodelHuman male=GeneralfactorymodelHumanFactory.createMale();
		male.eat();
		male.sleep();
		male.beat();
		//
	}

}
