package org.launchcode.studio7;

public class DVD extends Disc implements TheSpinner {
    public DVD(String name, int storageCapacity,  String discType, int maxSpeed){
        super(name, storageCapacity, discType, maxSpeed);

    }
    // TODO: Implement your custom interface.
    public void spinDisc(){
        System.out.println("The movie is now playing");
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
