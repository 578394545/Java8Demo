package java8demo.lxy.time;

import java.time.LocalDate;

/**
 * @Title: Demo1.java <br />
 * @Description: LocalDate应用 <br />
 * <br />
 * @author: lxy <br />
 */
public class Demo {
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		//demo.basic();
		
        //demo.birth();
		
		demo.equals();
	}
	
	
	/**
	 *@Description：基本用法<br />
	 */
	private void basic(){
		/**
		 * 获取本地当前日期
		 */
		LocalDate today = LocalDate.now();
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
	 *@Description：创建日期<br />
	 */
	private void birth(){
		
		LocalDate birth = LocalDate.of(1991, 2, 26);
		System.out.println(birth);
		
	}
	
	/**
	 *@Description：比较两个日期<br />
	 */
	private void equals(){
		LocalDate birth = LocalDate.of(1992, 2, 26);
		LocalDate today = LocalDate.now();
		if(birth.equals(today)){
			System.out.println("今天是你的生日!");
		}else{
			System.out.println("今天不是你的生日!");
		}
	}
}
