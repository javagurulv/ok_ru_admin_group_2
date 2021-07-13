package student_andrey_tryapichnikov.lesson_4.level_7;

class FizzBuzz {
    public String detect(int number) {
        var result = "";
        if (number % 3 == 0) result += "Fizz";
        if (number % 5 == 0) result += "Buzz";
        if ("".equals(result)) result += number;
        return result;
    }
}
