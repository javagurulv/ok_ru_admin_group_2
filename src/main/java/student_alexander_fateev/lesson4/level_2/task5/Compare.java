package student_alexander_fateev.lesson4.level_2.task5;

class Compare {
    int firstNumber, secondNumber;

    Compare (int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    int getBigger () {
        if (firstNumber > secondNumber) {
            return firstNumber;
        }
        else {
            return secondNumber;
        }
    }
}
