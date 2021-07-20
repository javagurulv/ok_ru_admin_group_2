package student_andrey_domas.lesson7.level6;

public class VarArgsDemo {

    static void printNumbers(int... arrrr) {
        for (var i: arrrr)
            System.out.println(i);
    }

    public static void main(String[] args) {
        printNumbers(1, 2, 3);
        printNumbers(4, 5);
        printNumbers(6);
    }
}
