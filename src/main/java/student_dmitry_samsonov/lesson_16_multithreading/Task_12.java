package student_dmitry_samsonov.lesson_16_multithreading;

import java.util.concurrent.atomic.AtomicIntegerArray;

class Task_12 implements Runnable{
    Integer[][] matrixA;
    Integer[][] matrixB;
    int[][] result;
    AtomicIntegerArray[] tasks;

    public Task_12(Integer[][] matrixA, Integer[][] matrixB) throws Exception {
        Integer rowsA = matrixA.length;
        if (rowsA.equals(0)) {
            throw new Exception("Row number of the first matrix cannot be zero");
        }
        Integer colsA = matrixA[0].length;
        if (colsA.equals(0)) {
            throw new Exception("Column number of the first matrix cannot be zero");
        }
        Integer rowsB = matrixB.length;
        if (!rowsB.equals(colsA)) {
            throw new Exception("Row number of the second matrix must be equal to column number of the first matrix");
        }
        Integer colsB = matrixB[0].length;
        if (colsB.equals(0)) {
            throw new Exception("Column number of the second matrix cannot be zero");
        }
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.result = new int[rowsA][colsB];
        this.tasks = new AtomicIntegerArray[rowsA];
        for (int row=0; row<this.tasks.length; row++) {
            AtomicIntegerArray newRow = new AtomicIntegerArray(1);
            newRow.set(0, 0);
            this.tasks[row] = newRow;
        }
    }

    @Override
    public void run() {
        for (int i=0; i<this.tasks.length; i++) {
            boolean ready = false;
            synchronized (this.tasks[i]) {
                if (this.tasks[i].get(0) == 0) {
                    this.tasks[i].set(0, 1);
                    ready = true;
                }
            }
            if (ready) {
                for (int j = 0; j < this.matrixA[0].length; j++) {
                    for (int k = 0; k < this.matrixB[0].length; k++) {
                        this.result[i][k] += this.matrixA[i][j] * this.matrixB[j][k];
                    }
                }
            }
        }
    }
}
