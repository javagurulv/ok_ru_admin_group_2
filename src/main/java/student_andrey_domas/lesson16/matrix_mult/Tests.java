package student_andrey_domas.lesson16.matrix_mult;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    private int[][] A1 = {
            {2, 0 , -1},
            {0, -2, 2},
    };

    private int[][] B1 = {
            {4, 1 , 0},
            {3, 2, 1},
            {0, 1, 0},
    };

    private int[][] expected1 = {
            {8, 1 , 0},
            {-6, -2, -2},
    };

    private int[][] A2 = {
            {2, 1 , 1},
            {3, 0, 1},
    };

    private int[][] B2 = {
            {3, 1},
            {2, 1},
            {1, 0},
    };

    private int[][] expected2 = {
            {9, 3},
            {10, 3},
    };

    private int[][] A3 = {
            {3, 2 , 1},
            {0, 1, 2},
    };

    private int[][] B3 = {
            {1},
            {2},
            {3},
    };

    private int[][] expected3 = {
            {10},
            {8},
    };

    private int[][] A4 = {
            {2},
            {1},
            {3},
    };

    private int[][] B4 = {
            {1, 2, 3},
    };

    private int[][] expected4 = {
            {2, 4, 6},
            {1, 2, 3},
            {3, 6, 9},
    };

    @Test
    public void plainOldJavaSingleThread1() {
        int[][] c = MatrixMult.plainOldJavaSingleThread(A1, B1);
        Assert.assertArrayEquals(expected1, c);
    }

    @Test
    public void plainOldJavaSingleThread2() {
        int[][] c = MatrixMult.plainOldJavaSingleThread(A2, B2);
        Assert.assertArrayEquals(expected2, c);
    }

    @Test
    public void plainOldJavaSingleThread3() {
        int[][] c = MatrixMult.plainOldJavaSingleThread(A3, B3);
        Assert.assertArrayEquals(expected3, c);
    }

    @Test
    public void plainOldJavaSingleThread4() {
        int[][] c = MatrixMult.plainOldJavaSingleThread(A4, B4);
        Assert.assertArrayEquals(expected4, c);
    }

    @Test
    public void plainOldJavaMultiThread1() throws InterruptedException {
        int[][] c = MatrixMult.plainOldJavaMultiThread(A1, B1);
        Assert.assertArrayEquals(expected1, c);
    }

    @Test
    public void plainOldJavaMultiThread2() throws InterruptedException {
        int[][] c = MatrixMult.plainOldJavaMultiThread(A2, B2);
        Assert.assertArrayEquals(expected2, c);
    }

    @Test
    public void plainOldJavaMultiThread3() throws InterruptedException {
        int[][] c = MatrixMult.plainOldJavaMultiThread(A3, B3);
        Assert.assertArrayEquals(expected3, c);
    }

    @Test
    public void plainOldJavaMultiThread4() throws InterruptedException {
        int[][] c = MatrixMult.plainOldJavaMultiThread(A4, B4);
        Assert.assertArrayEquals(expected4, c);
    }

    @Test
    public void streamParallel1() {
        int[][] c = MatrixMult.streamParallel(A1, B1);
        Assert.assertArrayEquals(expected1, c);
    }

    @Test
    public void streamParallel2() {
        int[][] c = MatrixMult.streamParallel(A2, B2);
        Assert.assertArrayEquals(expected2, c);
    }

    @Test
    public void streamParallel3() {
        int[][] c = MatrixMult.streamParallel(A3, B3);
        Assert.assertArrayEquals(expected3, c);
    }

    @Test
    public void streamParallel4() {
        int[][] c = MatrixMult.streamParallel(A4, B4);
        Assert.assertArrayEquals(expected4, c);
    }
}
