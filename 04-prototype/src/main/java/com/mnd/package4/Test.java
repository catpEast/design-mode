package com.mnd.package4;

/**
 * 深拷贝处理，String需要进一步克隆吗
 * StringBuilder是可变字符串
 */

public class Test {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Person personCopy = (Person) person.clone();

        System.out.println(person.location.street == personCopy.location.street);

        person.location.street.reverse();
        System.out.println(person.location.street == personCopy.location.street);
        System.out.println(person.location.street);
        System.out.println(personCopy.location.street);
        
    }
}

class Person implements Cloneable {
    int age;

    int score;

    Location location;

    public Person() {
        this.age = 20;
        this.score = 100;
        this.location = new Location(new StringBuilder("一号大街"), 201);
    }

    public Person(int age, int score, Location location) {
        this.age = age;
        this.score = score;
        this.location = location;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();
        clone.location = (Location) this.location.clone();
        return clone;
    }
}

class Location implements Cloneable {
    StringBuilder street;
    int roomNo;

    public Location(StringBuilder street, int roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", roomNo=" + roomNo +
                '}';
    }
}
