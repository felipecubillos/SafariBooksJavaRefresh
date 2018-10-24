package com.cubillosa;

public class Person {


    // Member variable.
    private String name;
    private String lastName;
    private int age;

    // static variables are shared with all object instances as the same value
    // unlike non static variables that are shared as different value depend of the instance
    private static int counter=0;
    //The constructor is initialized when the object is instanced, its function is initialize the variables of the object
    // is possible modify the parameters sent, it's possible too create multiple constructor or none

    private static final int DEFAULT_AGE = 18;
    private static final String DEFAULT_NAME ="UNKNOWN NAME";
    private static final String DEFAULT_LASTNAME = "UNKNOWN LASTNAME";

    public Person(String name, String lastName,int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    // Constructor that does not receive all parameters, so the constructor assign default values
    public Person(String name){
        this.name = name;
        this.lastName = DEFAULT_LASTNAME;
        this.setAge(DEFAULT_AGE);
    }

    public Person(){
        this.name = DEFAULT_NAME;
        this.lastName = DEFAULT_LASTNAME;
        this.setAge(DEFAULT_AGE);
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Person.counter = counter;
    }

    // Member functions or methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void incrementCounter(){
        setCounter(getCounter() + 1);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
