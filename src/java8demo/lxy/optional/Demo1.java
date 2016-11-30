package java8demo.lxy.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo1 {
	
	public static void main(String[] args) {
		Optional< String > fullNameNull = Optional.ofNullable( null );//为指定的值创建一个Optional，如果指定的值为null，则返回一个空的Optional。
		System.out.println( "是否有值 ? " + fullNameNull.isPresent() );//判断是否有值，如果值存在返回true，否则返回false。
		System.out.println( "值 : " + fullNameNull.orElseGet( () -> "[none]" ) );//接受Supplier接口的实现，生成默认值
		System.out.println( fullNameNull.map( s -> "你好  " + s + "!" ).orElse( "你好  else!" ) );//如果有值则将其返回，否则返回指定的其它值。
		System.out.println(fullNameNull);
		
		System.out.println();
		
		Optional< String > fullName = Optional.ofNullable( "Soar" );
		System.out.println( "是否有值 ? " + fullName.isPresent() );       
		System.out.println( "值 : " + fullName.orElseGet( () -> "[none]" ) );
		System.out.println( fullName.map( s -> "你好  " + s + "!" ).orElse( "你好  else!" ) );
		System.out.println(fullName);
		
		System.out.println();
		
		List<String> list = null;
//		List<String> list = Arrays.asList("5","6","7");
		List<String> list2 = Arrays.asList("1","2","3");
		
		Optional< List<String> > fullNameList = Optional.ofNullable( list );
		System.out.println( "是否有值 ? " + fullNameList.isPresent() );       
		System.out.println( "值 : " + fullNameList.orElseGet( () -> list2 ) );
		System.out.println( fullNameList.map( s -> "你好  " + s + "!" ).orElse( "你好  else!" ) );
		System.out.println(fullNameList);
	}
}