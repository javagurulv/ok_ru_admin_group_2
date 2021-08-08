package student_andrey_domas.lesson8.level4;

import java.util.Objects;

public class ServerState {

    private String hostname;
    private int ipAddress;
    private int loadAverage;
    private int cpuPercent;
    private int hddFreePercent;

    public void setLoadAverage(int loadAverage) {
        this.loadAverage = loadAverage;
    }

    public void setCpuPercent(int cpuPercent) {
        this.cpuPercent = cpuPercent;
    }

    public void setHddFreePercent(int hddFreePercent) {
        this.hddFreePercent = hddFreePercent;
    }

    ServerState(String hostname, int ipAddress) {
        this.hostname = hostname;
        this.ipAddress = ipAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServerState that = (ServerState) o;
        return ipAddress == that.ipAddress && Objects.equals(hostname, that.hostname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostname, ipAddress);
    }
}
