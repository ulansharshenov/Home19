package com.company;

public abstract class LivingPlaceAbstract {
    private String livingPlace;
    private String address;
    private int familyCount;

    public LivingPlaceAbstract(String livingPlace, String address, int familyCount) {
        this.livingPlace = livingPlace;
        this.address = address;
        this.familyCount = familyCount;
    }

    public abstract void pay();

    public String getLivingPlace() {
        return livingPlace;
    }

    public void setLivingPlace(String livingPlace) {
        this.livingPlace = livingPlace;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFamilyCount() {
        return familyCount;
    }

    public void setFamilyCount(int familyCount) {
        this.familyCount = familyCount;
    }
}
