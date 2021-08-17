package student_alexander_zhukov.lesson_7.level_6;

import java.util.Arrays;

class VarArgsExample {
    public static void main(String[] args) {
        VarArgsExample example = new VarArgsExample();
        int sum = example.sum(10, 4, 5, 7, 59);
        System.out.println(sum);
    }
    int sum(int... numbers) {
        return Arrays.stream(numbers).sum();
    }
}
