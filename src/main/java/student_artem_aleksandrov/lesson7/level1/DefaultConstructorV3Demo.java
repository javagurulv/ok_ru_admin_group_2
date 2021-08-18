package student_artem_aleksandrov.lesson7.level1;

/*
Создайте класс DefaultConstructorV3Demo, в котором
внутри main() метода продемонстрируйте ответ на поставленный
в начале задания вопрос. Для этого после вызова дефолтного
конструктора и создания инстанции класса DefaultConstructorV3
распечатайте на экран значения каждого свойства созданой
инстанции в отдельной строке. Для получения значения свойств
воспользуйтесь соответствующими get() методами.

 */
public class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 defaultConstructorV3 = new DefaultConstructorV3();

        System.out.println(defaultConstructorV3.getAge());
        System.out.println(defaultConstructorV3.getFemale());
        System.out.println(defaultConstructorV3.getFullName());
        System.out.println(defaultConstructorV3.getClass());

    }
}
