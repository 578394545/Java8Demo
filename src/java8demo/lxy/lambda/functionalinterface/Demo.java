package java8demo.lxy.lambda.functionalinterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/**
 * @Title: Demo <br />
 * @Description: 函数式接口demo，包含java7、java8的两种写法 <br />
 * 函数式接口定义：任何接口，如果只包含 唯一 一个抽象方法，那么它就是一个Functional Interface（函数式接口，简称FI）<br />
 * @author: Soar <br />
 */
public class Demo {
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple","pen","pineapple");
		/**
		 * java7写法
		 */
		words.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		});
		
		/**
		 * java8写法
		 */
		words.sort((o1,o2) -> Integer.compare(o1.length(), o2.length()));
	}
}
