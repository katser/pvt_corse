package task5;

import task5.Tester;

public class Tasker {
	public static void main(String[] args) {
		Tester tstr = new Tester();

		tstr.setName("maks");
		tstr.setSurname("kats");
		tstr.setEnglishLevel("bad");
		tstr.setExpirienceInYears(1);
		tstr.setSalary(200);
// 2 task
		System.out.println(tstr.printInf(tstr.name, tstr.surname));
		System.out.println(tstr.printInf(tstr.name, tstr.surname, tstr.englishLevel));
		System.out.println(tstr.printInf(tstr.name, tstr.surname, tstr.englishLevel, tstr.expirienceInYears));
// 3 task 
		Tester.whatTheDogSay();
// 1 add task
		System.out.println(tstr.add1("w2w"));
	}
	
}
