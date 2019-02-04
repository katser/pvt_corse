package homework8;

public class Tester {
	public String name;
	String surname;
	protected int expirienceInYears;
	private String englishLevel;
	public int salary;

	// Task 1

	Tester(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	protected Tester(String name, String surname, String englishLevel) {
		this(name, surname);
		this.englishLevel = englishLevel;
	}

	public Tester(String name, String surname, int expirienceInYears, String englishLevel, int salary) {
		this(name, surname, englishLevel);
		this.salary = salary;
		this.expirienceInYears = expirienceInYears;

	}

	// Task 2

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getSurname() {
		return surname;
	}

	void setSurname(String surname) {
		this.surname = surname;
	}

	int getExpirienceInYears() {
		return expirienceInYears;
	}

	void setExpirienceInYears(int expirienceInYears) {
		this.expirienceInYears = expirienceInYears;
	}

	String getEnglishLevel() {
		return englishLevel;
	}

	void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}

	int getSalary() {
		return salary;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}

	// Task 3

	private int salaryX2() {
		int a = 2;
		return (salary * a);
	}

	// Task 4

	int expInMonth() {
		int m = 12;
		return (expirienceInYears * m);
	}

	// Task 5

	protected void printName() {
		String a = String.format("Name: %s, Surname: %s", name, surname);
		System.out.println(a);

	}

	// Task 6

	public void printAllInf() {
		String a = " ";
		System.out.println(name + a + surname + a + expirienceInYears + a + englishLevel + a + salary);
	}

}
