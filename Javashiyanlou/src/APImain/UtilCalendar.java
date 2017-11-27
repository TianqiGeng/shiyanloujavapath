package APImain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class UtilCalendar {
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("完整显示日期时间:");
		DateFormat fdate=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=fdate.format(new Date());
		System.out.println(str);
		
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(new Date());
		
		System.out.println("年："+calendar.get(Calendar.YEAR));
		System.out.println("月："+calendar.get(Calendar.MONTH));
		System.out.println("分钟："+calendar.get(Calendar.MINUTE));
		System.out.println("今年的第："+calendar.get(Calendar.DAY_OF_YEAR)+"天");
		System.out.println("本月的第："+calendar.get(Calendar.DAY_OF_MONTH)+"天");
	//三小时后
		calendar.add(Calendar.HOUR_OF_DAY, 3);
		System.out.println("三小时以后的时间："+calendar.getTime());
		
	//格式化显示
		str=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(calendar.getTime());
		System.out.println(str);
	//还原当前时间
		calendar.setTime(new Date());
		str=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(calendar.getTime());
		System.out.println(str);
	
	//时间比较
		Calendar calendarNew=Calendar.getInstance();
		calendarNew.add(Calendar.HOUR, -5);
		System.out.println("时间比较:"+calendarNew.compareTo(calendar));
	}
}
