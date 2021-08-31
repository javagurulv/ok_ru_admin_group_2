package student_alexander_fateev.lesson7.level_1.task3;

import net.bytebuddy.agent.ByteBuddyAgent;

class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 demo = new DefaultConstructorV3();

        System.out.println("Age = " + demo.getAge());
        System.out.println("FullName = " + demo.getFullName());
        System.out.println("Female = " + demo.getFemale());
        System.out.println("Male = " + demo.isMale());
    }
}
