package student_andrey_domas.lesson15.components;

import org.springframework.stereotype.Component;

@Component("comp3")
public class Component3 extends DemoComponent {
    public Component3() {
        this.name = "component3";
    }
}