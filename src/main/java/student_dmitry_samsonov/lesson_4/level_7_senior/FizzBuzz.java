package student_dmitry_samsonov.lesson_4.level_7_senior;

class FizzBuzz {
    public String detect(int number) {
        String result = "";
        if (number % 3 == 0) {
            result = result + "Fizz";
        }
        if (number % 5 == 0) {
            result = result + "Buzz";
        }
        if (result.equals("")) {
            result = result + number;
        }
        return result;
    }
}
