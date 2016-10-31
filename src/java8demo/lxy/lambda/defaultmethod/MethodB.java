package java8demo.lxy.lambda.defaultmethod;

public interface MethodB {
	default void foo() {
		System.out.println("Calling B.foo()");
	}
}
