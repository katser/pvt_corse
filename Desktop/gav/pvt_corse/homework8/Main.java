package homework8;

public class Main {

	public static void main(String[] args) {

		String name = "maks";
		String surname = "notmaks";
		int expirienceInYears = 1;
		String englishLevel = "elementary";
		int salary = 200;

		// Task 7
		Tester tester = new Tester(name, surname, expirienceInYears, englishLevel, salary);

		System.out.println(tester.getName());
		System.out.println(tester.getSurname());
		System.out.println(tester.getExpirienceInYears());
		System.out.println(tester.getEnglishLevel());
		System.out.println(tester.getSalary());

		tester.setName(name);
		tester.setSurname(surname);
		tester.setExpirienceInYears(expirienceInYears);
		tester.setEnglishLevel(englishLevel);
		tester.setSalary(salary);

		// private method can't be use in another class
		System.out.println(tester.salaryX2());

		System.out.println(tester.expInMonth());

		tester.printName();

		tester.printAllInf();

	}

}
