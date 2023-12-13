package org.example.springlab1;

class Apartment {

    private int roomsCount;
    private Person resident;

    public Apartment(Person resident) {
        this.resident = resident;
        System.out.println("Apartment bean is created");
    }

    public Person getResident() {
        return resident;
    }

    public int getRoomsCount() {
        return roomsCount;
    }

    public void setRoomsCount(int roomsCount) {
        this.roomsCount = roomsCount;
    }
}
