package student_artem_khokhlov.lesson_8.level_5_middle.task_18;

import java.lang.reflect.InvocationTargetException;

public class MonitorStateDemonstration {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        MonitorState state1 = new MonitorState("server111", "test", "test", 5);
        MonitorState state2 = new MonitorState();

        state2.setPriority(2);
        state2.setStateDescription("test123");
        state2.setServerName("server1");
        state2.setGroupName("group1");

        MonitorState state3 = new MonitorState("server333", "test3333", "test3", 4);

        MonitorStateDemo demo1 = new MonitorStateDemo(state1);
        MonitorStateDemo demo2 = new MonitorStateDemo(state2);
        MonitorStateDemo demo3 = new MonitorStateDemo(state3);

        demo1.demonstrate(1);
        demo2.demonstrate(2);
        demo3.demonstrate(3);
    }
}
