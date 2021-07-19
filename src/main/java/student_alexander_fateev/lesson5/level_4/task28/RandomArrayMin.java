package student_alexander_fateev.lesson5.level_4.task28;

class RandomArrayMin {
    public static void main(String[] args) {
        int arrayLenght = 5;
        int [] numbers = new int[arrayLenght];
        int minValue = 0;

        for (int i=0; i<arrayLenght; i++) {
            numbers[i] = (int) (Math.random()*100);
            if ((i == 0) || numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }

        for (int i=0; i<arrayLenght; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.print("\nMinimal element of array = " + minValue);
    }
}
