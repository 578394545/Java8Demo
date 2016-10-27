package java8demo.lxy.lambda;

import java8demo.lxy.lambda.Demo1Interface.GreetingService;
import java8demo.lxy.lambda.Demo1Interface.MathOperation;

/**
 * @Title: Demo1ForJava8 <br />
 * @Description: 一个简单的计算器算法，使用java8完成，用来对比学习Lambda语法 <br />
 * <br />
 * @author: Soar <br />
 */
public class Demo1ForJava8 {
	
	public static void main(String[] args) {
		
		//带类型声明
		MathOperation addition = (int a, int b) -> a + b;
		
		//不带声明类型
		MathOperation subtraction = (a, b) -> a - b;
		
		// 大括号中的返回语句
	    MathOperation multiplication = (int a, int b) -> { return a * b; };

	    // 没有大括号及返回语句
	    MathOperation division = (int a, int b) -> a / b;
		
	    System.out.println("10 + 5 = " + Demo1Interface.operate(10, 5, addition));
	    System.out.println("10 - 5 = " + Demo1Interface.operate(10, 5, subtraction));
	    System.out.println("10 x 5 = " + Demo1Interface.operate(10, 5, multiplication));
	    System.out.println("10 / 5 = " + Demo1Interface.operate(10, 5, division));
	    
		// 不用括号
		GreetingService greetService1 = message -> System.out.println("Hello " + message);

		// 用括号
		GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

		greetService1.sayMessage("Soar");
		greetService2.sayMessage("lxy");
		
	}
}
