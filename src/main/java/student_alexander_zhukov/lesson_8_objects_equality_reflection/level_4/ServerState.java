package student_alexander_zhukov.lesson_8_objects_equality_reflection.level_4;

import java.util.Objects;

class ServerState {

    private String serverName;
    private int ipAddress;
    private int ramTotal;

    ServerState(String serverName, int ipAddress, int ramTotal) {
        this.serverName = serverName;
        this.ipAddress = ipAddress;
        this.ramTotal = ramTotal;

    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public void setIpAddress(int ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setRamTotal(int ramTotal) {
        this.ramTotal = ramTotal;
    }

    public String getServerName() {
        return serverName;
    }

    public int getIpAddress() {
        return ipAddress;
    }

    public int getRamTotal() {
        return ramTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ServerState server = (ServerState) o;
        return Objects.equals(serverName, server.serverName)
                && Objects.equals(ipAddress, server.ipAddress)
                && Objects.equals(ramTotal, server.ramTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverName, ipAddress, ramTotal);
    }
}
