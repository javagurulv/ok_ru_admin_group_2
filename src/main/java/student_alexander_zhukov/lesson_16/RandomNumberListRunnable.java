package student_alexander_zhukov.lesson_16;

import java.util.Random;

class RandomNumberListRunnable implements Runnable {
    private RandomNumberList rList;

    public RandomNumberListRunnable (RandomNumberList rList) {
        this.rList = rList;
    }

    @Override
    public void run() {
        Random rndInt = new Random();
        for (int i=0; i < 10; i++ ) {
            rList.add(rndInt.nextInt(10000));
            System.out.printf("[%s] [%s]\n", Thread.currentThread().getName(), rList.size());
        }
    }
}
