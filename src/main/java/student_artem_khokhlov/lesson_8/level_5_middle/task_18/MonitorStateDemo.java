package student_artem_khokhlov.lesson_8.level_5_middle.task_18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;


public class MonitorStateDemo {
    public String serverName = "demoserver";
    public String groupName = "";
    public String desc = "Demonstrated reflection for state: ";
    public Integer pr = 0;
    private MonitorState State;

    public MonitorStateDemo(MonitorState state) {
        this.State = state;
    }

    public MonitorState reflectionDemoFirst() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class reflectedClass = this.State.getClass();
        Constructor constructor = reflectedClass.getDeclaredConstructor(String.class, String.class, String.class, Integer.class);
        MonitorState reflectedState = (MonitorState) constructor.newInstance(this.serverName, this.desc + this.State.toString(), this.groupName, this.pr);
        return reflectedState;
    }

    public MonitorState reflectionDemoSecond() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class reflectedClass = Class.forName("student_artem_khokhlov.lesson_8.level_5_middle.task_18.MonitorState");
        Constructor constructor = reflectedClass.getDeclaredConstructor(String.class, String.class, String.class, Integer.class);
        MonitorState reflectedState = (MonitorState) constructor.newInstance(this.serverName, this.desc + this.State.toString(), this.groupName, this.pr);
        return reflectedState;
    }

    public MonitorState reflectionDemoThird() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class reflectedClass = MonitorState.class;
        Constructor constructor = reflectedClass.getDeclaredConstructor(String.class, String.class, String.class, Integer.class);
        MonitorState reflectedState = (MonitorState) constructor.newInstance(this.serverName, this.desc + this.State.toString(), this.groupName, this.pr);
        return reflectedState;
    }

    public void demonstrate(Integer MethodNumber) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        System.out.println("Original state object: " + this.State.toString());
        MonitorState reflectedState;

        if (MethodNumber == 1) {
            reflectedState = reflectionDemoFirst();
        }
        else if (MethodNumber == 2) {
            reflectedState = reflectionDemoSecond();
        }
        else if (MethodNumber == 3) {
            reflectedState = reflectionDemoThird();
        }
        else {
            System.out.println("Unknown method number: " + MethodNumber);
            return;
        }

        System.out.println("Reflected MonitorState instance: " + reflectedState.toString());
        System.out.println("Original class equals reflected class: " + this.State.getClass().equals(reflectedState.getClass()));
    }
}
