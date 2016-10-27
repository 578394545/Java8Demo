package java8demo.lxy.lambda;

/**
 * @Title: Demo1Interface <br />
 * @Description: demo接口，供java7、java8调用 <br />
 * <br />
 * @author: Soar <br />
 */
public class Demo1Interface {
	
	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}
	
	static int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
	
}
