package Test1;

import java.util.Scanner;

public class Bus {
    private Student[] all_Students;
    private String inbus;
    private int nbOfStudent = 0;
    Scanner input = new Scanner(System.in);

    Bus() {

    }

    Bus(Student[] students) {
        all_Students = students;
    }

    public void setStudents(Student[] st) {
        this.all_Students = st;
    }

    public void addStToBus(String fname, String lname, int age, int year, String inbus, String classs) {
        System.out.println("to register in the bus you should pay 200$");
        if (nbOfStudent < 50) {
            System.out.println("are you sure?(y/n)");
            String sure = input.next();
            if (sure.equals("y") || sure.equals("Y")) {

                all_Students[nbOfStudent] = new Student(fname, lname, age, year, inbus, classs);
                nbOfStudent++;
                System.out.println("New student added successfully!\n");
            } else {
                System.out.println("undo add");
            }

        } else {
            System.out.println("Error: Cannot add new student! number should be less then 50! \n");

        }
    }

    public void deleteStudent(String fn, String ln) {
        Student tmp;
        int foundIndex = 0;
        boolean found = false;

        for (int i = 0; i < nbOfStudent; i++) {
            tmp = all_Students[i];

            if (tmp.firstName.toLowerCase().equals(fn.toLowerCase())
                    && tmp.lastName.toLowerCase().equals(ln.toLowerCase())) {

                found = true;
                foundIndex = i;
                break;
            }
        }

        if (found) {
            System.out.println("are you sure?(y/n)");
            String sure = input.next();
            if (sure.equals("y") || sure.equals("Y")) {

                // Shift next contacts one place to the left to delete selected contact
                for (int i = foundIndex; i < (nbOfStudent - 1); i++) {
                    all_Students[i] = all_Students[i + 1];
                }
                nbOfStudent--;
                System.out.println("Student deleted!\n");
            } else {
                System.out.println("undo delete");
            }
        } else
            System.out.println("Error: Student does not exist!\n");
    }

    public Student[] getStudents() {
        return this.all_Students;
    }

    public String toString() {
        String result = "number of students in the bus:" + this.nbOfStudent;
        for (int i = 0; i < this.all_Students.length; i++) {
            result += this.all_Students[i].toString() + "\n";
        }

        return result;
    }

}