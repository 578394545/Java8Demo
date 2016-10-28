package java8demo.lxy.lambda.methodreference;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * @Title: DemoForJava8 <br />
 * @Description: 按年龄排序，java8写法 <br />
 * <br />
 * @author: Soar <br />
 */
public class DemoForJava8 {
	public static void main(String[] args){
        Person[] pArr = new Person[]{
            new Person("003", LocalDate.of(2016,9,1)),
            new Person("001", LocalDate.of(2016,2,1)),
            new Person("002", LocalDate.of(2016,3,1)),
            new Person("004", LocalDate.of(2016,12,1))};

        Arrays.sort(pArr, Person :: compareByAge);//静态方法引用,语法是Class::static_method
        
        //Arrays.sort(pArr, (a, b) -> Person.compareByAge(a, b));
        
        /**
         * 方法引用Person::compareByAge在语义上与Lambda表达式 (a, b) -> Person.compareByAge(a, b) 是等同的，都有如下特性：
         * 1、真实的参数是拷贝自Comparator<Person>.compare方法，即(Person, Person);
         * 2、表达式体调用Person.compareByAge方法；
         */
        
        
        System.out.println(Arrays.asList(pArr));
    }
}
