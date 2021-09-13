package student_andrey_domas.lesson15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import student_andrey_domas.lesson15.components.Component1;
import student_andrey_domas.lesson15.components.Component2;
import student_andrey_domas.lesson15.components.Component4;
import student_andrey_domas.lesson15.components.DemoComponent;

@Configuration
@ComponentScan
public class SpringDemo {

    private DemoComponent comp1;
    private DemoComponent comp2;

    @Autowired
    @Qualifier("comp3")
    private DemoComponent comp3;

    private Component4 comp4;

    @Autowired
    public void setComp4(Component4 comp4) {
        this.comp4 = comp4;
    }

    @Value("some string")
    private String str;

    public SpringDemo(Component1 comp1, Component2 comp2) {
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    @Bean
    public SpringDemo demo() {
        return this;
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringDemo.class);
        SpringDemo demoBean = (SpringDemo) context.getBean("demo");
        System.out.println(demoBean.comp1.getName());
        System.out.println(demoBean.comp2.getName());
        System.out.println(demoBean.comp3.getName());
        System.out.println(demoBean.comp4.getName());
        System.out.println(demoBean.str);
    }
}
