package student_alexander_fateev.lesson7.level_6.task30;

class VarArgs {
    int getSum (int ... numbers) {
        int sum = 0;
        for (int i: numbers) {
            sum += i;
        }

        return sum;
    }
}
