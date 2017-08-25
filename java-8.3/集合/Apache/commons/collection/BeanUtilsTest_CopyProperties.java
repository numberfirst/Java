package Apache.commons.collection;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

import Apache.commons.collection.support.Emp;
import Apache.commons.collection.support.Person;

public class BeanUtilsTest_CopyProperties {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		Person person=new Person();
		person.setAge(30);
		person.setName("张三");
		person.setOccupation("abc");
		Person person1=new Person();
		Emp emp=new Emp();
		BeanUtils.copyProperties(person1, person);
		BeanUtils.copyProperties(emp, person);
		System.out.println(person1);
		System.out.println(emp);
		

	}

}
