package student_artem_aleksandrov.lesson8.level1.level2;

/*
Создайте класс PrivateConstructorDemo и в его main() методе
создайте инстанцию класса PrivateConstructor.

После этого сделайте так, чтобы инстанцию класса PrivateConstructor
нельзя было создать в демо классе. Подсказка кроется в названии класса!

PS: не забудьте закоментировать не компилирующийся код в демо классе.
 */

class PrivateConstructor {
    public static void main(String[] args) {
        PrivateConstructor privateConstructor = new PrivateConstructor();

    }

    private PrivateConstructor() {
    }
}


