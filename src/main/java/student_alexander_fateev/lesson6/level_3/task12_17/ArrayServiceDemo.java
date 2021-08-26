package student_alexander_fateev.lesson6.level_3.task12_17;

class ArrayServiceDemo {
    public static void main(String[] args) {
        ArrayService myArray = new ArrayService();
        int [] numbers = {3,6,8,10,4,7,4,0,4};
        int numberToSearch = 4;

        System.out.print("Array: ");
        myArray.printArrayElements(numbers);

        // Check if array contains number
        boolean contains = myArray.contains(numbers, numberToSearch);
        System.out.println("Array contains number " + numberToSearch + ": " + contains);

        // Check how many entries of number array contains
        int entriesNumber = myArray.numberOfEntries(numbers, numberToSearch);
        System.out.println("Number of entries in array: " + entriesNumber);

        // Substitute first entry of number
        int newNumber = 18;
        boolean result = myArray.substituteFirstEntry(numbers, numberToSearch, newNumber);
        System.out.print("Substitute first entry of " + numberToSearch + " by " + newNumber + " in array: ");
        if (result == true) {
            myArray.printArrayElements(numbers);
        }
        else {
            System.out.println("no entries found");
        }

        // Substitute all entries of number
        System.out.print("Substitute all entries of " + numberToSearch + " by " + newNumber + " in array: ");
        int entries = myArray.substituteAllEntries(numbers, numberToSearch, newNumber);
        System.out.println(entries + " entries where substituted");

        // Reverse array
        int [] reversedArray = myArray.reverseArray(numbers);
        System.out.print("Reversed array: ");
        myArray.printArrayElements(reversedArray);

        // Sort array
        myArray.sortArray(numbers);
        myArray.printArrayElements(numbers);
    }
}
