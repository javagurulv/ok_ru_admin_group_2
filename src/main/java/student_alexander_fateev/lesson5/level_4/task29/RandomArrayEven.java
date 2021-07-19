package student_alexander_fateev.lesson5.level_4.task29;

class RandomArrayEven {
    public static void main(String[] args) {
        int arrayLenght = 5;
        int [] numbers = new int[arrayLenght];

        for (int i=0; i<arrayLenght; i++) {
            numbers[i] = (int) (Math.random()*100);
        }

        for (int i=0; i<arrayLenght; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.print("\nEven elements of array: ");
        boolean gotEven = false;
        for (int i=0; i<arrayLenght; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
                gotEven = true;
            }
        }

        if (gotEven == false) {
            System.out.print("None");
        }
    }
}
