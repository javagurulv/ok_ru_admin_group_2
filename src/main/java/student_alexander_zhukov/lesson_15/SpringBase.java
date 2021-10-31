package student_alexander_zhukov.lesson_15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import student_alexander_zhukov.lesson_15.components.Comp1;
import student_alexander_zhukov.lesson_15.components.Comp2;
import student_alexander_zhukov.lesson_15.config.SpringBaseConfiguration;

class SpringBase {

    private static ApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(SpringBaseConfiguration.class);

    public static void main(String[] args) {

        Comp1 comp1 = applicationContext.getBean(Comp1.class);
        Comp2 comp2 = applicationContext.getBean(Comp2.class);
        System.out.println(comp1.parameter.parameter);
        System.out.println(comp2.confTest);
    }
}
