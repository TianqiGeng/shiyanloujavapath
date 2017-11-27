package J2SE;

public class EnumPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(EnumWeek week:EnumWeek.values()){
			System.out.println("The order of "+week+" is"+week.ordinal());
		
			System.out.println("Compare to MONDAY :"+week.compareTo(EnumWeek.MONDAY));
		
			System.out.println("Equal to MONDAY :"+week.equals(EnumWeek.MONDAY));
			
			System.out.println("Equal to MONDAY by==? "+(week==EnumWeek.MONDAY));
			
			System.out.println("Name :"+week.name());
			
			System.out.println("Abbreviation :"+week.getAabr());
			
			System.out.println("------------------------");
		}
	}

}
