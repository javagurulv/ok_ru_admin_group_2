package student_dmitry_samsonov.lesson_8_objects_equality_reflection.level_4_junior;

class ServerStateTest {
    public static void main(String[] args) {
        ServerStateTest serverStateTest = new ServerStateTest();
        serverStateTest.serverStateTestTrue();
        serverStateTest.serverStateTestFalse();
    }
    static void printTestResult(String name, boolean result) {
        String reportName = name + " test = ";
        String reportResult;
        if (result) {
            reportResult = "OK";
        } else {
            reportResult = "FAIL";
        }
        System.out.println(reportName + reportResult);
    }
    void serverStateTestTrue(){
        ServerState serverState1 = new ServerState(1, 2, 3);
        ServerState serverState2 = new ServerState(1, 2, 3);
        printTestResult("True", serverState1.equals(serverState2));
    }
    void serverStateTestFalse() {
        ServerState serverState1 = new ServerState(1, 2, 3);
        ServerState serverState2 = new ServerState(3, 2, 1);
        printTestResult("False", !serverState1.equals(serverState2));
    }
}