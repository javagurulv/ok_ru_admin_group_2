package student_alexander_fateev.lesson6.level_5.task22;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();

        // Test case 1: Player 0 wins, horizontal line
        int playerToCheck = 0;
        boolean expectedResult = true;
        int [][] field = {{0, 0, 0},
                          {-1, 1, 1},
                          {1, 0, 1}};

        test.rowTest(playerToCheck, expectedResult, field);

        // Test case 2: Player 1 wins, horizontal line
        playerToCheck = 1;
        expectedResult = true;
        field = new int[][]{{-1, 0, 0},
                            {-1, 1, 1},
                            {1, 1, 1}};

        test.rowTest(playerToCheck, expectedResult, field);

        // Test case 3: Nobody wins, horizontal line
        test.rowTestNoWinner();

        // Test case 4: Player 0 wins, vertical line
        playerToCheck = 0;
        expectedResult = true;
        field = new int[][]{{-1, 0, 1},
                            {-1, 0, -1},
                            {1, 0, 1}};

        test.columnTest(playerToCheck, expectedResult, field);

        // Test case 5: Player 1 wins, vertical line
        playerToCheck = 1;
        expectedResult = true;
        field = new int[][]{{-1, 0, 1},
                            {0, 0, 1},
                            {1, 0, 1}};

        test.columnTest(playerToCheck, expectedResult, field);

        // Test case 6: Nobody wins, vertical line
        test.columnTestNoWinner();

        // Test case 7: Player 0 wins, cross line
        playerToCheck = 0;
        expectedResult = true;
        field = new int[][]{{0,-1, 1},
                            {0, 0, 1},
                            {1, 1, 0}};

        test.crossTest(playerToCheck, expectedResult, field);

        // Test case 8: Player 1 wins, cross line
        playerToCheck = 1;
        expectedResult = true;
        field = new int[][]{{0,-1, 1},
                            {0, 1, 0},
                            {1, 1, 0}};

        test.crossTest(playerToCheck, expectedResult, field);

        // Test case 9: Nobody wins, cross line
        test.crossTestNoWinner();

        // Test case 10: Player 0 wins, any line
        playerToCheck = 0;
        expectedResult = true;
        field = new int[][]{{1,-1, 1},
                            {0, 0, 0},
                            {1, 1, 0}};

        test.isWinner(playerToCheck, expectedResult, field);

        // Test case 11: Player 1 wins, any line
        playerToCheck = 1;
        expectedResult = true;
        field = new int[][]{{1, 0, 1},
                            {0, 1, 0},
                            {1, 1, 0}};

        test.isWinner(playerToCheck, expectedResult, field);

        // Test case 12: Nobody wins, any line
        test.noWinner();

        // Test case 13: Draw position - true
        expectedResult = true;
        String msg = "Draw position - true";
        field = new int[][]{{1, 0, 1},
                            {1, 1, 0},
                            {0, 1, 0}};

        test.drawTest(expectedResult, field, msg);

        // Test case 14: Draw position - false
        expectedResult = false;
        msg = "Draw position - false";
        field = new int[][]{{1, 0, 1},
                            {-1, 1, 0},
                            {0, 1, -1}};

        test.drawTest(expectedResult, field, msg);

    }

    void rowTestNoWinner() {
        boolean expectedResult = false;
        int [][] field =  {{-1, 0, 0},
                          {-1, 1, -1},
                          {1, 0, 1}};

        TicTacToe game = new TicTacToe();
        boolean result0 = game.isWinPositionForHorizontals(field, 0);
        boolean result1 = game.isWinPositionForHorizontals(field, 1);

        if (result0 == expectedResult && result1 == expectedResult) {
            System.out.println("No winner - horizontal line: OK");
        }
        else {
            System.out.println("No winner - horizontal line: FAIL");
        }
    }

    void rowTest(int playerToCheck, boolean expectedResult, int [][] field) {
        TicTacToe game = new TicTacToe();
        boolean result = game.isWinPositionForHorizontals(field, playerToCheck);

        if (result == expectedResult) {
            System.out.println("Player " + playerToCheck + " wins - horizontal line: OK");
        }
        else {
            System.out.println("Player " + playerToCheck + " wins - horizontal line: FAIL");
        }
    }

    void columnTest(int playerToCheck, boolean expectedResult, int [][] field) {
        TicTacToe game = new TicTacToe();
        boolean result = game.isWinPositionForVerticals(field, playerToCheck);

        if (result == expectedResult) {
            System.out.println("Player " + playerToCheck + " wins - vertical line: OK");
        }
        else {
            System.out.println("Player " + playerToCheck + " wins - vertical line: FAIL");
        }
    }

    void columnTestNoWinner() {
        boolean expectedResult = false;
        int [][] field =  {{-1, 0, 0},
                           {-1, 1, -1},
                           {1, 0, 1}};

        TicTacToe game = new TicTacToe();
        boolean result0 = game.isWinPositionForVerticals(field, 0);
        boolean result1 = game.isWinPositionForVerticals(field, 1);

        if (result0 == expectedResult && result1 == expectedResult) {
            System.out.println("No winner - vertical line: OK");
        }
        else {
            System.out.println("No winner - vertical line: FAIL");
        }
    }

    void crossTest(int playerToCheck, boolean expectedResult, int [][] field){
        TicTacToe game = new TicTacToe();
        boolean result = game.isWinPositionForDiagonals(field, playerToCheck);

        if (result == expectedResult) {
            System.out.println("Player " + playerToCheck + " wins - cross line: OK");
        }
        else {
            System.out.println("Player " + playerToCheck + " wins - cross line: FAIL");
        }
    }

    void crossTestNoWinner() {
        boolean expectedResult = false;
        int [][] field =  {{-1, 0, 0},
                           {-1, -1, -1},
                           {1, 0, 1}};

        TicTacToe game = new TicTacToe();
        boolean result0 = game.isWinPositionForDiagonals(field, 0);
        boolean result1 = game.isWinPositionForDiagonals(field, 1);

        if (result0 == expectedResult && result1 == expectedResult) {
            System.out.println("No winner - cross line: OK");
        }
        else {
            System.out.println("No winner - cross line: FAIL");
        }
    }

    void isWinner(int playerToCheck, boolean expectedResult, int [][] field) {
        TicTacToe game = new TicTacToe();
        boolean result = game.isWinPosition(field, playerToCheck);

        if (result == expectedResult) {
            System.out.println("Player " + playerToCheck + " wins - any line: OK");
        }
        else {
            System.out.println("Player " + playerToCheck + " wins - any line: FAIL");
        }
    }

    void noWinner() {
        boolean expectedResult = false;
        int [][] field =  {{-1, 0, 0},
                           {-1, 1, -1},
                           {1, 0, 1}};

        TicTacToe game = new TicTacToe();
        boolean result0 = game.isWinPosition(field, 0);
        boolean result1 = game.isWinPosition(field, 1);

        if (result0 == expectedResult && result1 == expectedResult) {
            System.out.println("No winner - any line: OK");
        }
        else {
            System.out.println("No winner - any line: FAIL");
        }
    }

    void drawTest(boolean expectedResult, int [][] field, String msg) {
        TicTacToe game = new TicTacToe();
        boolean result = game.isDrawPosition(field);

        if (result == expectedResult) {
            System.out.println(msg + ": OK");
        }
        else {
            System.out.println(msg + ": FAIL");
        }
    }

}
