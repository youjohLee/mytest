package commontools.Class;

import java.util.Date;
import java.text.SimpleDateFormat;
public class DateTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d=new Date();
		String DateString=sdf.format(d);	//将Date对象输出为字符串
		System.out.println(DateString);
	}

}
