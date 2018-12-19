package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class Kennel {

    private ArrayList<Pet> petList;

    public Kennel(Pet... pets) {
        this.petList = new ArrayList<Pet>(Arrays.asList(pets));
    }


    public void allSpeak() {
        for (int i =0;i<petList.size();i++) {

            System.out.println(petList.get(i).getName() +" "+ petList.get(i).speak());
        }
    }
}