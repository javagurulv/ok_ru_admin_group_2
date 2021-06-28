package student_andrey_tryapichnikov.lesson_4.level_3;

// we only need to find the highest value, the rest does not matter no point
// in comparing all the numbers, just compare them in sequence gradually
// replacing the return value with the max number available

// sadly I only know how to do slices in Python, so there is one meaningless operation
// of testing the first value against itself
public class GetMax {
    static int getMax(int[] numbers) {
        int maxNum = numbers[0];
        for (int n: numbers) {
            if (n > maxNum) maxNum = n;
        }
        return maxNum;
    }
}
