package student_dmitry_samsonov.lesson_12_junit.level_3_junior;

import org.apache.log4j.Logger;

import java.util.Formatter;
import java.util.concurrent.TimeUnit;

class GameOfLife {
    private GameOfLifeConsoleUI ui = new GameOfLifeConsoleUI();
    private GameOfLifeRandomFieldGenerator generator = new GameOfLifeRandomFieldGenerator();
    private GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

    private static Logger logger = Logger.getLogger(GameOfLife.class);
    private static Formatter formatter = new Formatter();

    public void run() {
        boolean[][] field = generator.generate(10, 10);
        while(true) {
            ui.show(field);
            sleepForSeconds(5);
            field = calculator.calculate(field);
        }
    }

    private void sleepForSeconds(int seconds) {
        try {
            logger.info(formatter.format("Sleeping %d seconds", seconds));
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println("Exception occurred!");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        GameOfLife gameOfLife = new GameOfLife();
        gameOfLife.run();
    }

}