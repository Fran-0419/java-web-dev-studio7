package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCd = new CD("Rock",650,"Re-writable",500);
        DVD movieDVD = new DVD("Horror movies",15,"Re-writable", 1600);
        // TODO: Call each CD and DVD method to verify that they work as expected.
        ArrayList<String> theContent = new ArrayList<>();
        theContent.add("Blow");
        theContent.add("Take me to church");
        theContent.add("Beggin");

        ArrayList<String> theContent2 = new ArrayList<>();
        theContent2.add("Friday the 13");
        theContent2.add("Predator");
        theContent2.add("Child's play");


        myCd.spinDisc();
        movieDVD.spinDisc();

        myCd.writeData(234,theContent);
        movieDVD.writeData(9,theContent2);

        myCd.showInfo();
        movieDVD.showInfo();

        myCd.showContent();
        movieDVD.showContent();

    }
}
