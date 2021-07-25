package student_sergo_kurbanov.lesson_8.level_4;

class ServerState {
    int freeDiskSpace;
    int loadCPU;
    int freeRAM;

    public ServerState(int freeDiskSpace, int loadCPU, int freeRAM) {
        this.freeDiskSpace = freeDiskSpace;
        this.loadCPU = loadCPU;
        this.freeRAM = freeRAM;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        ServerState serverState = (ServerState) obj;
        return serverState.freeDiskSpace == this.freeDiskSpace &&
                serverState.loadCPU == this.loadCPU &&
                serverState.freeRAM == this.freeRAM;
    }
}
