package Design;

public class GeneralfactorymodelHumanFactory {
	//��ͨ����ģʽ
	/*public GeneralfactorymodelHuman createHuman(String gender){
        if( gender.equals("male") ){
           return new GeneralfactorymodelMale();
        }else if( gender.equals("female")){
           return new GeneralfactorymodelFemale();
        }else {
            System.out.println("��������ȷ�����ͣ�");
            return null;
        }
    }*/
	//�������ģʽ
	/*public GeneralfactorymodelMale createMale(){
		return new GeneralfactorymodelMale();
	}
	public GeneralfactorymodelFemale createFemale(){
		return new GeneralfactorymodelFemale();
}*/
	//��̬����ģʽ
	public static GeneralfactorymodelMale createMale(){
		return new GeneralfactorymodelMale();
	}
	public static GeneralfactorymodelFemale createFemale(){
		return new GeneralfactorymodelFemale();
	}
}
