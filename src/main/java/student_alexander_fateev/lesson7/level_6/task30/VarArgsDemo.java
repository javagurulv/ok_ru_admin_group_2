package student_alexander_fateev.lesson7.level_6.task30;

class VarArgsDemo {
    public static void main(String[] args) {
        VarArgs test = new VarArgs();

        System.out.println("3 numbers sum: " + test.getSum(2,4,5));
        System.out.println("5 numbers sum: " + test.getSum(2,4,5,1,3));
    }
}
