package Test1;
import java.text.NumberFormat;

public class Employee extends Person {
protected int salary;
protected int hours;
public Employee() {
	
}
NumberFormat fmt=NumberFormat.getCurrencyInstance();

public Employee(String firstName,String lastName,int age,int year) {
	super(firstName,lastName,age,year);
}

public Employee(String firstName,String lastName,int age,int year,int salary,int hours) {
super(firstName,lastName,age,year);
if(salary>=600||salary<=10000)
	this.salary=salary;
else
	this.salary=600;
if(hours>=1||hours<=30)
	this.hours=hours;
else
	this.hours=5;
}
public String toString() {
	return super.toStirng()+" salary: "+fmt.format(this.salary)+" working hours: "+this.hours;
}
		}