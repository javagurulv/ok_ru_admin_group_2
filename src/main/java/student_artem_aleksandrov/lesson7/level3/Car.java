package student_artem_aleksandrov.lesson7.level3;

abstract class Car {

    abstract void accelerate();

}

class ElectricCar extends Car {

    private int batteryCharge;


    @Override
    void accelerate() {

    }
}

class PetrolCar extends Car {

    private double petrolTankCapacity;

    @Override
    void accelerate(){

    }

}

