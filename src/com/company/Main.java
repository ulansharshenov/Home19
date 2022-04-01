package com.company;

public class Main {

    public static void main(String[] args) {
        LivingPlaceAbstract family1 = new Flat("Flat", "Djal mkrn", 5);
        LivingPlaceAbstract family2 = new Dormitory("Dormitory", "Tunguch nkrn", 3);
        LivingPlaceAbstract family3 = new Hotel("Hotel", "Manasa 16", 2);

        family1.pay();
        System.out.println();
        family2.pay();
        System.out.println();
        family3.pay();
    }
}
