
package Test1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.text.NumberFormat;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.io.PrintWriter;
import java.io.IOException;

public class Main1 {

    public static void main(String[] args) throws IOException, InterruptedException {

        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        int fees = 200;
        Scanner input = new Scanner(System.in);
        int choice = 0, year, age, nbOfStudents = 0, nbOfTeachers = 0;
        String firstName, lastName, stInBus;
        Student[] st = new Student[100];
        Teacher[] t = new Teacher[100];
        Class c1[] = new Class[100];
        School sc = new School();
        int admps = 0000;
        

        
        System.out.println("welcome to the administration school system");
        TimeUnit.MICROSECONDS.sleep(2000000);

        do {
            System.out.printf(
                    "1- Student \n"
                            + "2- Teacher\n"
                            + "3- Classes\n"
                            + "4- School\n"
                            + "5- Bus\n"
                            + "6- Exit\n");

            System.out.println("Enter a choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    int choice_student = 0;

                    do {

                        System.out.printf(
                                "1- add a student \n"
                                        + "2- display all information about students \n"
                                        + "3- set new name \n"
                                        + "4- set age \n"
                                        + "5- set starting year \n"
                                        + "6-set id\n"
                                        + "7- set gpa \n"
                                        + "8- get gpa \n"
                                        + "9- delete a student \n"
                                        + "10-search a student by name\n"
                                        + "11- throw all informational into an external file\n"
                                        + "12- throw all informations into an external panel\n"
                                        + "13- exit\n");

                        System.out.println("request what to do with the student :");
                        choice_student = input.nextInt();
                        input.nextLine();

                        switch (choice_student) {
                            case 1:

                                /*
                                 * System.out.println(" student in bus?(y/n)");
                                 * stInBus = input.nextLine();
                                 */
                                System.out.println("Enter student first name");
                                firstName = input.nextLine();
                                System.out.println("Enter student last name");
                                lastName = input.nextLine();
                                do {
                                    System.out.println("Enter student age");
                                    age = input.nextInt();
                                } while (age < 13 || age > 23);
                                do {
                                    System.out.println("Enter the year of start");
                                    year = input.nextInt();
                                    input.nextLine();
                                } while (year < 2003 || year >= 2022);
                                System.out.println("student in bus?(y/n)");

                                stInBus = input.nextLine();
                                System.out.println("enter student's class");
                                String stClass = input.next();

                                st[nbOfStudents] = new Student(firstName, lastName, age, year, stInBus, stClass);
                                nbOfStudents++;
                                System.out.println("the student had been added: ");

                                break;

                            case 2:
                                System.out.println("all students:\n ");
                                for (int i = 0; i < nbOfStudents; i++) {
                                    System.out.println(st[i].toString());
                                }
                                break;
                            case 3:
                                System.out.println("all students:\n ");
                                for (int i = 0; i < nbOfStudents; i++) {
                                    System.out.println(st[i].toString());
                                }
                                System.out.println("choose which student name you want to modify: ");
                                System.out.println("first name ");
                                String ffirstName = input.nextLine();
                                System.out.println("last name ");
                                String llasName = input.nextLine();
                                for (int i = 0; i < nbOfStudents; i++) {
                                    if (st[i].firstName.toUpperCase().equals(ffirstName.toUpperCase())
                                            && st[i].lastName.toUpperCase().equals(llasName.toUpperCase())) {
                                        System.out.println("enter the new first name: ");
                                        String fn = input.nextLine();
                                        st[i].setFirstName(fn);
                                        System.out.println("enter the new last name: ");
                                        String ln = input.nextLine();
                                        st[i].setLastName(ln);
                                        System.out.println("name modified: ");
                                        System.out.println(st[i]);
                                    }
                                }

                                break;
                            case 4:
                                System.out.println("all students:\n ");
                                for (int i = 0; i < nbOfStudents; i++) {
                                    System.out.println(st[i].toString());
                                }
                                System.out.println("choose which student you want to change his age ");
                                System.out.println("first name ");
                                String fffirstName = input.nextLine();
                                System.out.println("last name ");
                                String lllasName = input.nextLine();
                                for (int i = 0; i < nbOfStudents; i++) {
                                    if (st[i].firstName.toUpperCase().equals(fffirstName.toUpperCase())
                                            && st[i].lastName.toUpperCase().equals(lllasName.toUpperCase())) {
                                        int ag;
                                        do {
                                            System.out.println("enter the new age ");
                                            ag = input.nextInt();
                                        } while (ag < 12 || ag > 23);
                                        st[i].setAge(ag);
                                        input.nextLine();
                                        System.out.println(" age modified: ");
                                        System.out.println(st[i]);
                                    }
                                }

                                break;
                            case 5:
                                System.out.println("all students:\n ");
                                for (int i = 0; i < nbOfStudents; i++) {
                                    System.out.println(st[i].toString());
                                }
                                System.out.println("choose which student you want to set his starting year  ");
                                System.out.println("first name ");
                                String fffirstNamee = input.nextLine();
                                System.out.println("last name ");
                                String lllasNamee = input.nextLine();
                                for (int i = 0; i < nbOfStudents; i++) {
                                    if (st[i].firstName.toUpperCase().equals(fffirstNamee.toUpperCase())
                                            && st[i].lastName.toUpperCase().equals(lllasNamee.toUpperCase())) {
                                        int y;
                                        do {
                                            System.out.println("enter the year ");
                                            y = input.nextInt();
                                        } while (y < 2000 || y > 2021);
                                        st[i].setyear(y);
                                        input.nextLine();
                                        System.out.println(" year modified: ");
                                        System.out.println(st[i]);

                                    }
                                }
                                break;
                            case 6:
                                int pass;
                                int cn = 0;
                                do {
                                    System.out.println("enter the administrator's password(4 numbers): ");
                                    pass = input.nextInt();
                                    input.nextLine();
                                    cn++;
                                    if (cn == 3) {
                                        System.out.println("invalid password(for 3 times) exiting");
                                    }

                                } while (pass != admps && cn <= 3);
                                if (pass == admps) {
                                    System.out.println("all students:\n ");
                                    for (int i = 0; i < nbOfStudents; i++) {
                                        System.out.println(st[i].toString());
                                    }
                                    System.out.println("choose which student you want to set his id  ");
                                    System.out.println("first name ");
                                    String fffirstNameee = input.nextLine();
                                    System.out.println("last name ");
                                    String lllasNameee = input.nextLine();
                                    for (int i = 0; i < nbOfStudents; i++) {
                                        if (st[i].firstName.toUpperCase().equals(fffirstNameee.toUpperCase())
                                                && st[i].lastName.toUpperCase().equals(lllasNameee.toUpperCase())) {

                                            System.out.println("enter the id(without the year) ");

                                            int idd = input.nextInt();

                                            st[i].setId(idd);
                                            input.nextLine();
                                            System.out.println(" id modified: ");
                                            System.out.println(st[i]);

                                        }
                                    }

                                }

                                break;
                            case 7:
                                int passs;
                                int cnn = 0;
                                do {
                                    System.out.println("enter the administrator's password(4 numbers): ");
                                    passs = input.nextInt();
                                    input.nextLine();
                                    cnn++;
                                    if (cnn == 3) {
                                        System.out.println("invalid password(for 3 times) 1 more chance");
                                    }

                                } while (passs != admps && cnn <= 3);
                                if (passs == admps) {
                                    System.out.println("all students:\n ");
                                    for (int i = 0; i < nbOfStudents; i++) {
                                        System.out.println(st[i].toString());
                                    }
                                    System.out.println("choose which student you want to set his gpa  ");
                                    System.out.println("first name ");
                                    String fffirstNameee = input.nextLine();
                                    System.out.println("last name ");
                                    String lllasNameee = input.nextLine();
                                    for (int i = 0; i < nbOfStudents; i++) {
                                        if (st[i].firstName.toUpperCase().equals(fffirstNameee.toUpperCase())
                                                && st[i].lastName.toUpperCase().equals(lllasNameee.toUpperCase())) {
                                            float gpaa;
                                            do {
                                                System.out.println("enter the gpa ");

                                                gpaa = input.nextFloat();
                                            } while (gpaa < 0 || gpaa > 4);
                                            st[i].setGpa(gpaa);
                                            input.nextLine();
                                            System.out.println(" gpa modified: ");
                                            System.out.println(st[i]);
                                            System.out.println("gpa" + st[i].getGpa());

                                        }
                                    }

                                }
                                break;
                            case 8:
                                System.out.println("choose which student you want to get his gpa  ");
                                System.out.println("first name ");
                                String fffirstNameee = input.nextLine();
                                System.out.println("last name ");
                                String lllasNameee = input.nextLine();
                                for (int i = 0; i < nbOfStudents; i++) {
                                    if (st[i].firstName.toUpperCase().equals(fffirstNameee.toUpperCase())
                                            && st[i].lastName.toUpperCase().equals(lllasNameee.toUpperCase())) {
                                        System.out.println("gpa" + st[i].getGpa());
                                    }
                                }
                                break;
                            case 9:
                                System.out.println("enter first name: ");
                                String fn = input.nextLine();
                                System.out.println("enter last name: ");
                                String ln = input.nextLine();
                                Student tmp;
                                int foundIndex = 0;
                                boolean found = false;

                                for (int i = 0; i < nbOfStudents; i++) {
                                    tmp = st[i];

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
                                        for (int i = foundIndex; i < (nbOfStudents - 1); i++) {
                                            st[i] = st[i + 1];
                                        }
                                        nbOfStudents--;
                                        System.out.println("Student deleted!\n");
                                    } else {
                                        System.out.println("undo delete");
                                    }
                                } else
                                    System.out.println("Error: Student does not exist!\n");
                                break;
                            case 10:
                                System.out.println("enter student's first name: ");
                                String first = input.nextLine();
                                System.out.println("enter student's last name: ");
                                String last = input.nextLine();
                                for (int i = 0; i < nbOfStudents; i++) {
                                    if (st[i].firstName.toLowerCase().equals(first.toLowerCase()) &&
                                            st[i].lastName.toLowerCase().equals(last.toLowerCase())) {
                                        System.out.println("student found!!");
                                        System.out.println(st[i]);

                                    }

                                }
                                break;
                                case 11:
                                System.out.println("extracting informations into an external text file");
                                 PrintWriter out = new PrintWriter("student.txt");
                                    

                                    // Append  the file
                                    for (int i=0; i<nbOfStudents; i++){
                                        
                                        out.println(st[i].toString());
                                    }
                                    out.close();
                                    break;
                                    case 12:
                                    for (int i=0; i<nbOfStudents; i++){
                                        JFrame f = new JFrame();

                                        JTextArea area = new JTextArea(st[i].toString());

                                        area.setBounds(60, 60, 500, 500);

                                        f.add(area);
                                        f.setSize(600, 600);
                                        f.setLayout(null);
                                        f.setVisible(true);

                                    }
                                    break;
                                        
                            case 13:
                                System.out.println("exiting!!");
                                TimeUnit.MICROSECONDS.sleep(2000000);
                                break;

                            default:
                                System.out.println("INVALID OPTION!!");
                                break;
                        }

                    } while (choice_student != 13);
                    break;
                case 2:

                    int choice_teacher = 0;

                    do {

                        System.out.printf(
                                "1- add a teacher \n"
                                        + "2- display all information about teachers \n"
                                        + "3- set new name \n"
                                        + "4- set age \n"
                                        + "5- set starting year \n"
                                        + "6-set id\n"
                                        + "7- set hours \n"
                                        + "8- get salary \n"
                                        + "9- delete a teacher \n"
                                        + "10-search a teacher by name\n"
                                        + "11-throw all information into an external file\n"
                                        + "12-throw all information into an external panel\n"
                                        + "13- exit\n");

                        System.out.println("request what to do with the teacher :");
                        choice_teacher = input.nextInt();
                        input.nextLine();

                        switch (choice_teacher) {
                            case 1:

                                System.out.println("Enter teacher first name");
                                firstName = input.nextLine();
                                System.out.println("Enter teacher last name");
                                lastName = input.nextLine();
                                do {
                                    System.out.println("Enter teacher age");
                                    age = input.nextInt();
                                } while (age < 18 || age > 64);
                                do {
                                    System.out.println("Enter the year of start");
                                    year = input.nextInt();
                                } while (year < 2000 || year > 2021);
                                input.nextLine();
                                int hours;
                                do {
                                    System.out.println("how many hours do you work in a week?");
                                    hours = input.nextInt();
                                    input.nextLine();
                                } while (hours <= 0 || hours > 40);
                                System.out.println("enter the subject ");
                                String subject = input.nextLine();
                                if (subject.toUpperCase().equals("MATHS") ||
                                        subject.toUpperCase().equals("CHIMIE") ||
                                        subject.toUpperCase().equals("BIOLOGIE") ||
                                        subject.toUpperCase().equals("ECONOMIE") ||
                                        subject.toUpperCase().equals("PHYSIQUE") ||
                                        subject.toUpperCase().equals("ARABE") ||
                                        subject.toUpperCase().equals("FRANCAIS") ||
                                        subject.toUpperCase().equals("CIVISME") ||
                                        subject.toUpperCase().equals("HISTOIRE") ||
                                        subject.toUpperCase().equals("GEOGRAPHIE") ||
                                        subject.toUpperCase().equals("PHILOSOPHIE") ||
                                        subject.toUpperCase().equals("RELIGION")) {
                                    
                                } else {
                                    System.out.println("invalid subject!!default Maths");
                                    subject = "MATH";

                                }
                                String[] levelchoose = { "S1G", "S2S", "S2H", "SV", "SG", "SE", "LH" };
                                String level1 = "w";
                                System.out.println("enter the class of teaching");
                                String level = input.nextLine();
                                for (int i = 0; i < levelchoose.length; i++) {
                                    if (level.toUpperCase().equals(levelchoose[i])) {
                                        level1 = level.toUpperCase();
                                    }
                                }
                                if (level1.toUpperCase().equals(level.toUpperCase())) {
                                } else {
                                    System.out.println("ivalid level,default S1G");
                                    level = "S1G";
                                }

                                t[nbOfTeachers] = new Teacher(firstName, lastName, age, year, hours, subject, level);
                                nbOfTeachers++;
                                System.out.println("the Teacher had been added: ");

                                break;

                            case 2:
                                System.out.println("all Teachers:\n ");
                                for (int i = 0; i < nbOfTeachers; i++) {
                                    System.out.println(t[i].toString());
                                }
                                break;
                            case 3:
                                System.out.println("all Teachers:\n ");
                                for (int i = 0; i < nbOfTeachers; i++) {
                                    System.out.println(t[i].toString());
                                }
                                System.out.println("choose which teacher name you want to modify: ");
                                System.out.println("first name ");
                                String ffirstName = input.nextLine();
                                System.out.println("last name ");
                                String llasName = input.nextLine();
                                for (int i = 0; i < nbOfTeachers; i++) {
                                    if (t[i].firstName.toUpperCase().equals(ffirstName.toUpperCase())
                                            && t[i].lastName.toUpperCase().equals(llasName.toUpperCase())) {
                                        System.out.println("enter the new first name: ");
                                        String fn = input.nextLine();
                                        t[i].setFirstName(fn);
                                        System.out.println("enter the new last name: ");
                                        String ln = input.nextLine();
                                        t[i].setLastName(ln);
                                        System.out.println("name modified: ");
                                        System.out.println(t[i]);
                                    }
                                }

                                break;
                            case 4:
                                System.out.println("all teachers:\n ");
                                for (int i = 0; i < nbOfTeachers; i++) {
                                    System.out.println(t[i].toString());
                                }
                                System.out.println("choose which teacher you want to change his age ");
                                System.out.println("first name ");
                                String fffirstName = input.nextLine();
                                System.out.println("last name ");
                                String lllasName = input.nextLine();
                                for (int i = 0; i < nbOfTeachers; i++) {
                                    if (t[i].firstName.toUpperCase().equals(fffirstName.toUpperCase()) &&
                                            t[i].lastName.toUpperCase().equals(lllasName.toUpperCase())) {
                                        int ag;
                                        do {
                                            System.out.println("enter the new age ");
                                            ag = input.nextInt();
                                        } while (ag < 18 || ag > 64);
                                        t[i].setAge(ag);
                                        input.nextLine();
                                        System.out.println(" age modified: ");
                                        System.out.println(t[i]);
                                    }
                                }

                                break;
                            case 5:
                                System.out.println("all teachers:\n ");
                                for (int i = 0; i < nbOfTeachers; i++) {
                                    System.out.println(t[i].toString());
                                }
                                System.out.println("choose which teacher you want to set his starting year  ");
                                System.out.println("first name ");
                                String fffirstNamee = input.nextLine();
                                System.out.println("last name ");
                                String lllasNamee = input.nextLine();
                                for (int i = 0; i < nbOfTeachers; i++) {
                                    if (t[i].firstName.toUpperCase().equals(fffirstNamee.toUpperCase())
                                            && t[i].lastName.toUpperCase().equals(lllasNamee.toUpperCase())) {
                                        int y;
                                        do {
                                            System.out.println("enter the year ");
                                            y = input.nextInt();
                                        } while (y < 2000 || y > 2021);
                                        t[i].setYear(y);
                                        input.nextLine();
                                        System.out.println(" year modified: ");
                                        System.out.println(t[i]);

                                    }
                                }
                                break;
                            case 6:
                                int pass;
                                int cn = 0;
                                do {
                                    System.out.println("enter the administrator's password(4 numbers): ");
                                    pass = input.nextInt();
                                    input.nextLine();
                                    cn++;
                                    if (cn == 3) {
                                        System.out.println("invalid password(for 3 times) 1 more chance ");
                                    }

                                } while (pass != admps && cn <= 3);
                                if (pass == admps) {
                                    System.out.println("all teachers:\n ");
                                    for (int i = 0; i < nbOfTeachers; i++) {
                                        System.out.println(t[i].toString());
                                    }
                                    System.out.println("choose which teahcer you want to set his id  ");
                                    System.out.println("first name ");
                                    String fffirstNameee = input.nextLine();
                                    System.out.println("last name ");
                                    String lllasNameee = input.nextLine();
                                    for (int i = 0; i < nbOfTeachers; i++) {
                                        if (t[i].firstName.toUpperCase().equals(fffirstNameee.toUpperCase()) &&
                                                t[i].lastName.toUpperCase().equals(lllasNameee.toUpperCase())) {

                                            System.out.println("enter the id(without the year) ");

                                            int idd = input.nextInt();

                                            t[i].setId(idd);
                                            input.nextLine();
                                            System.out.println(" id modified: ");
                                            System.out.println(t[i]);

                                        }
                                    }

                                }

                                break;
                            case 7:
                                System.out.println("choose which teacher you want to set his hours  ");
                                System.out.println("first name ");
                                String fffirstNameee = input.nextLine();
                                System.out.println("last name ");
                                String lllasNameee = input.nextLine();
                                int hourss;
                                for (int i = 0; i < nbOfTeachers; i++) {
                                    if (t[i].firstName.toUpperCase().equals(fffirstNameee.toUpperCase()) &&
                                            t[i].lastName.toUpperCase().equals(lllasNameee.toUpperCase())) {
                                        System.out.println("enter the new working hours: ");
                                        hourss = input.nextInt();
                                        t[i].setHours(hourss);
                                    }
                                }

                                break;
                            case 8:
                                System.out.println("choose which student you want to get his hours  ");
                                System.out.println("first name ");
                                String ffirstNameee = input.nextLine();
                                System.out.println("last name ");
                                String llasNameee = input.nextLine();
                                for (int i = 0; i < nbOfTeachers; i++) {
                                    if (t[i].firstName.toUpperCase().equals(ffirstNameee.toUpperCase()) &&
                                            t[i].lastName.toUpperCase().equals(llasNameee.toUpperCase())) {
                                        System.out.println("hours: " + t[i].getHours());
                                    }
                                }
                                break;
                            case 9:
                                System.out.println("enter first name: ");
                                String fn = input.nextLine();
                                System.out.println("enter last name: ");
                                String ln = input.nextLine();
                                Teacher tmp;
                                int foundIndex = 0;
                                boolean found = false;

                                for (int i = 0; i < nbOfTeachers; i++) {
                                    tmp = t[i];

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

                                        for (int i = foundIndex; i < (nbOfTeachers - 1); i++) {
                                            t[i] = t[i + 1];
                                        }
                                        nbOfTeachers--;
                                        System.out.println("teacher  deleted!\n");
                                    } else {
                                        System.out.println("undo delete");
                                    }
                                } else
                                    System.out.println("Error:teacher does not exist!\n");
                                break;
                            case 10:
                                System.out.println("enter teacher's first name: ");
                                String first = input.nextLine();
                                System.out.println("enter teacher's last name: ");
                                String last = input.nextLine();
                                for (int i = 0; i < nbOfTeachers; i++) {
                                    if (t[i].firstName.toLowerCase().equals(first.toLowerCase()) &&
                                            t[i].lastName.toLowerCase().equals(last.toLowerCase())) {
                                        System.out.println("teaher found!!");
                                        System.out.println(t[i]);

                                    }

                                }
                                break;
                                case 11:
                                PrintWriter pw = new PrintWriter("teacher.txt");
                                for (int i=0;i<nbOfTeachers;i++){
                                    pw.println(t[i].toString());
                                }
                                pw.close();

                            
                                case 12:
                                 for (int i=0; i<nbOfTeachers; i++){
                                        JFrame f = new JFrame();

                                        JTextArea area = new JTextArea(t[i].toString());

                                        area.setBounds(60, 60, 1000, 1000);

                                        f.add(area);
                                        f.setSize(1000, 1000);
                                        f.setLayout(null);
                                        f.setVisible(true);
                                 }


                                break;
                                case 13:
                                System.out.println("exiting!!");
                                TimeUnit.MICROSECONDS.sleep(2000000);
                                break;

                               default:
                                System.out.println("INVALID OPTION!!");
                                break;
                        }

                    } while (choice_teacher != 13);
                    break;
                case 3:
                    int class_choice = 0;
                    do {
                        System.out.printf(

                                "1- display all information about a class \n"
                                        + "2- get number of student in a class  \n"
                                        + "3-search a class by name\n"
                                        + "4-display the progam\n"
                                        + "5- exit\n");

                        System.out.println("choose what to do");
                        class_choice = input.nextInt();
                        input.nextLine();
                        switch (class_choice) {
                            case 1:
                                System.out.println("enter class level: ");
                                String classs = input.nextLine();
                                if (classs.toLowerCase().equals("s1g".toLowerCase())
                                        || classs.toLowerCase().equals("s2s".toLowerCase())
                                        || classs.toLowerCase().equals("s2h".toLowerCase())
                                        || classs.toLowerCase().equals("sv".toLowerCase())
                                        || classs.toLowerCase().equals("sg".toLowerCase())
                                        || classs.toLowerCase().equals("se".toLowerCase())) {
                                    System.out.println("student in class " + classs + "are: \n");
                                    for (int i = 0; i < nbOfStudents; i++) {
                                        if (st[i].stClass.toLowerCase().equals(classs.toLowerCase())) {
                                            System.out.println(st[i]);

                                        }

                                    }

                                } else {
                                    System.out.println("invalid class ");

                                }
                                break;
                            case 2:
                                int nb = 0;
                                System.out.println("enter class level: ");
                                String cclasss = input.nextLine();
                                if (cclasss.toLowerCase().equals("s1g".toLowerCase())
                                        || cclasss.toLowerCase().equals("s2s".toLowerCase())
                                        || cclasss.toLowerCase().equals("s2h".toLowerCase())
                                        || cclasss.toLowerCase().equals("sv".toLowerCase())
                                        || cclasss.toLowerCase().equals("sg".toLowerCase())
                                        || cclasss.toLowerCase().equals("se".toLowerCase())) {

                                    for (int i = 0; i < nbOfStudents; i++) {
                                        if (st[i].stClass.toLowerCase().equals(cclasss.toLowerCase())) {
                                            nb++;

                                        }
                                    }
                                    System.out.println("number: " + nb);

                                }
                                break;
                            case 3:
                                System.out.println("enter class level: ");
                                String cllasss = input.nextLine();

                                if (cllasss.toLowerCase().equals("s1g".toLowerCase())
                                        || cllasss.toLowerCase().equals("s2s".toLowerCase())
                                        || cllasss.toLowerCase().equals("s2h".toLowerCase())
                                        || cllasss.toLowerCase().equals("sv".toLowerCase())
                                        || cllasss.toLowerCase().equals("sg".toLowerCase())
                                        || cllasss.toLowerCase().equals("se".toLowerCase())) {

                                    System.out.println("class found!!");
                                    System.out.println(cllasss);
                                    for (int i = 0; i < nbOfStudents; i++) {
                                        if (st[i].stClass.toLowerCase().equals(cllasss)) {
                                            System.out.println(st[i]);
                                        }
                                    }
                                }

                                break;
                            case 4:
                                System.out.println("enter your choice(S1-S2S-S2H-SV-SE-SG)");
                                String choiceProg = input.nextLine();
                                if (choiceProg.toUpperCase().equals("S1".toUpperCase())) {
                                    System.out.printf("%50s ", "S1 \n ");
                                    System.out.printf("%1s ",
                                            "----------------------------------------------------------"
                                                    + "--------------------------------------------------------- \n ");
                                    System.out.printf("%15s ", "Moday ");
                                    System.out.printf("%15s ", "Tuesday");
                                    System.out.printf("%15s ", "Wednesday ");
                                    System.out.printf("%15s ", "Thursday");
                                    System.out.printf("%15s ", "Friday ");
                                    System.out.printf("%15s ", "Saturday");
                                    System.out.printf("%15s ", "Sunday \n");

                                    System.out.printf("%15s ", "BIOLOGIE");
                                    System.out.printf("%15s ", "CHIMIE");
                                    System.out.printf("%15s ", "ECONOMIE");
                                    System.out.printf("%15s ", "PHYSIQUE");
                                    System.out.printf("%15s ", "ARABE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "BIOLOGIE");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "CIVISME");
                                    System.out.printf("%15s ", "RELIGION");
                                    System.out.printf("%15s ", "GEOGRAPHIE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "HISTOIRE");
                                    System.out.printf("%15s ", "CHIMIE");
                                    System.out.printf("%15s ", "PHYSIQUE");
                                    System.out.printf("%15s ", "ARABE");
                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "GEOGRAPHIE");
                                    System.out.printf("%15s ", "ECONOMIE");
                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "CHIMIE");
                                    System.out.printf("%15s ", "RELIGION");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "ARABE");
                                    System.out.printf("%15s ", "ARABE");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "BIOLOGIE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                } else if (choiceProg.toLowerCase().equals("S2S".toLowerCase())) {
                                    System.out.printf("%50s ", "S2S \n ");
                                    System.out.printf("%1s ",
                                            "----------------------------------------------------------"
                                                    + "--------------------------------------------------------- \n ");
                                    System.out.printf("%15s ", "Moday ");
                                    System.out.printf("%15s ", "Tuesday");
                                    System.out.printf("%15s ", "Wednesday ");
                                    System.out.printf("%15s ", "Thursday");
                                    System.out.printf("%15s ", "Friday ");
                                    System.out.printf("%15s ", "Saturday");
                                    System.out.printf("%15s ", "Sunday \n");

                                    System.out.printf("%15s ", "BIOLOGIE");
                                    System.out.printf("%15s ", "CHIMIE");
                                    System.out.printf("%15s ", "ECONOMIE");
                                    System.out.printf("%15s ", "PHYSIQUE");
                                    System.out.printf("%15s ", "ARABE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "PHILOSOPHIE");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "CIVISME");
                                    System.out.printf("%15s ", "RELIGION");
                                    System.out.printf("%15s ", "GEOGRAPHIE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "HISTOIRE");
                                    System.out.printf("%15s ", "CHIMIE");
                                    System.out.printf("%15s ", "PHYSIQUE");
                                    System.out.printf("%15s ", "ARABE");
                                    System.out.printf("%15s ", "PHILOSOPHIE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "GEOGRAPHIE");
                                    System.out.printf("%15s ", "ECONOMIE");
                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "CHIMIE");
                                    System.out.printf("%15s ", "RELIGION");
                                    System.out.printf("%15s ", "PHILOSOPHIE");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "ARABE");
                                    System.out.printf("%15s ", "ARABE");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "BIOLOGIE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                } else if (choiceProg.toLowerCase().equals("S2H".toLowerCase())) {
                                    System.out.printf("%50s ", "S2H \n ");
                                    System.out.printf("%1s ",
                                            "----------------------------------------------------------"
                                                    + "--------------------------------------------------------- \n ");
                                    System.out.printf("%15s ", "Moday ");
                                    System.out.printf("%15s ", "Tuesday");
                                    System.out.printf("%15s ", "Wednesday ");
                                    System.out.printf("%15s ", "Thursday");
                                    System.out.printf("%15s ", "Friday ");
                                    System.out.printf("%15s ", "Saturday");
                                    System.out.printf("%15s ", "Sunday \n");

                                    System.out.printf("%15s ", "ECONOMIE");
                                    System.out.printf("%15s ", "CHIMIE");
                                    System.out.printf("%15s ", "ECONOMIE");
                                    System.out.printf("%15s ", "PHYSIQUE");
                                    System.out.printf("%15s ", "ARABE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "PHILOSOPHIE");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "CIVISME");
                                    System.out.printf("%15s ", "RELIGION");
                                    System.out.printf("%15s ", "GEOGRAPHIE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "HISTOIRE");
                                    System.out.printf("%15s ", "CHIMIE");
                                    System.out.printf("%15s ", "PHYSIQUE");
                                    System.out.printf("%15s ", "ARABE");
                                    System.out.printf("%15s ", "PHILOSOPHIE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "GEOGRAPHIE");
                                    System.out.printf("%15s ", "ECONOMIE");
                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "CHIMIE");
                                    System.out.printf("%15s ", "RELIGION");
                                    System.out.printf("%15s ", "PHILOSOPHIE");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "ECONOMIE");
                                    System.out.printf("%15s ", "ARABE");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "BIOLOGIE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                } else if (choiceProg.toLowerCase().equals("SV".toLowerCase())) {
                                    System.out.printf("%50s ", "SV \n ");
                                    System.out.printf("%1s ",
                                            "----------------------------------------------------------"
                                                    + "--------------------------------------------------------- \n ");
                                    System.out.printf("%15s ", "Moday ");
                                    System.out.printf("%15s ", "Tuesday");
                                    System.out.printf("%15s ", "Wednesday ");
                                    System.out.printf("%15s ", "Thursday");
                                    System.out.printf("%15s ", "Friday ");
                                    System.out.printf("%15s ", "Saturday");
                                    System.out.printf("%15s ", "Sunday \n");

                                    System.out.printf("%15s ", "BIOLOGIE");
                                    System.out.printf("%15s ", "CHIMIE");
                                    System.out.printf("%15s ", "BIOLOGIE");
                                    System.out.printf("%15s ", "PHYSIQUE");
                                    System.out.printf("%15s ", "ARABE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "PHILOSOPHIE");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "CIVISME");
                                    System.out.printf("%15s ", "RELIGION");
                                    System.out.printf("%15s ", "GEOGRAPHIE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "HISTOIRE");
                                    System.out.printf("%15s ", "CHIMIE");
                                    System.out.printf("%15s ", "PHYSIQUE");
                                    System.out.printf("%15s ", "ARABE");
                                    System.out.printf("%15s ", "PHILOSOPHIE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "GEOGRAPHIE");
                                    System.out.printf("%15s ", "BIOLOGIE");
                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "CHIMIE");
                                    System.out.printf("%15s ", "RELIGION");
                                    System.out.printf("%15s ", "PHILOSOPHIE");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "BIOLOGIE");
                                    System.out.printf("%15s ", "ARABE");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "BIOLOGIE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                } else if (choiceProg.toLowerCase().equals("SG".toLowerCase())) {
                                    System.out.printf("%50s ", "SG \n ");
                                    System.out.printf("%1s ",
                                            "----------------------------------------------------------"
                                                    + "--------------------------------------------------------- \n ");
                                    System.out.printf("%15s ", "Moday ");
                                    System.out.printf("%15s ", "Tuesday");
                                    System.out.printf("%15s ", "Wednesday ");
                                    System.out.printf("%15s ", "Thursday");
                                    System.out.printf("%15s ", "Friday ");
                                    System.out.printf("%15s ", "Saturday");
                                    System.out.printf("%15s ", "Sunday \n");

                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "CHIMIE");
                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "PHYSIQUE");
                                    System.out.printf("%15s ", "ARABE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "PHILOSOPHIE");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "CIVISME");
                                    System.out.printf("%15s ", "RELIGION");
                                    System.out.printf("%15s ", "GEOGRAPHIE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "HISTOIRE");
                                    System.out.printf("%15s ", "CHIMIE");
                                    System.out.printf("%15s ", "PHYSIQUE");
                                    System.out.printf("%15s ", "ARABE");
                                    System.out.printf("%15s ", "PHILOSOPHIE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "GEOGRAPHIE");
                                    System.out.printf("%15s ", "PHYSIQUE");
                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "CHIMIE");
                                    System.out.printf("%15s ", "RELIGION");
                                    System.out.printf("%15s ", "PHILOSOPHIE");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "PHYSIQUE");
                                    System.out.printf("%15s ", "ARABE");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                } else if (choiceProg.toLowerCase().equals("SE".toLowerCase())) {
                                    System.out.printf("%50s ", "SE \n ");
                                    System.out.printf("%1s ",
                                            "----------------------------------------------------------"
                                                    + "--------------------------------------------------------- \n ");
                                    System.out.printf("%15s ", "Moday ");
                                    System.out.printf("%15s ", "Tuesday");
                                    System.out.printf("%15s ", "Wednesday ");
                                    System.out.printf("%15s ", "Thursday");
                                    System.out.printf("%15s ", "Friday ");
                                    System.out.printf("%15s ", "Saturday");
                                    System.out.printf("%15s ", "Sunday \n");

                                    System.out.printf("%15s ", "ECONOMIE");
                                    System.out.printf("%15s ", "CHIMIE");
                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "PHYSIQUE");
                                    System.out.printf("%15s ", "ARABE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "PHILOSOPHIE");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "CIVISME");
                                    System.out.printf("%15s ", "RELIGION");
                                    System.out.printf("%15s ", "GEOGRAPHIE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "HISTOIRE");
                                    System.out.printf("%15s ", "CHIMIE");
                                    System.out.printf("%15s ", "PHYSIQUE");
                                    System.out.printf("%15s ", "ARABE");
                                    System.out.printf("%15s ", "ECONOMIE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "GEOGRAPHIE");
                                    System.out.printf("%15s ", "PHYSIQUE");
                                    System.out.printf("%15s ", "ECONOMIE");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "CHIMIE");
                                    System.out.printf("%15s ", "RELIGION");
                                    System.out.printf("%15s ", "PHILOSOPHIE");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                    System.out.printf("%15s ", "MATHS");
                                    System.out.printf("%15s ", "PHYSIQUE");
                                    System.out.printf("%15s ", "ARABE");
                                    System.out.printf("%15s ", "FRANCAIS");
                                    System.out.printf("%15s ", "ECONOMIE");
                                    System.out.printf("%15s ", "null");
                                    System.out.printf("%15s ", "null \n");

                                } else
                                    System.out.println("Error!! your choice should be (S1-S2S-S2H-SV-SE-SG)");
                                break;
                                
                                    
                            case 5:
                                System.out.println("exiting");
                                TimeUnit.MICROSECONDS.sleep(2000000);

                                break;
                        }

                    } while (class_choice != 5);
                case 4:
                    int school_choice = 0;
                    do {
                        System.out.println("1-set school name\n"
                                + "2-get school name\n"
                                + "3-set school address\n"
                                + "4 get school address\n"
                                + "5-get school classes\n"
                                + "6- throw all information into an external file\n"
                                + "7- throw all information into an external panel\n"
                                + "8-exit\n");
                        System.out.println("choose what to do");
                        school_choice = input.nextInt();
                        input.nextLine();
                        switch (school_choice) {
                            case 1:
                                System.out.println("enter school's name: ");
                                String scname = input.nextLine();

                                sc.setName(scname);
                                break;
                            case 2:
                                System.out.println("school's name: " + sc.getName());
                                break;
                            case 3:
                                System.out.println("enter the address");
                                String add = input.nextLine();
                                sc.setAddress(add);
                                break;
                            case 4:
                                System.out.println("school's address: " + sc.getAddress());
                                break;
                            case 5:
                                System.out.println("school's classes:\n");
                                sc.getAllClasses();
                                break;
                                case 6:
                                PrintWriter out = new PrintWriter("school.txt");

                                out.println(sc.toString());
                                out.close();
                                break;
                                case 7:
                                 JFrame f = new JFrame();

                                        JTextArea area = new JTextArea(sc.toString());

                                        area.setBounds(60, 60, 1000, 1000);

                                        f.add(area);
                                        f.setSize(1000, 1000);
                                        f.setLayout(null);
                                        f.setVisible(true);
                                        break;
                            case 8:
                                System.out.println("Exiting...");
                                break;

                            default:
                                System.out.println("error!!");
                        }

                    } while (school_choice != 8);
                    break;
                case 5:

                    int bus_choice = 0;
                    do {
                        System.out.printf(
                                "1- show students in the bus \n"
                                        + "2-show bus fees\n"
                                        + "3-exit\n");
                        System.out.println("enter your choice:");
                        bus_choice = input.nextInt();
                        switch (bus_choice) {
                            case 1:
                                System.out.println("students in the bus: ");
                                for (int i = 0; i < nbOfStudents; i++) {
                                    if (st[i].stInBus.toLowerCase().equals("y")) {
                                        System.out.println(st[i]);
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("bus fees: " + fmt.format(fees));
                                break;
                            case 3:
                                System.out.println("exiting...");
                                TimeUnit.MICROSECONDS.sleep(2000000);
                                break;

                            default:
                                System.out.println("INVALID OPTION!!!");
                                break;
                        }
                    } while (bus_choice != 3);
                    break;

                case 6:
                    System.out.println("exiting...");
                    TimeUnit.MICROSECONDS.sleep(2000000);

                    break;
                default:
                    System.out.println("invalid option!!");

            }

        } while (choice != 6);

    }
}