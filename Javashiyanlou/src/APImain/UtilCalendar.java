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
		System.out.println("������ʾ����ʱ��:");
		DateFormat fdate=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=fdate.format(new Date());
		System.out.println(str);
		
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(new Date());
		
		System.out.println("�꣺"+calendar.get(Calendar.YEAR));
		System.out.println("�£�"+calendar.get(Calendar.MONTH));
		System.out.println("���ӣ�"+calendar.get(Calendar.MINUTE));
		System.out.println("����ĵڣ�"+calendar.get(Calendar.DAY_OF_YEAR)+"��");
		System.out.println("���µĵڣ�"+calendar.get(Calendar.DAY_OF_MONTH)+"��");
	//��Сʱ��
		calendar.add(Calendar.HOUR_OF_DAY, 3);
		System.out.println("��Сʱ�Ժ��ʱ�䣺"+calendar.getTime());
		
	//��ʽ����ʾ
		str=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(calendar.getTime());
		System.out.println(str);
	//��ԭ��ǰʱ��
		calendar.setTime(new Date());
		str=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(calendar.getTime());
		System.out.println(str);
	
	//ʱ��Ƚ�
		Calendar calendarNew=Calendar.getInstance();
		calendarNew.add(Calendar.HOUR, -5);
		System.out.println("ʱ��Ƚ�:"+calendarNew.compareTo(calendar));
	}
}
