package student_alexander_zhukov.lesson_5.level_7;

class Level4Array3 {
    public static void main(String[] args) {
        ArrayUtil myArrUtil = new ArrayUtil();
        int[] myArray = myArrUtil.createArray(myArrUtil.getRandomArrayLength());
        myArrUtil.fillArrayWithRandomNumbers(myArray);
        myArrUtil.printArrayToConsole(myArray);
        System.out.println("Maximum:  " + myArrUtil.findMaxNumber(myArray));
    }
}