package homework8.a;

import homework8.Tester;

public class MainA {

	public static void main(String[] args) {

		String name = "maks";
		String surname = "notmaks";
		int expirienceInYears = 1;
		String englishLevel = "elementary";
		int salary = 200;

		// Task 7a
		Tester tester = new Tester(name, surname, expirienceInYears, englishLevel, salary);
// get's methods have 'friendly' level so we can't use them in another package
		System.out.println(tester.getName());
		System.out.println(tester.getSurname());
		System.out.println(tester.getExpirienceInYears());
		System.out.println(tester.getEnglishLevel());
		System.out.println(tester.getSalary());
// set's methods have 'friendly' level too so we can't use them in another package
		tester.setName(name);
		tester.setSurname(surname);
		tester.setExpirienceInYears(expirienceInYears);
		tester.setEnglishLevel(englishLevel);
		tester.setSalary(salary);

		// salaryX2 private method can't be use in another class so in package too
		System.out.println(tester.salaryX2());
// expInMonth friendly method can't be use in another package
		System.out.println(tester.expInMonth());
// printName protected method can't be use in another package (except child classes in another package)
		tester.printName();

		tester.printAllInf();

	}

}
