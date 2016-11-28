package java8demo.lxy.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Title: Demo2 <br />
 * @Description: 一些常用的stream方法 <br />
 * <br />
 * @author: Soar <br />
 */
public class Demo2 {
	
	public static void main(String[] args) {
		/**
		 * forEach 迭代流中的每个数据
		 */
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);//10个随机数
		
		System.out.println();
		
		/**
		 * map 方法用于映射每个元素到对应的结果;distinct 对于Stream中包含的元素进行去重操作（去重逻辑依赖元素的equals方法），新生成的Stream中没有重复的元素
		 */
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		// 获取对应的平方数
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		System.out.println(Arrays.asList(squaresList));
		
		System.out.println();
		
		/**
		 * filter 方法用于通过设置的条件过滤出元素
		 */
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		// 获取空字符串的数量
		long count = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println(count);
		
		/**
		 * 综合使用
		 */
		List<Integer> nums = Arrays.asList(1,1,null,2,3,4,null,5,6,7,8,9,10);
		System.out.println("sum is:"+nums.stream().filter(num -> num != null).distinct().
				mapToInt(num -> num * 2).
				peek(System.out::println).
				skip(2).limit(4).sum());

		Integer sum1 = Stream.of(1, 2, 3, 4).reduce(0, (a, b) -> a+b);

		Integer sum2 =Stream.of(1, 2, 3, 4).reduce(0,Integer::sum);
		System.out.println(sum1);
	}
}
