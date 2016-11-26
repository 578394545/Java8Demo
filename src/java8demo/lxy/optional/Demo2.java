package java8demo.lxy.optional;

import java.util.Optional;

public class Demo2 {
	
	public static void main(String[] args) {

		Optional<String> name = Optional.of("Soar");//调用工厂方法创建Optional实例
		System.out.println(name);
		
		Optional<String> someNull = Optional.of(null);//传入参数为null，抛出NullPointerException.
		System.out.println(someNull);
		
		
	}
}
