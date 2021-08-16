package student_dmitry_samsonov.lesson_8_objects_equality_reflection.level_4_junior;

import java.util.Objects;

class ServerState {
    Integer freeSpace;
    Integer usedCpu;
    Integer freeRam;

    public ServerState(Integer freeSpace, Integer usedCpu, Integer freeRam) {
        this.freeSpace = freeSpace;
        this.usedCpu = usedCpu;
        this.freeRam = freeRam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ServerState)) return false;
        ServerState that = (ServerState) o;
        return Objects.equals(freeSpace, that.freeSpace) && Objects.equals(usedCpu, that.usedCpu) && Objects.equals(freeRam, that.freeRam);
    }
}
