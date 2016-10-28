package java8demo.lxy.lambda.methodreference;

import java.time.LocalDate;

/**
 * @Title: Person <br />
 * @Description: 无 <br />
 * <br />
 * @author: Soar <br />
 */
public class Person {
	
	private String name;
	private LocalDate birthday;

	public Person (String name, LocalDate birthday){
		this.name = name;
		this.birthday = birthday;
	}
	
	public Person (){
		System.out.println("无参构造器！");
	}
	
	public String getName(){
		return name;
	}
	
	public LocalDate getBirthday(){
        return birthday;
    }

    /**
     * 比较两个人的年龄
     * @param personA 人a
     * @param personB 人b
     * @return
     */
    public static int compareByAge(Person personA, Person personB){
        return personA.birthday.compareTo(personB.birthday);
    }

    @Override
    public String toString(){
        return this.name;
    }
}
