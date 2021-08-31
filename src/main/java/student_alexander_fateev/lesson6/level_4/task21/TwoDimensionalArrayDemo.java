package student_alexander_fateev.lesson6.level_4.task21;

class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        TwoDimensionalArray myArray = new TwoDimensionalArray();
        int [][] newArray = myArray.create2dArray();

        // Print array
        for (int [] i: newArray) {
            for (int j: i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        // Print sum of all array elements
        int sum = myArray.calculateSumOfElements(newArray);
        System.out.println("Sum: " + sum);
    }
}
