package J2SE;

public enum EnumWeek {
	MONDAY("MON"),TUESDAY("TUES"),WEDNESDAY("WED"),THURSDAY("THUR"),
	FRIDAY("FRI"),SATURDAY("SAT"),SUNDAY("SUN");
	
	private String aabr;
	
	private EnumWeek(String aabr){
		this.aabr=aabr;
	}

	public String getAabr() {
		return aabr;
	}

	
	
	
}
