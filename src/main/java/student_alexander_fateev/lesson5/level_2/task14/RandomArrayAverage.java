package student_alexander_fateev.lesson5.level_2.task14;

class RandomArrayAverage {
    public static void main(String[] args) {
        int [] numbers = new int[3];

        for (int i=0; i<=2; i++) {
            numbers[i] = (int) (Math.random()*100);
        }

        double average = ((double) numbers[0] + (double) numbers[1] + (double) numbers[2]) / 3;
        System.out.println("Average = " + average);
    }

}
