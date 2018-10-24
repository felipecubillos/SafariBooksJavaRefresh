package com.cubillosa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListArray {


    public static void main(String args[])
    {
        // array have a fix length, it's not possible change the length after its definition
        int [] arrayOfInteger = new int[4];

        arrayOfInteger[0]= 1;
        arrayOfInteger[1]= 11;
        arrayOfInteger[2]= 111;
        arrayOfInteger[3]= 1111;

        // another way to declare an array

        String[] arrayOfStrings = {"name","lastName","city","postalCode"};

        for (String column:arrayOfStrings){
            System.out.println(column);
        }

        // Declare a List, remember List only can be define with references types, not primitives
        List<Integer> listOfInteger = new ArrayList<>();
        List<String> listOfString = new ArrayList<>();

        for(int i=0; i<arrayOfInteger.length;i++){

            listOfInteger.add(arrayOfInteger[i]);
            listOfString.add(arrayOfStrings[i]);
        }

        for(int i=0; i<listOfInteger.size();i++){

            System.out.println("The value inside list is: "+listOfString.get(i));
        }


        // maps are pairs of key and value
        Map<String,Integer> mapKeyValue = new HashMap<>();

        // add some values to map
        for(int i=0; i<arrayOfInteger.length; i++){
            mapKeyValue.put(arrayOfStrings[i],arrayOfInteger[i]);
        }
        // define a key to search inside the map
        String someKey = "postalCode";

        // check the presence of some key
        if(mapKeyValue.containsKey(someKey)){
            System.out.println("The key: "+someKey +" was found with the value : "+ mapKeyValue.get(someKey));
        }else{
            System.out.println("Key not found");
        }

        for(String key:mapKeyValue.keySet()){
            System.out.println("the key: "+ key + " Corresponding value: "+ mapKeyValue.get(key) );
        }

    }
}
