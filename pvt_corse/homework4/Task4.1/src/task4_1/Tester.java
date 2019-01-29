package task4_1;

import task4_1.Person;

public class Tester {
	public static void main(String[] args) {
		Person person = new Person();
		int age = 25;
		int phone = 7788;
		person.setName("alex");
		person.setSurname("Xela");
		person.setAge(age);
		person.setPhone(phone);
		person.printAllInformation();
		System.out.println();
		person.printName();
		System.out.println();
		System.out.println(person.isAdult(age));
	}
}
