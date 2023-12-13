package org.example.springlab1;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person bean is created");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
