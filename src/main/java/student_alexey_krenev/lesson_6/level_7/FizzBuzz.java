package student_alexey_krenev.lesson_6.level_7;

class FizzBuzz {

    public String detect(int initialNumber) {

        if ((initialNumber % 3 == 0) && (initialNumber % 5 == 0)) return "FizzBuzz";
        else if (initialNumber % 3 == 0) return "Fizz";
        else if (initialNumber % 5 == 0) return "Buzz";
        else return "" + initialNumber;
    }

}
