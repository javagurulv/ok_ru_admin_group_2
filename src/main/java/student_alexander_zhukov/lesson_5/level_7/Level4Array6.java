package student_alexander_zhukov.lesson_5.level_7;

public class Level4Array6 {
    public static void main(String[] args) {
        ArrayUtil myArrUtil = new ArrayUtil();
        int[] myArray = myArrUtil.createArray(myArrUtil.getRandomArrayLength());
        myArrUtil.fillArrayWithRandomNumbers(myArray);
        myArrUtil.printArrayToConsole(myArray);
        myArrUtil.printOddNumbers(myArray);
    }
}
