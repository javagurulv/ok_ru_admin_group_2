package student_artem_aleksandrov.lesson7.level1;

/*Создайте класс DefaultConstructorV3Demo, в котором
внутри main() метода продемонстрируйте ответ на поставленный
в начале задания вопрос. Для этого после вызова дефолтного
конструктора и создания инстанции класса DefaultConstructorV3
распечатайте на экран значения каждого свойства созданой
инстанции в отдельной строке. Для получения значения свойств
воспользуйтесь соответствующими get() методами.
Создайте класс DefaultConstructorV3:

class DefaultConstructorV3 {

    private String fullName;
    private int age;
    private boolean male;
    private Boolean female;

    // создайте get() методы для каждого свойства

}

 */
public class DefaultConstructorV3 {
    private String fullName;
    private int age;
    private boolean male;
    private Boolean female;

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return male;
    }

    public Boolean getFemale() {
        return female;
    }
}
