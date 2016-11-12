package java8demo.lxy.time;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @Title: Clock <br />
 * @Description: Java 8中自带了一个Clock类，你可以用它来获取某个时区下当前的瞬时时间，日期或者时间 <br />
 * <br />
 * @author: Soar <br />
 */
public class DemoForClock {

	
	public static void main(String[] args) {
		Clock clock = Clock.systemUTC();
		System.out.println("clock : " + clock);
		
		Clock.systemDefaultZone();
		System.out.println("clock : " + clock);
		
		LocalDate today = LocalDate.now(clock);
		System.out.println("today : " + today);
		
		LocalTime time = LocalTime.now(clock);
		System.out.println("time : " + time);
	}
	
}
