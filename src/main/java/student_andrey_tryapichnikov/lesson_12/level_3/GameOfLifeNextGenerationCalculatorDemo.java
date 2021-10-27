package student_andrey_tryapichnikov.lesson_12.level_3;

public class GameOfLifeNextGenerationCalculatorDemo {
    public static void main(String[] args) {
        var theGame = new GameOfLifeNextGenerationCalculator();
        boolean[][] testArray = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        theGame.printField(testArray);
        System.out.println();
        testArray = theGame.calculate(testArray);
        theGame.printField(testArray);
    }
}
