package student_alexander_zhukov.lesson_16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class RandomNumberList {

    //private List<Integer> randomNumbers = new ArrayList<>();
    private List<Integer> randomNumbers = Collections.synchronizedList(new ArrayList<Integer>());

    public void add(int randomNumber) {
        this.randomNumbers.add(randomNumber);
    }

    public int size() {
        return this.randomNumbers.size();
    }

}
