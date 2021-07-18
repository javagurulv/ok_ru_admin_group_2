package student_dmitry_samsonov.lesson_8.level_2_intern;

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