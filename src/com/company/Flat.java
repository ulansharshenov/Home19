package com.company;

public class Flat extends LivingPlaceAbstract {
    public Flat(String livingPlace, String address, int familyCount) {
        super(livingPlace, address, familyCount);
    }

    @Override
    public void pay() {
        System.out.println("Living place: " + getLivingPlace() + "\n" +
                "Address: " + getAddress() + "\n" + "Family members: " + getFamilyCount() + "\n" +
                "Pays for utility bill only.");
    }
}
