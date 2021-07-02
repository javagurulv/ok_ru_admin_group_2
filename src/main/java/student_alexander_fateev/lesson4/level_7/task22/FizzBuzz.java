package student_alexander_fateev.lesson4.level_7.task22;

class FizzBuzz {
    String detect(int number) {
        if ((number %3 == 0) && (number %5 == 0)) {
            return "FizzBuzz";
        }
        else if (number %3 == 0) {
            return "Fizz";
        }
        else if (number %5 ==0) {
            return "Buzz";
        }

        return "" + number;
    }
}
