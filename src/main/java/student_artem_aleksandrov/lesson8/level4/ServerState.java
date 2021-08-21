package student_artem_aleksandrov.lesson8.level4;

import java.util.Objects;

/*
    Создайте класс ServerState. В этом классе опишите состояние сервера
воспользовавшись свойствами:
- количество свободного места на дисках;
- загрузка центрального процессора;
- объем используемой или свободной оперативной памяти;
- и так далее.

В классе ServerState переопределите метод equals(...) для
того, чтобы можно было с помощью него сравнивать два объекта
класса ServerState используя их свойства.

Создайте класс ServerStateTest и напишите юнит тесты в которых
протестируйте сравнение одинаковых и разных объектов класса ServerState.

 */
public class ServerState {

    private float diskFree;
    private float cpuUsage;
    private float ramUsage;

    public ServerState(float diskFree, float cpuUsage, float ramUsage) {
        this.diskFree = diskFree;
        this.cpuUsage = cpuUsage;
        this.ramUsage = ramUsage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServerState that = (ServerState) o;
        return Float.compare(that.diskFree, diskFree) == 0 &&
                Float.compare(that.cpuUsage, cpuUsage) == 0 &&
                Float.compare(that.ramUsage, ramUsage) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diskFree, cpuUsage, ramUsage);
    }
}
