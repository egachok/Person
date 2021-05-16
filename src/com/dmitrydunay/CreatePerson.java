package com.dmitrydunay;

import java.util.ArrayList;

public class CreatePerson {

    ArrayList<Person> persons = new ArrayList<Person>(100); {
        for (int i = 0; i < 100; i++) {
            Person element = new Person();
            persons = new ArrayList<Person>();
            persons.add(element);
        }
    }
}