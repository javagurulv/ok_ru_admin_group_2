package student_alexander_fateev.lesson4.level_3.task10;

class Compare {
    int firstNumber, secondNumber, thirdNumber;

    Compare (int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    int getBiggest () {
        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            return firstNumber;
        }
        else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            return secondNumber;
        }
        else if ((firstNumber == secondNumber) && (firstNumber > thirdNumber)) {
            return firstNumber;
        }
        else {
            return thirdNumber;
        }
    }

}
