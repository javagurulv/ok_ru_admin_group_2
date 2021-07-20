package student_andrey_domas.lesson7.level2;

class Child implements Mother, Father {
    public static void main(String[] args) {
        var child = new Child();
        child.conception();
        child.resolve();
    }
}