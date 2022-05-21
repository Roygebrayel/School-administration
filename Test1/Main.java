package Test1;

import java.util.Scanner;

public class Main {
    

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int choice=0,year,age;
        String firstName,lastName,stInBus;
        double gpa;
       Person [] ss = new Person [100];
        
		
        do{
             System.out.printf(
					"1- Student \n"
					+"2- Teacher\n"
					+ "3- Employee\n"
					+ "4- Classes\n"
					+ "5- School\n"
					+ "6- Bus\n"
					+ "7- Exit\n"
					);
        
        
       
       System.out.println("Enter a choice: ");
			choice = input.nextInt();
            input.nextLine();

        
        
    
    switch (choice) {
        case 1:
        int choice_student=0;
       
           do{

           
              System.out.printf(
             "1- add a student \n"
             + "2- delete a student \n"
             + "3- set first name \n" 
             + "4- get first name \n"
             + "5- set last name \n"
             + "6- get last name \n"
             + "7- set age \n"
             + "8- get age \n"
             + "9- set starting year \n"
             + "10- get starting year \n"
             + "11- set gpa \n"
             + "12- get gpa \n"
             + "13- set ID \n"
             + "14- get ID \n"
             + "15- display all information about student \n"
             + "16- exit\n"
             ); 
             
             System.out.println("request what to do with the student :");
             choice_student = input.nextInt();
             input.nextLine();


             switch (choice_student) {
                 case 1:
                     
							System.out.print("Enter name of student: ");
							firstName = input.nextLine();
							
							System.out.print("Enter major of student: ");
							lastName = input.nextLine();
							
							System.out.print("Enter gpa of student: ");
							gpa = input.nextDouble();
							input.nextLine();

                            System.out.println("enter age of student: ");
                            age = input.nextInt();
                            input.nextLine();
                               
                            System.out.println("enter year of starting of student: ");
                            year = input.nextInt();
                            input.nextLine();

                            System.out.println("enter age of student: ");
                            stInBus = input.nextLine();

                            // Student = new Student ();
                            
							
                    break;
                     case 2:

             
                 default:
                     break;
             }
             
            }while(choice_student != 16);
             break;
        
    }
            }while(choice != 7);
              
            
            
    
        
        }
    }



    