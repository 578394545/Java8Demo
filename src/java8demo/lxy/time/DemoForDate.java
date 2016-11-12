package java8demo.lxy.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

/**
 * @Title: Demo1.java <br />
 * @Description: LocalDate应用 ,对日期的操作,默认日期格式：yyyy-MM-dd<br />
 * <br />
 * @author: Soar <br />
 */
public class DemoForDate {
	
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate birthDay = LocalDate.of(1991, 2, 26);
		
		DemoForDate demo = new DemoForDate();
//		demo.basic(today);
		
//      demo.birth(birthDay);
		
//		demo.equals(today,birthDay);
		
//		demo.monthDay(birthDay, today);
		
//		demo.plusDay(today);
		
//		demo.isBefore(today);
		
//		demo.yearDay();
		
//		demo.calculateDifference(today, birthDay);
		
	}
	
	/**
	 * @Description:基本用法<br />
	 * @param today 当天
	 */
	private void basic(LocalDate today){
		/**
		 * 获取本地当前日期
		 */
		
		System.out.println("Today`s : " + today);
		
		/**
		 * 获取当前的年月日
		 */
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		
		System.out.println("year : " + year);
		System.out.println("month : " + month);
		System.out.println("day : " + day);
		
	}

	/**
	 * @Description:创建日期<br />
	 * @param birthDay 生日
	 */
	private void setBirthDay(LocalDate birthDay){
		
		System.out.println(birthDay);
		
	}
	
	/**
	 * @Description 比较两个日期<br />
	 * @param today 当天
	 * @param birthDay 生日
	 */
	private void equals(LocalDate today, LocalDate birthDay){
		if( birthDay.equals(today) ){
			System.out.println("今天是你的生日!");
		}else{
			System.out.println("今天不是你的生日!");
		}
	}

	/**
	 * @Description:检查重复事件,适用于定期推送消息的业务，如账单日、纪念日等
	 * @param birthDay 生日
	 * @param today 当日
	 */
	private void monthDay (LocalDate birthDay,LocalDate today){
		MonthDay dayOfBirth = MonthDay.of(birthDay.getMonth(), birthDay.getDayOfMonth());//设定需要检查的日期
		MonthDay currentMonthDay = MonthDay.from(today);
		if(currentMonthDay.equals(dayOfBirth)){
			System.out.println("今天是你的生日!");
		}else{
			System.out.println("今天不是你的生日!");
		}
	}

	/**
	 * @Description:检查到期时间
	 */
	private void yearDay (){
		YearMonth currentYearMonth = YearMonth.now();
		System.out.println("本月天数 " + currentYearMonth + " : " + currentYearMonth.lengthOfMonth());
		YearMonth creditCardExpiry = YearMonth.of(2018, Month.FEBRUARY);
		System.out.println("到期日 ： "+ creditCardExpiry);
	}
	/**
	 * @Description:添加天数
	 * @param today 当日
	 */
	private void plusDay(LocalDate today){
		LocalDate nextWeek = today.plus(1,ChronoUnit.WEEKS);
		System.out.println("今天是 : " + today); 
		System.out.println("一周后 : " + nextWeek); 
	}

	/**
	 * @Description:判断某个日期是在另一个日期的前面还是后面，或者正好相等
	 * @param today 当日
	 */
	private void isBefore(LocalDate today){
		LocalDate tomorrow = LocalDate.of(2016, 9, 13);
		if(today.isBefore(tomorrow)){
			System.out.println("今天是明天的昨天");
		}
		LocalDate yesterday = today.minus(1,ChronoUnit.DAYS);
		if(today.isAfter(yesterday)){
			System.out.println("今天是昨天的明天");
		}
	}

	/**
	 * @Description:计算两个日期之间相差天数、月数等
	 * @param today 当天
	 * @param birth 生日
	 */
	private void calculateDifference(LocalDate today, LocalDate birth){
		Period result = Period.between(birth, today);
		System.out.println("我已经活了 ： " + result.getYears() + " 年");
	}
}
