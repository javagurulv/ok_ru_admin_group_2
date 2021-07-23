package student_alexander_zhukov.lesson_7.level_3;

abstract class Car {

    abstract void accelerate();

}

class ElectricCar extends Car {

    private int batteryCharge;

    public ElectricCar() {
        super();
    }

    @Override
    void accelerate() {

    }


}

class PetrolCar extends Car {

    private double petrolTankCapacity;

    public PetrolCar() {
        super();
    }

    @Override
    void accelerate() {

    }

}
