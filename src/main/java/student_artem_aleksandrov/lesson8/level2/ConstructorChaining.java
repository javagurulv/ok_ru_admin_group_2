package student_artem_aleksandrov.lesson8.level2;

/*
Создайте в этом классе публичный конструктор с двумя параметрами.
Внутри этого конструктора первой строкой вызовите приватный
конструктор с одним параметром.
 */

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        this(constructorName);

        this.parameterCount = parameterCount;
    }
}