package student_alexander_fateev.lesson4.level_1.task4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Parity {
    int number; // вместо этого свойства можно было использовать параметр в методе isEvenNumber()

    Parity (int number) {
        this.number = number;
    }

    boolean isEvenNumber () {
        return number % 2 == 0;
    }
}
