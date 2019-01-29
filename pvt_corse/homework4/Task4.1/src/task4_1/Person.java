package task4_1;

public class Person {
	public String name;
	public String surname;
	public int age;
	public int phone;

	public void printAllInformation() {
		String a = " ";
		System.out.print(name + a + surname + a + age + a + phone);

	}

	public void printName() {
		String a = " ";
		System.out.print(name + a + surname);

	}

	public boolean isAdult(int a) {

		if (a > 18) {
			return true;
		} else {
			return false;
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getName() {
		{
			return this.name;
		}
	}

	public String getSurname() {
		{
			return this.surname;
		}
	}

	public int getAge() {
		{
			return this.age;
		}
	}

	public double getPhone() {
		{
			return this.phone;
		}

	}
}
