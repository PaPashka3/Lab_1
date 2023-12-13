package org.example.springlab1;

class House {
    private int houseNumber;
    private Apartment apartment;

    public House(Apartment apartment) {
        this.apartment = apartment;
        System.out.println("House bean is created");
    }

    public Apartment getApartment() {
        return apartment;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
}
