package java8demo.lxy.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo1 {
	
	public static void main(String[] args) {
		Optional< String > fullNameNull = Optional.ofNullable( null );
		System.out.println( "Full Name is set? " + fullNameNull.isPresent() );       
		System.out.println( "Full Name: " + fullNameNull.orElseGet( () -> "[none]" ) );
		System.out.println( fullNameNull.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
		System.out.println(fullNameNull);
		
		System.out.println();
		
		Optional< String > fullName = Optional.ofNullable( "Soar" );
		System.out.println( "Full Name is set? " + fullName.isPresent() );       
		System.out.println( "Full Name: " + fullName.orElseGet( () -> "[none]" ) );
		System.out.println( fullName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
		System.out.println(fullName);
		
		System.out.println();
		
		List<String> list = null;
//		List<String> list = Arrays.asList("5","6","7");
		List<String> list2 = Arrays.asList("1","2","3");
		
		Optional< List<String> > fullNameList = Optional.ofNullable( list );
		System.out.println( "Full Name is set? " + fullNameList.isPresent() );       
		System.out.println( "Full Name: " + fullNameList.orElseGet( () -> list2 ) );
		System.out.println( fullNameList.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
		System.out.println(fullNameList);
	}
}