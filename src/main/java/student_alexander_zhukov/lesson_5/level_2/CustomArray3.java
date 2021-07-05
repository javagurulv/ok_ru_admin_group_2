package student_alexander_zhukov.lesson_5.level_2;

import java.util.Random;

class CustomArray3 {
    public static void main(String[] args) {
        int[] myArray = new int[3];

        Random random = new Random();

        myArray[0] = random.nextInt(100);
        myArray[1] = random.nextInt(50);
        myArray[2] = random.nextInt(10);

        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
    }
}
