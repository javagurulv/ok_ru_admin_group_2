package student_andrey_domas.lesson16.random_list;

import java.util.ArrayList;
import java.util.List;

class RandomNumberList {

    private List<Integer> randomNumbers = new ArrayList<>();

    public void add(int randomNumber) {
        this.randomNumbers.add(randomNumber);
    }

    public int size() {
        return this.randomNumbers.size();
    }

}