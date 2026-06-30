package Phase_01.ch_03;

public class Car {
    private String model;
    private String make;
    private int year;

    public Car(String model, String make, int year) {
        this.model = model;
        this.make = make;
        this.year = year;
    }

    public void startEngine(){
        System.out.println("The [ " + make + " ] [ " + model + " ] 's engine has started.");
    }
    
}

    /*"The [make] [model]'s engine has started."*/