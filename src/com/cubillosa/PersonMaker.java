package com.cubillosa;

import java.util.ArrayList;
import java.util.List;

public class PersonMaker {

    public static void main(String args[]){

        // this two different objects fo person has independent values
        Person andres = new Person("Andres","Cubillos",27);
        Person diego = new Person("Diego");
        Person mrX = new Person();

        System.out.println("Value of counter is: "+diego.getCounter());
        andres.incrementCounter();
        System.out.println("Value of counter now is: "+diego.getCounter());

        // Static variables has are affected to all instances

        List<Person> listOfPerson = new ArrayList<>();
        listOfPerson.add(andres);
        listOfPerson.add(diego);
        listOfPerson.add(mrX);

        for (Person p:listOfPerson){
            System.out.println("Name : "+p.getName() + " Last Name: "+p.getLastName()+" Age: "+p.getAge());
        }
    }
}
