package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class Disc {
    private String name;
    private int storageCapacity;
    private int usedCapacity = 0;
    private int remainingCapacity;
    private String discType;
    private int maxSpeed;
    private ArrayList<String> contents;

    public Disc(String name, int storageCapacity,  String discType, int maxSpeed) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.remainingCapacity = this.storageCapacity;
        this.discType = discType;
        this.maxSpeed = maxSpeed;
    }

    public void writeData(int dataUsed , ArrayList<String> data){
        this.contents = data;
        this.usedCapacity += dataUsed;
        this.remainingCapacity = (remainingCapacity - usedCapacity);
        System.out.println("The write was successful, the remaining capacity is "+ this.remainingCapacity);
    }

    public void showInfo(){
        System.out.println("The disc's capacity is: "+ this.storageCapacity+ " the remaining capacity is: "+ this.remainingCapacity + " and the type is: "+ this.discType+".");
    }

    public void showContent(){
        System.out.println("Tittle's names");
        for (String x: this.contents) {
            System.out.println(x);
        }
    }


}
