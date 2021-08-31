package student_andrey_domas.lesson12.game_of_live;

import student_andrey_domas.lesson12.game_of_live.gui.GameOfLifeGUI;

import java.util.concurrent.TimeUnit;

public class RunMe {
    public static void main(String[] args) {
        GameOfLifeUI ui = new GameOfLifeGUI(350, 350);
        GameOfLifeFieldGenerator generator = new GameOfLifeGliderFieldGenerator();
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

        boolean[][] field = generator.generate();
        while(true) {
            ui.show(field);
            sleepForSeconds(200);
            field = calculator.calculate(field);
        }
    }

    private static void sleepForSeconds(int milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("Exception occurred!");
            System.exit(1);
        }
    }
}
