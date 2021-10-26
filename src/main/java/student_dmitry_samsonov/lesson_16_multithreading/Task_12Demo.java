package student_dmitry_samsonov.lesson_16_multithreading;

import java.util.Random;

class Task_12Demo {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Integer[][] matrixA = new Integer[1000][100];
        Integer[][] matrixB = new Integer[100][100000];
        for (int i=0; i<matrixA.length; i++){
            for (int j=0; j<matrixA[i].length; j++){
                matrixA[i][j] = random.nextInt(5);
            }
        }
        for (int i=0; i<matrixB.length; i++){
            for (int j=0; j<matrixB[i].length; j++){
                matrixB[i][j] = random.nextInt(5);
            }
        }
        Task_12 task_12 = new Task_12(matrixA, matrixB);

        int thread_count = 100;
        Thread[] threads = new Thread[thread_count];
        for (int i = 0; i<thread_count; i++) {
            threads[i] = new Thread(task_12, Integer.toString(i));
            threads[i].start();
        }

        try {
            for (Thread thread: threads) {
                thread.join();
            }
        } catch (InterruptedException ignored) {
        }
// This is slow
//        for (int i = 0; i < task_12.result.length; i++) {
//            for (int k = 0; k < task_12.result[i].length; k++) {
//                System.out.print(task_12.result[i][k] + " ");
//            }
//            System.out.println("");
//        }
    }
}
