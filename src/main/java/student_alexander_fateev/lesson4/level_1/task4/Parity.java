package student_alexander_fateev.lesson4.level_1.task4;

class Parity {
    int number;

    Parity (int number) {
        this.number = number;
    }

    boolean isEvenNumber () {
        return number % 2 == 0;
    }
}
