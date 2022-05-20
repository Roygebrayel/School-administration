package Test1;
import java.io.IOException;
import java.io.PrintWriter;
 

public class Main {

	

    public static void main(String[] args) throws IOException{
    PrintWriter out = new PrintWriter("Students.txt"); 

		
 Student s1=new Student("alah","ouwet",18,2019,3);
 System.out.println(s1.toString());
 
 Teacher t1=new Teacher("mi","ma",19,2007,2000,6,"ho","s1");
 System.out.println(t1.toString());
 
 Employee e1=new Employee("mfffi","ma",15,2022,3000,7);
 System.out.println(e1.toString());
 

 // Write in the file
 out.println(s1.toString());
 out.println(t1.toString());
 out.println(e1.toStirng());


 // Close the file.
 out.close();  
	}

}
