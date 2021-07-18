package student_sergo_kurbanov.lesson_7.level_2;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }
}

class HumanPlayer extends Player {
    HumanPlayer(String name) {
        super(name);
    }
}

class ComputerPlayer extends Player {
    ComputerPlayer(String name) {
        super(name);
    }
}