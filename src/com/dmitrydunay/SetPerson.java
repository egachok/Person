package com.dmitrydunay;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SetPerson {

    private final List<Person> persons = new ArrayList<Person>(100);

    String [] setFirstName = new String[]{"Adam", "Bob", "John", "Manny", "Fred"};

    public String getRandomFirstName(String [] setFirstName) {
        int random = new Random().nextInt(setFirstName.length);
        return setFirstName[random];
    }
    String firstName = getRandomFirstName(setFirstName);

    String [] setLastName = new String[]{"Smith", "Kerry", "Little", "Kelly", "Chan"};

    public String getRandomLastName(String[] setLastNameName) {
        int random = new Random().nextInt(setLastName.length);
        return setLastName[random];
    }
    String lastName = getRandomLastName(setLastName);

    int[] setAge = new int[(int) (Math.random() * 100)];

    public int getRandomAge(int [] setAge) {
        int random = new Random().nextInt(setAge.length);
        return setAge[random];
    }
    int age = getRandomAge(setAge);

    int[] setWeight = new int[(int) (Math.random() * 100)];

    public int getRandomWeight(int [] setWeight) {
        int random = new Random().nextInt(setWeight.length);
        return setWeight[random];
    }
    int weight = getRandomWeight(setWeight);

    int[] setHeight = new int[(int) (Math.random() * 100)];

    public int getRandomHeight(int [] setHeight) {
        int random = new Random().nextInt(setHeight.length);
        return setHeight[random];
    }
    int height = getRandomHeight(setHeight);

    public void addPerson(Person person) {
        persons.add(person);
    }

    @Override
    public String toString() {
        return "SetPerson{" +
                "persons=" + persons +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}