package java8demo.lxy.lambda.methodreference;

import java.util.Arrays;

public class ComparisonProvider {
	
	public int compareByName(Person a, Person b){
        return a.getName().compareTo(b.getName());
    }

    public int compareByAge(Person a, Person b){
        return a.getBirthday().compareTo(b.getBirthday());
    }
    
    public static void main(String[] args) {
    	
    	Person[] pArr = new Person[]{
                new Person("张三", null),
                new Person("李四", null),
                new Person("005", null),
                new Person("004", null)
                };
    	/**
    	 * 特定实例对象的方法引用,语法是instance::method
    	 */
    	ComparisonProvider myComparisonProvider = new ComparisonProvider();
        Arrays.sort(pArr, myComparisonProvider :: compareByName);
        System.out.println(Arrays.asList(pArr));
        
        /**
         * 任意对象（属于同一个类）的实例方法引用,语法是Class::method
         */
        String[] stringArray = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };
        Arrays.sort(stringArray, String :: compareToIgnoreCase);
        System.out.println(Arrays.asList(stringArray));
        
	}
}
