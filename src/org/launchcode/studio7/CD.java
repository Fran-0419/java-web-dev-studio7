package org.launchcode.studio7;

public class CD extends Disc implements TheSpinner{
    public CD(String name, int storageCapacity,  String discType, int maxSpeed){
        super(name, storageCapacity, discType, maxSpeed);

    }
    // TODO: Implement your custom interface.
    @Override
    public void spinDisc(){
        System.out.println("the disc is now playing");
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
