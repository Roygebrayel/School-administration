package project;
import java.text.NumberFormat;

public abstract class Employee extends Person {
	public final int salaryPH = 75;
	public final int salaryPHP = 100;
	protected int hours;

	public Employee() {

	}

	NumberFormat fmt = NumberFormat.getCurrencyInstance();

	public Employee(String firstName, String lastName, int age, int year) {
		super(firstName, lastName, age, year);
	}

	public Employee(String firstName, String lastName, int age, int year, int hours) {
		super(firstName, lastName, age, year);

		if (hours >= 1 || hours <= 40)
			this.hours = hours;
		else
			this.hours = 5;
	}

	public String toString() {
		String result = super.toStirng();
		if (this.year > 2018) {
			result += " salary: " + fmt.format(this.salaryPH * hours) + " working hours: " + this.hours;
		} else
			result += " salary: " + fmt.format(this.salaryPHP * hours) + " working hours: " + this.hours;

		return result;
	}

}