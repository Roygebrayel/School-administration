package Test1;

public abstract class Person {

    protected String firstName;
    protected String lastName;
    protected int age;
    protected int id;
    protected int year;

    public Person() {

    }

    public Person(String firstName, String lastName, int age, int year) {
        int id = (int) (Math.random() * 10000 + 8999);
        this.id = id;

        this.firstName = firstName;
        this.lastName = lastName;
        if (age >= 13 || age <= 64)
            this.age = age;
        else
            this.age = 14;

        if (year >= 2000 || age <= 2023)
            this.year = year;
        else
            this.year = 2000;
    }

    public String toStirng() {
        return "name: " + this.firstName + " last name: " + this.lastName + " age: " + this.age + " id: " + this.year
                + this.id;
    }
}