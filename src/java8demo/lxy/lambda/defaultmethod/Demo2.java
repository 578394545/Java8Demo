package java8demo.lxy.lambda.defaultmethod;

public class Demo2 implements MethodA,MethodB{
	
	//public void foo() default MethodA.foo;
	
	public void foo(){
		MethodA.super.foo(); 
	}
	
	public static void main(String[] args) {
		Demo2 demo2 = new Demo2();
		demo2.foo();
		
		MethodA.bar();
	}
}
