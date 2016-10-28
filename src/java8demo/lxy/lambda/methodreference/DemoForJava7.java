package java8demo.lxy.lambda.methodreference;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @Title: DemoForJava7 <br />
 * @Description: 按年龄排序、java7写法。注：因使用LocalDate类，故无法在Java7环境下测试 <br />
 * <br />
 * @author: Soar <br />
 */
public class DemoForJava7 {
	/**
	 * @Title: PersionAgeComparator <br />
	 * @Description: 实现Comparator接口 <br />
	 * <br />
	 * @author: Soar <br />
	 */
	static class PersonAgeComparator implements Comparator<Person>{

		@Override
		public int compare(Person a, Person b) {
			return a.getBirthday().compareTo(b.getBirthday());
		}
	}
	
	public static void main(String[] args) {
		Person[] pArr = new Person[]{
        new Person("003", LocalDate.of(2016,9,1)),
        new Person("001", LocalDate.of(2016,2,1)),
        new Person("002", LocalDate.of(2016,3,1)),
        new Person("004", LocalDate.of(2016,12,1))};

	    Arrays.sort(pArr, new PersonAgeComparator());
	    
	    System.out.println(Arrays.asList(pArr));
	    
	}
}
