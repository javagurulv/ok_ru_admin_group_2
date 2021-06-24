package student_alexander_fateev.lesson3.level_7.task31;

class ProductDemo {
    public static void main(String[] args) {
        Product cheburek = new Product("Cheburek");
        cheburek.discount = 10;
        cheburek.regularPrice = 130;
        cheburek.printInformation();
        System.out.println("Actual price: " + cheburek.actualPrice());
    }
}
