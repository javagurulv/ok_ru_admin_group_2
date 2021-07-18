package student_sergo_kurbanov.lesson_7.level_3;

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
    void accelerate() {

    }
}