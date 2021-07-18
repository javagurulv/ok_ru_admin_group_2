package student_dmitry_samsonov.lesson_3.level_2_intern;

import student_dmitry_samsonov.lesson_2.level_2.HelloPerson;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Name {
    public static void main(String[] args) {
        String myName = "Dmitry";
        System.out.println(myName);

        String greeting = "Hi, " + myName + "!";
        System.out.println(greeting);

        HelloPerson Task_9 = new HelloPerson();
        String[] Task_9_args = {};
        Task_9.main(Task_9_args);
    }
}
