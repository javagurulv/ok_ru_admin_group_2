package student_alexander_zhukov.lesson_7.level_2;

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

class ComputerPlayerDemo {
    public static void main(String[] args) {
        ComputerPlayer newComp = new ComputerPlayer("bot");
    }
}