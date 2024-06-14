package com.mnd.package1;

/**
 * 浅拷贝
 */

public class Test {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Person personCopy = (Person) person.clone();

        System.out.println(person == personCopy);
        System.out.println(person.age == personCopy.age);
        System.out.println(person.score == personCopy.score);
        System.out.println(person.location == personCopy.location);
    }
}

class Person implements Cloneable {
    int age;

    int score;

    Location location;

    public Person() {
        this.age = 20;
        this.score = 100;
        this.location = new Location("一号大街", 201);
    }

    public Person(int age, int score, Location location) {
        this.age = age;
        this.score = score;
        this.location = location;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Location {
    String street;
    int roomNo;

    public Location(String street, int roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", roomNo=" + roomNo +
                '}';
    }
}
