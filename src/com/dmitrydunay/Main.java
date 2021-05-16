package com.dmitrydunay;

public class Main {

    public static void main(String[] args) {

        SetPerson setPerson = new SetPerson();
        setPerson.addPerson(new Person
                (setPerson.firstName,
                        setPerson.lastName,
                        setPerson.age,
                        setPerson.weight,
                        setPerson.height));

        System.out.println(setPerson);
    }
}