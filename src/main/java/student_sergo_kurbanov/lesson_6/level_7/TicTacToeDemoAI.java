package student_sergo_kurbanov.lesson_6.level_7;

import student_sergo_kurbanov.lesson_6.level_5_6.TicTacToe;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TicTacToeDemoAI {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.playAI();
    }
}
