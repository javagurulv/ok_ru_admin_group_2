package student_dmitry_samsonov.lesson_15_spring_basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import student_dmitry_samsonov.lesson_15_spring_basics.config.ComponentConfiguration;

class SpringDemo {
    private static ApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(ComponentConfiguration.class);

    public static void main(String[] args) {
        DependentComponent1 component1 = applicationContext.getBean(DependentComponent1.class);
        DependentComponent2 component2 = applicationContext.getBean(DependentComponent2.class);
        System.out.println(component2.component1.feature1);
        System.out.println(component2.mystring);
        DependentComponent3 component3 = applicationContext.getBean(DependentComponent3.class);
    }
}
