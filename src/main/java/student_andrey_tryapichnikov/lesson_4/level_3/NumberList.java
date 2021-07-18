package student_andrey_tryapichnikov.lesson_4.level_3;

import teacher.codereview.CodeReview;

// it is a slightly more complex thing than was assigned, but ultimately does the same
// the main difference is that it is not confined to only three values:
// you can use as many as you like
@CodeReview(approved = true)
public class NumberList {
    int[] values;
    int[] stat;
    // should probably be enum, but I feel too lazy to figure it out at the moment
    String relationText;

    public NumberList(int[] numbers) {
        setValues(numbers);
        this.genStat();
        this.genType();
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    static int compare(int val1, int val2) {
        if (val1 < val2) return 1;
        if (val1 > val2) return -1;
        return 0;
    }

    boolean testStat(int statValue) {
        for (int n: this.stat) {
            if (n != statValue) return false;
        }
        return true;
    }

    boolean testAllDiff() {
        for (int a = 0; a < this.values.length; a++) {
            for (int b = a + 1; b < this.values.length; b++) {
                if (this.values[a] == this.values[b]) return false;
            }
        }
        return true;
    }

    // convert array of numbers into array of relations
    // -1 means less, 1 means more, 0 means equal
    void genStat() {
        this.stat = new int[this.values.length - 1];
        for (int i = 1; i < this.values.length; i++) {
            this.stat[i - 1] = compare(this.values[i - 1], this.values[i]);
        }
    }

    void genType() {
        if (testStat(0)) this.relationText = "equal";
        else if (testStat(1)) this.relationText = "ascending";
        else if (testStat(-1)) this.relationText = "descending";
        else if (testAllDiff()) this.relationText = "different";
        else this.relationText = "neither";
    }
}
