package com.company;

public class Hotel extends LivingPlaceAbstract{
    public Hotel(String livingPlace, String address, int familyCount) {
        super(livingPlace, address, familyCount);
    }

    @Override
    public void pay() {
        System.out.println("Living place: " + getLivingPlace() + "\n" +
                "Address: " + getAddress() + "\n" + "Family members: " + getFamilyCount() + "\n" +
                "Pays for rent only.");
    }
}
