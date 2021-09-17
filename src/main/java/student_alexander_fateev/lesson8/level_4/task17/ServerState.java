package student_alexander_fateev.lesson8.level_4.task17;

class ServerState {
    private double diskFreeSpace;
    private int cpuLoadPercent;
    private double memFreeSpace;

    //Getters
    public double getDiskFreeSpace() {
        return diskFreeSpace;
    }

    public int getCpuLoadPercent() {
        return cpuLoadPercent;
    }

    public double getMemFreeSpace() {
        return memFreeSpace;
    }

    // Setters
    public void setDiskFreeSpace(double diskFreeSpace) {
        this.diskFreeSpace = diskFreeSpace;
    }

    public void setCpuLoadPercent(int cpuLoadPercent) {
        this.cpuLoadPercent = cpuLoadPercent;
    }

    public void setMemFreeSpace(double memFreeSpace) {
        this.memFreeSpace = memFreeSpace;
    }

    @Override
    public boolean equals(Object o) {
        ServerState serverState = (ServerState) o;
        return serverState.cpuLoadPercent == this.cpuLoadPercent &&
                serverState.diskFreeSpace == this.diskFreeSpace &&
                serverState.memFreeSpace == this.memFreeSpace;
    }
}
