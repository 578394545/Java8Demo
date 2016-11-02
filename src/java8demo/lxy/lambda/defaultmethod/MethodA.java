package java8demo.lxy.lambda.defaultmethod;

/**
 * @Title: DefaultMethod <br />
 * @Description: 接口添加默认方法和静态方法实例 <br />
 * <br />
 * @author: Soar <br />
 */
public interface MethodA {
	default void foo() {
		System.out.println("Calling A.foo()");
	}
	
	public static void bar(){
		System.out.println("This is a static method from MethodA");
	}
}
