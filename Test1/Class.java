package Test1;

import java.util.Scanner;

public class Class {
    Scanner input = new Scanner(System.in);
    private String[] levelchoose = { "S1G", "S2S", "S2H", "SV", "SG", "SE", "LH" };
    private Student[] all_students;
    private Teacher[] all_teachers;
    private String level;
    private int nbOfStudents = 0;
    private int nbOfTeachers = 0;

    public Class() {

    }

    public Class(String level) {
        for (int i = 0; i < this.levelchoose.length; i++) {
            if (level.toUpperCase().equals(levelchoose[i])) {
                this.level = level.toUpperCase();
            }
        }
        if (level.toUpperCase().equals(this.level)) {
        } else {
            System.out.println("ivalid level,default S1G");
            this.level = "S1G";
        }

        this.all_students = new Student[30];
        this.all_teachers = new Teacher[30];
    }

    public Class(String level, Student[] st, Teacher[] teach) {
        for (int i = 0; i < this.levelchoose.length; i++) {
            if (level.toUpperCase().equals(levelchoose[i])) {
                this.level = level.toUpperCase();
            }
        }
        if (level.toUpperCase().equals(this.level)) {
        } else {
            System.out.println("ivalid level,default S1G");
            this.level = "S1G";
        }
        this.all_students = st;
        this.all_teachers = teach;
    }

    public void setLevel(String level) {
        for (int i = 0; i < this.levelchoose.length; i++) {
            if (level.toUpperCase().equals(levelchoose[i])) {
                this.level = level.toUpperCase();
            }
        }
        if (level.toUpperCase().equals(this.level)) {
        } else {
            System.out.println("ivalid level,default S1G");
            this.level = "S1G";
        }
    }

    public String getLevel() {
        return this.level;
    }

    public void setStudents(Student[] st) {
        this.all_students = st;
    }

    public void addStudent(String fname, String lname, int age, int year) {
        if (nbOfStudents < 100) {
            all_students[nbOfStudents] = new Student(fname, lname, age, year);
            nbOfStudents++;
            System.out.println("New student created successfully!\n");
        } else
            System.out.println("Error: Cannot add new student! \n");
    }

    public void deleteStudent(String fn, String ln) {
        Student tmp;
        int foundIndex = 0;
        boolean found = false;

        for (int i = 0; i < nbOfStudents; i++) {
            tmp = all_students[i];

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
                    all_students[i] = all_students[i + 1];
                }
                nbOfStudents--;
                System.out.println("Student deleted!\n");
            } else {
                System.out.println("undo delete");
            }
        } else
            System.out.println("Error: Student does not exist!\n");
    }

    public Student[] getStudents() {
        return this.all_students;
    }

    public void setTeachers(Teacher[] teach) {
        this.all_teachers = teach;
    }

    public void addTeacher(String fname, String lname, int age, int year) {
        if (nbOfTeachers < 100) {
            all_teachers[nbOfStudents] = new Teacher(fname, lname, age, year);
            nbOfTeachers++;
            System.out.println("New teacher created successfully!\n");
        } else
            System.out.println("Error: Cannot add new teacher! \n");
    }

    public void deleteTeacher(String fn, String ln) {
        Teacher tmp;
        int foundIndex = 0;
        boolean found = false;

        for (int i = 0; i < nbOfTeachers; i++) {
            tmp = all_teachers[i];

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
                for (int i = foundIndex; i < (nbOfTeachers - 1); i++) {
                    all_teachers[i] = all_teachers[i + 1];
                }
                nbOfTeachers--;
                System.out.println("Teacher deleted!\n");
            } else {
                System.out.println("undo delete");
            }
        } else
            System.out.println("Error: Teacher does not exist!\n");
    }

    public Teacher[] getTeachers() {
        return this.all_teachers;
    }

    public String toString() {
        String result = "class:" + this.level
                + "List of students:\n";
        for (int i = 0; i < this.all_students.length; i++) {
            result += this.all_students[i].toString() + "\n";
        }
        result += "List of teachers:\n";
        for (int i = 0; i < this.all_teachers.length; i++) {
            result += this.all_teachers[i].toString() + "\n";
        }
        return result;
    }

}