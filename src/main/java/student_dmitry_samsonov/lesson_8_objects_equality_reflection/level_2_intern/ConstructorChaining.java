package student_dmitry_samsonov.lesson_8_objects_equality_reflection.level_2_intern;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }
    public ConstructorChaining(String constructorName, int parameterCount){
        this(constructorName);
    }
}