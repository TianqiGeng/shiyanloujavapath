package Design;

public class GeneralfactorymodelHumanFactory {
	//普通工厂模式
	/*public GeneralfactorymodelHuman createHuman(String gender){
        if( gender.equals("male") ){
           return new GeneralfactorymodelMale();
        }else if( gender.equals("female")){
           return new GeneralfactorymodelFemale();
        }else {
            System.out.println("请输入正确的类型！");
            return null;
        }
    }*/
	//多个工厂模式
	/*public GeneralfactorymodelMale createMale(){
		return new GeneralfactorymodelMale();
	}
	public GeneralfactorymodelFemale createFemale(){
		return new GeneralfactorymodelFemale();
}*/
	//静态工厂模式
	public static GeneralfactorymodelMale createMale(){
		return new GeneralfactorymodelMale();
	}
	public static GeneralfactorymodelFemale createFemale(){
		return new GeneralfactorymodelFemale();
	}
}
