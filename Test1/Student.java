package Test1;

public class Student extends Person {
	protected float gpa;
	public String stInBus;
	public int numOfStInBus = 0;

	Student() {

	}

	Student(String firstName, String lastName, int age, int year) {
		super(firstName, lastName, age, year);
	}

	Student(String firstName, String lastName, int age, int year, float gpa, String stInBus) {

		super(firstName, lastName, age, year);
		this.gpa = gpa;

		if (stInBus == "y" || stInBus == "Y") {
			numOfStInBus++;
		}

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
		String result = super.toString();
		result += " gpa:" + this.gpa;
		if (this.stInBus == "y" || this.stInBus == "Y")
			result += "\n this Student is in the bus";
		return result;
	}
}