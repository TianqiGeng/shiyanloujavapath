package Design;

public class GeneralfactorymodelFactoryTest {

	public static void main(String[] args){
		//普通工厂模式
		/*GeneralfactorymodelHumanFactory a=new GeneralfactorymodelHumanFactory();
		GeneralfactorymodelHuman male=a.createHuman("female");
		male.eat();
		male.sleep();
		male.beat();*/
		//多个工厂模式
		/*GeneralfactorymodelHumanFactory a=new GeneralfactorymodelHumanFactory();
		GeneralfactorymodelHuman male=a.createMale();
		male.eat();
		male.sleep();
		male.beat();*/
		//静态工厂模式
		GeneralfactorymodelHuman male=GeneralfactorymodelHumanFactory.createMale();
		male.eat();
		male.sleep();
		male.beat();
		//
	}

}
