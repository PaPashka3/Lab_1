package org.example.springlab1;

class Street {
    private String name;
    private House house;

    public Street(House house) {
        this.house = house;
        System.out.println("Street bean is created");
    }

    public House getHouse() {
        return house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
