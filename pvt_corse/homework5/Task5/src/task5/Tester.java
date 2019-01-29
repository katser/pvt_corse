package task5;

import java.util.regex.Pattern;

public class Tester {

	public String name;
	public String surname;
	public int expirienceInYears;
	public String englishLevel;
	public double salary;

	// 1 task
	public Tester() {
	}

	public Tester(String name) {
		this();
	}

	public Tester(String surname, String name) {
		this(name);
		this.surname = surname;
	}

	public Tester(int expirienceInYears, String surname, String name) {
		this(name, surname);
		this.expirienceInYears = expirienceInYears;
	}

	public Tester(String englishLevel, int expirienceInYears, String surname, String name) {
		this(expirienceInYears, name, surname);
		this.englishLevel = englishLevel;
	}

	public Tester(double salary, String englishLevel, int expirienceInYears, String surname, String name) {
		this(englishLevel, expirienceInYears, name, surname);
		this.salary = salary;
	}

	public String printInf(String name, String surname) {
		return name + surname;

	}

	public String printInf(String name, String surname, String englishLevel) {
		return name + surname + englishLevel;

	}

	public String printInf(String name, String surname, String englishLevel, int expirienceInYears) {
		return name + surname + englishLevel + expirienceInYears;

	}

	public void setName(String name) {
		this.name = name;

	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

// 2 task
	public void setExpirienceInYears(int expirienceInYears) {
		this.expirienceInYears = expirienceInYears;
	}

	public void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// 3 task
	static void whatTheDogSay() {
		System.out.println("Bork bark bork");

	}

	// 1 add task
	public boolean add1(String testString) {
		Pattern p = Pattern.compile("^[a-zA-Z]{0,4}$");
		java.util.regex.Matcher m = p.matcher(testString);

		return m.matches();
	}

	public boolean add2(String testString) {
		Pattern p1 = Pattern.compile("^....$");
		java.util.regex.Matcher n = p1.matcher(testString);

		return n.matches();
	}
	
}
