package java8demo.lxy.lambda;

import java8demo.lxy.lambda.Demo1Interface.GreetingService;
import java8demo.lxy.lambda.Demo1Interface.MathOperation;

/**
 * @Title: Demo1ForJava7 <br />
 * @Description: 一个简单的计算器算法，使用java7完成，用来对比学习java8 <br />
 * <br />
 * @author: Soar <br />
 */
public class Demo1ForJava7 {
	
	public static void main(String[] args) {
		
		MathOperation addition = new MathOperation() {
			@Override
			public int operation(int a, int b) {
				return a + b;
			}
		};
		
		MathOperation subtraction = new MathOperation() {
			@Override
			public int operation(int a, int b) {
				return a - b;
			}
		};
		
		System.out.println("10 + 5 = " + Demo1Interface.operate(10, 5, addition));
	    System.out.println("10 - 5 = " + Demo1Interface.operate(10, 5, subtraction));
	    
	    GreetingService greetService = new GreetingService() {
			@Override
			public void sayMessage(String message) {
				System.out.println("Hello " + message);
			}
		};
		
		greetService.sayMessage("Soar");
	}
}
