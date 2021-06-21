package student_andrey_domas.lesson3.level7;

class Computer {

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

}
