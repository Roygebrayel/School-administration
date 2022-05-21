package Test1;


public class Student extends Person {
	protected float gpa;

	Student() {

	}

	Student(String firstName, String lastName, int age, int year) {
		super(firstName, lastName, age, year);
	}

	Student(String firstName, String lastName, int age, int year, float gpa) {

		super(firstName, lastName, age, year);
		this.gpa = gpa;

	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getId() {
		return this.id;
	}

	public int getAge() {

		return this.age;
	}

	public float getGpa() {
		return this.gpa;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAge(int age) {
		if (age < 13 || age > 22) {
			System.out.println("Error!! age should be greater or equal to 13 and less then 22!");

		} else
			this.age = age;
	}

	public void setGpa(float gpa) {
		if (gpa < 0 || gpa > 4) {
			System.out.println("Error!! gpa should be greater or equal to 0 and less then or equal to 4!");

		} else
			this.gpa = gpa;
	}

	public String toString() {
		return super.toStirng() + " gpa:" + this.gpa;
	}
}