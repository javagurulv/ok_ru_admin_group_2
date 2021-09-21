package student_dmitry_samsonov.lesson_16_multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class RandomNumberList implements Runnable{

    private List<Integer> randomNumbers = new ArrayList<>();

    public void add(int randomNumber) {
        this.randomNumbers.add(randomNumber);
    }

    public int size() {
        return this.randomNumbers.size();
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++){
            Random random = new Random();
           add(random.nextInt());
            System.out.println(size());
    }
    }
}