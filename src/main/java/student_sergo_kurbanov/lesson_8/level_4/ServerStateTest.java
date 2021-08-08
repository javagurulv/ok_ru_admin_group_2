package student_sergo_kurbanov.lesson_8.level_4;

class ServerStateTest {
    public static void main(String[] args) {
        ServerState a = new ServerState(20, 50, 10);
        ServerState b = new ServerState(20, 50, 10);
        ServerState c = new ServerState(20, 50, 5);

        ServerStateTest serverStateTest = new ServerStateTest();
        serverStateTest.ServerStateEqualsTest(a, b, true);
        serverStateTest.ServerStateEqualsTest(b, c, false);
        serverStateTest.ServerStateEqualsTest(a, a, true);
        serverStateTest.ServerStateEqualsTest(b, null, false);
    }

    public void ServerStateEqualsTest(ServerState a, ServerState b, boolean result) {
        if (a.equals(b) == result) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
