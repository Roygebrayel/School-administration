package Test1;

import java.util.Scanner;

import java.util.Scanner;

public class Class {
    Scanner input = new Scanner(System.in);
    private String[] levelchoose = { "S1G", "S2S", "S2H", "SV", "SG", "SE", "LH" };
    private Student[] all_students;
    private Teacher[] all_teachers;
    private String level;

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

    public Student[] getStudents() {
        return this.all_students;
    }

    public void setTeachers(Teacher[] teach) {
        this.all_teachers = teach;
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