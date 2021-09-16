package student_dmitry_samsonov.lesson_12_junit.level_3_junior;

class GameOfLifeConsoleUI {
    public void show(boolean[][] field) {
        for (boolean[] row: field){
            for (boolean cell: row) {
                if (cell) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
