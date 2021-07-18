package student_sergo_kurbanov.lesson_4.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.FizzBuzzMod3Test();
        fizzBuzzTest.FizzBuzzMod5Test();
        fizzBuzzTest.FizzBuzzMod35Test();
        fizzBuzzTest.FizzBuzzModNonTest();
    }

    public void FizzBuzzMod3Test() {
        int number = 27;  // подготавливаем тестовые данные
        String expectedResult = "Fizz";  // подготавливаем тестовые данные

        FizzBuzz fizzBuzz = new FizzBuzz();

        String realResult = fizzBuzz.detect(number);   // вызываем продакшен код, который хотим протестировать

        if (realResult.equals(expectedResult)) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("FizBuzz mod3 = OK");
        } else {
            System.out.println("FizBuzz mod3 = FAIL");
        }
    }

    public void FizzBuzzMod5Test() {
        int number = 25;  // подготавливаем тестовые данные
        String expectedResult = "Buzz";  // подготавливаем тестовые данные

        FizzBuzz fizzBuzz = new FizzBuzz();

        String realResult = fizzBuzz.detect(number);   // вызываем продакшен код, который хотим протестировать

        if (realResult.equals(expectedResult)) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("FizBuzz mod5 = OK");
        } else {
            System.out.println("FizBuzz mod5 = FAIL");
        }
    }

    public void FizzBuzzMod35Test() {
        int number = 27 * 25;  // подготавливаем тестовые данные
        String expectedResult = "FizzBuzz";  // подготавливаем тестовые данные

        FizzBuzz fizzBuzz = new FizzBuzz();

        String realResult = fizzBuzz.detect(number);   // вызываем продакшен код, который хотим протестировать

        if (realResult.equals(expectedResult)) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("FizBuzz mod35 = OK");
        } else {
            System.out.println("FizBuzz mod35 = FAIL");
        }
    }

    public void FizzBuzzModNonTest() {
        int number = 26;  // подготавливаем тестовые данные
        String expectedResult = "" + number;  // подготавливаем тестовые данные

        FizzBuzz fizzBuzz = new FizzBuzz();

        String realResult = fizzBuzz.detect(number);   // вызываем продакшен код, который хотим протестировать

        if (realResult.equals(expectedResult)) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("FizBuzz Non = OK");
        } else {
            System.out.println("FizBuzz Non = FAIL");
        }
    }
}
