package com.mnd.package1;

public class Person {
    
    private int id;
    
    private String name;
    
    private int age;
    
    private double weight;
    
    private int score;
    
    private Location location;
    
    private Person() {}
    
    public static class PersonBuilder {
        
        Person person = new Person();
        
        public PersonBuilder id(int id, String name, int age) {
            person.id = id;
            person.name = name;
            person.age = age;
            return this;
        }
        
        public PersonBuilder weight(double weight) {
            person.weight = weight;
            return this;
        }
        
        public PersonBuilder score(int score) {
            person.score = score;
            return this;
        }
        
        public PersonBuilder location(String street, String roomNo) {
            person.location = new Location(street, roomNo);
            return this;
        }
        
        public Person build() {
            return person;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", score=" + score +
                ", location=" + location +
                '}';
    }
}
class Location {
    private final String street;
    private final String roomNo;

    public Location(String street, String roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }

    public String getStreet() {
        return street;
    }

    public String getRoomNo() {
        return roomNo;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", roomNo='" + roomNo + '\'' +
                '}';
    }
}
