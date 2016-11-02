package java8demo.lxy.lambda.defaultmethod;

public interface MethodB {
	
	default void foo() {
		System.out.println("Calling B.foo()");
	}

	public static void bar() {
		System.out.println("This is a static method from MethodB");
	}
}
