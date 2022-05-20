package Test1;

import javax.lang.model.element.QualifiedNameable;

public class Teacher extends Employee{
    private String subject;
    private String classes;
    
    Teacher(){
        
    }	

public Teacher(String firstName,String lastName,int age,int year,int salary,int hours,String subject,String classes){
	super(firstName,lastName,age,year,salary,hours);
	int id=(int)(Math.random() * 1000 + 8999);
	   this.id = id;
	this.subject=subject;
	this.classes=classes;
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
public int getYear() {
	return this.year;
}
public int getsalary() {
	return this.salary;
}
public int getHours() {
	return this.hours;
}
public String getSubject() {
	return this.subject;
}
public String getClasses() {
	return this.classes;
}

public void setFirstName(String firstName) {
	this.firstName=firstName;
}
public void setLastName(String lastName) {
	this.lastName=lastName;
}
public void setId(int id) {
	this.id=id;
}
public void setAge(int age) {
	if(age<13||age>22) {
		System.out.println("Error!! age should be greater or equal to 13 and less then 22!");
		
	}
	else
		this.age=age;
}

public void setYear(int year) {
	if(year>=2000||year<2023) {
		this.year=year;
	}
	else {
		System.out.println("Error!! year should be between 2000 and 2023!");
	}
}
public void setSalary(int salary) {
	if(salary>=600||salary<=10000)
		this.salary=salary;
	else
		this.salary=600;
}
public void setHours(int hours) {
	if(hours>=1||hours<=30)
		this.hours=hours;
	else
		this.hours=5;
}
public void setSubject(String subject) {
	if (subject.toUpperCase().equals("MATHS") ||
	subject.toUpperCase().equals("CHIMIE") ||
	subject.toUpperCase().equals("BIOLOGIE")||
	subject.toUpperCase().equals("ECONOMIE")||
	subject.toUpperCase().equals("PHYSIQUE")||
	subject.toUpperCase().equals("ARABE")||
	subject.toUpperCase().equals("FRANCAIS")||
	subject.toUpperCase().equals("CIVISME") ||
	subject.toUpperCase().equals("HISTOIRE") ||
	subject.toUpperCase().equals("GEOGRAPHIE") ||
	 subject.toUpperCase().equals("PHILOSOPHIE") || 
	 subject.toUpperCase().equals("RELIGION")){
       this.subject=subject;
	}
	else {
		System.out.println("error,invalid subject .. the default value is GEOGRAPHIE");
		this.subject="GEOGRAPHIE";
	}
	
}
public void setClasses(String classes) {
	this.classes=classes;
}
public String toString() {
	return super.toString()+" subject"+this.subject+" class:"+this.classes;
}

}