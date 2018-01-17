package commontools.Class;
import java.text.SimpleDateFormat;
import java.util.*;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd EEEE");
													//设置日期格式
		cal.set(Calendar.DAY_OF_MONTH, 13);		//
		int n=1;
		while(n<=10){
			if(cal.get(Calendar.DAY_OF_WEEK)==Calendar.FRIDAY){//如果是星期五
				Date date=cal.getTime();
				System.out.println(sdf.format(date));	
						//按照格式打印黑色星期五（不管哪个月的十三日又恰逢星期五就叫"黑色星期五"）
				n++;
			}
			cal.add(Calendar.MONTH, 1);	//月份增加一个月
		}
	}

}
