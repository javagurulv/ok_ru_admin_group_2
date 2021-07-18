package student_alexander_zhukov.lesson_5.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Level4Array4 {
    public static void main(String[] args) {
        ArrayUtil myArrUtil = new ArrayUtil();
        int[] myArray = myArrUtil.createArray(myArrUtil.getRandomArrayLength());
        myArrUtil.fillArrayWithRandomNumbers(myArray);
        myArrUtil.printArrayToConsole(myArray);
        myArrUtil.printEvenNumbers(myArray);
    }
}
