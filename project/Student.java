package project;
public class Student extends Person {
protected float gpa;
public  String  stInBus;
public int numOfStInBus=0;
public int year;
public String stClass;

Student(){
	
}

Student(String firstName,String lastName,int age,int year,String  stInBus,String stClass){
	super(firstName,lastName,age,year);
this.stInBus=stInBus;
    if(this.stInBus.equals("y")||this.stInBus.equals("Y")) {
    	 numOfStInBus++;
    }
    if(stClass.toLowerCase().equals("s1g")||stClass.toLowerCase().equals("s2s")
    		||stClass.toLowerCase().equals("s2h")||stClass.toLowerCase().equals("sv")
    		||stClass.toLowerCase().equals("sg")||stClass.toLowerCase().equals("se")
    	||stClass.toLowerCase().equals("lh")){
    this.stClass=stClass;
    	}else {
    		System.out.println("invalid class!!default s1g");
    this.stClass="s1g";
    	}
    
}

Student(String firstName,String lastName,int age,int year,float gpa,String stInBus,String stClass){

	super(firstName,lastName,age,year);
	this.gpa=gpa;
	this.stInBus=stInBus;
    if(stInBus=="y"||stInBus=="Y") {
    	 numOfStInBus++;
    }
    this.stClass=stClass;

    	
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
public void setId(int id) {
	this.id=id;
}
public int getAge() {
	
	return this.age;
}
public float getGpa() {
	return this.gpa;
}

public void setFirstName(String firstName) {
	this.firstName=firstName;
}
public void setLastName(String lastName) {
	this.lastName=lastName;
}
public void setyear(int year) {
	this.year=year;
}
public void setAge(int age) {
	if(age<13||age>22) {
		System.out.println("Error!! age should be greater or equal to 13 and less then 22!");
		
	}
	else
		this.age=age;
}
public void setGpa(float gpa) {
	if(gpa<0||gpa>4) {
		System.out.println("Error!! gpa should be greater or equal to 0 and less then or equal to 4!");
		
	}
	else
		this.gpa=gpa;
}





public String toString() {
	String result=super.toStirng()+" class: "+this.stClass;
	if(stInBus.equals("y")||stInBus.equals("Y")) {
		result+="\nthe student is in bus and should pay 200$";
	}
	
	  return result;
}
}