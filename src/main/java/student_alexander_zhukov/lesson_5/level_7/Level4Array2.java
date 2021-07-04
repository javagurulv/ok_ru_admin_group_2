package student_alexander_zhukov.lesson_5.level_7;

class Level4Array2 {
    public static void main(String[] args) {
        ArrayUtil myArrUtil = new ArrayUtil();
        int[] myArray = myArrUtil.createArray(myArrUtil.inputArrayLength());
        myArrUtil.fillArrayWithRandomNumbers(myArray);
        myArrUtil.printArrayToConsole(myArray);
    }
}
