package com.company;

public class Dormitory extends LivingPlaceAbstract {
    public Dormitory(String livingPlace, String address, int familyCount) {
        super(livingPlace, address, familyCount);
    }

    @Override
    public void pay() {
        System.out.println("Living place: " + getLivingPlace() + "\n" +
                "Address: " + getAddress() + "\n" + "Family members: " + getFamilyCount() + "\n" +
                "Pays for rent only.");
    }
}
