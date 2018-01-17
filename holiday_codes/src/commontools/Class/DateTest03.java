package commontools.Class;

import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;
public class DateTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df=DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.CHINA);
		System.out.println(df.format(new Date()));	//按中国格式显示日期时间
	}

}
