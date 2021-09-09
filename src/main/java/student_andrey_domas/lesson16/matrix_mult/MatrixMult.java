package student_andrey_domas.lesson16.matrix_mult;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class MatrixMult {

    static void multiplicationAsserts(int[][] a, int[][] b) {
        assert a.length == b[0].length || b.length == a[0].length;
    }

    static int[][] plainOldJavaSingleThread(int[][] a, int[][] b) {
        multiplicationAsserts(a, b);
        final int aRows = a.length;
        final int bCols = b[0].length;
        int[][] rv = new int[aRows][bCols];
        for (int row = 0; row < aRows; row++) {
            for (int col = 0; col < bCols; col++) {
                for (int i = 0; i < b.length; i++) {
                    rv[row][col] += a[row][i] * b[i][col];
                }
            }
        }
        return rv;
    }

    static int[][] plainOldJavaMultiThread(int[][] a, int[][] b) throws InterruptedException {
        multiplicationAsserts(a, b);

        final int aRows = a.length;
        final int bCols = b[0].length;

        final CountDownLatch latch = new CountDownLatch(aRows * bCols);

        class Job implements Runnable {
            final private int row;
            final private int col;
            private int result = 0;

            public Job(int row, int col) {
                this.row = row;
                this.col = col;
            }

            @Override
            public void run() {
                for (int i = 0; i < b.length; i++) {
                    result += a[row][i] * b[i][col];
                }
                latch.countDown();
            }

        }

        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        List<Job> jobs = new LinkedList<>();

        for (int row = 0; row < aRows; row++) {
            for (int col = 0; col < bCols; col++) {
                Job job = new Job(row, col);
                jobs.add(job);
                executor.execute(job);
            }
        }
        latch.await();
        int[][] rv = new int[aRows][bCols];
        for (Job job : jobs) {
            rv[job.row][job.col] = job.result;
        }
        return rv;
    }

    static int[][] streamParallel(int[][] a, int[][] b) {
        return Arrays.stream(a)
                .parallel()
                .map(rowA -> IntStream.range(0, b[0].length)
                        .map(colB -> IntStream.range(0, b.length)
                                .map(i -> rowA[i] * b[i][colB]).sum())
                        .toArray())
                .toArray(int[][]::new);
    }
}
