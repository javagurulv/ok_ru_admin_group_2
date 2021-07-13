package student_andrey_domas.lesson6.level3;

import org.junit.Test;

import java.util.Arrays;

public class ArrayServiceTest {
    @Test
    public void containsTrueTest() {
        int arr[] = {1, 2, 3, 4};
        assert ArrayService.contains(arr, 2);
    }

    @Test
    public void containsFalseTest() {
        int arr[] = {1, 2, 3, 4};
        assert !ArrayService.contains(arr, 5);
    }

    @Test
    public void occurrencesTestThree() {
        int arr[] = {1, 2, 2, 4, 2, 6};
        assert ArrayService.countOccurrences(arr, 2) == 3;
    }

    @Test
    public void occurrencesTestZero() {
        int arr[] = {1, 2, 2, 4, 2, 6};
        assert ArrayService.countOccurrences(arr, 7) == 0;
    }

    @Test
    public void replaceFirstTestTrue() {
        int arr[] = {1, 2, 2, 3};
        int arr_replaced[] = {1, 100, 2, 3};
        assert ArrayService.replaceFirst(arr, 2, 100);
        assert Arrays.equals(arr, arr_replaced);
    }

    @Test
    public void replaceFirstTestFalse() {
        int arr[] = {1, 2, 3, 4};
        int arr_orig[] = arr.clone();
        assert !ArrayService.replaceFirst(arr, 5, 100);
        assert Arrays.equals(arr, arr_orig);
    }

    @Test
    public void replaceAllTest() {
        int arr[] = {1, 2, 3, 4, 3};
        int arr_replaced[] = {1, 2, 100, 4, 100};
        assert ArrayService.replaceAll(arr, 3, 100) == 2;
        assert Arrays.equals(arr, arr_replaced);
    }

    @Test
    public void replaceAllTestNoOne() {
        int arr[] = {1, 2, 3, 4, 3};
        int arr_orig[] = arr.clone();
        assert ArrayService.replaceAll(arr, 7, 100) == 0;
        assert Arrays.equals(arr, arr_orig);
    }

    @Test
    public void revertTest() {
        for (int arr_length=5; arr_length<=1000; arr_length++) {

            int arr[] = new int[arr_length];
            int arr_reverted[] = new int[arr_length];
            for (int i = 0; i < arr_length; i++) {
                arr[i] = i;
                arr_reverted[arr_length - i - 1] = i;
            }

            ArrayService.revert(arr);
            assert Arrays.equals(arr, arr_reverted);
        }
    }

    @Test
    public void sortTest() {
        int arr[] = {0, -1, 2, 3, 3, 6, 5, 7, 8, 9, 11};
        int arr_sorted[] = {-1, 0, 2, 3, 3, 5, 6, 7, 8, 9, 11};
        ArrayService.sort(arr);
        assert Arrays.equals(arr, arr_sorted);
    }

}
