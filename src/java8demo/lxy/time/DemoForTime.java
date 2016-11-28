package java8demo.lxy.time;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

/**
 * @Title: DemoForTime <br />
 * @Description: LocalDate应用,对时间的操作 ,时间格式:hh:mm:ss.nnn  这里的nnn是纳秒<br />
 * <br />
 * @author: Soar <br />
 */
public class DemoForTime {
	public static void main(String[] args) {
		DemoForTime demo = new DemoForTime();
		//demo.getTime();
		demo.plusHours();
	}
	
	/**
	 * @Description:获取当前时间(不包含日期)
	 */
	private void getTime(){
		LocalTime timeNow = LocalTime.now();
		System.out.println("现在的时间是 : " + timeNow);
	}
	
	/**
	 * @Description:增加时间里面的小时数
	 */
	private void plusHours(){
		LocalTime timeNow = LocalTime.now();
		LocalTime afterTime = timeNow.plusHours(2);
		System.out.println("两小时以后的时间是 : " + afterTime);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		System.out.println("当前时间：" + sdf.format(now));
		
		Date afterDate = new Date(now .getTime() + 2*60*60*1000);
		System.out.println(sdf.format(afterDate ));
		
		Calendar nowTime = Calendar.getInstance();
		nowTime.add(Calendar.HOUR, 2);
		System.out.println(sdf.format(nowTime.getTime()));
	}
	
}
