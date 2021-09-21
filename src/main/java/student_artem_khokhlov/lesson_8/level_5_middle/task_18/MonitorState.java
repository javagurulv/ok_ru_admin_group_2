package student_artem_khokhlov.lesson_8.level_5_middle.task_18;

import java.util.Objects;

public class MonitorState {
    private String serverName;
    private Integer priority;
    private String stateDescription;
    private String groupName;

    public MonitorState() {
    }

    public MonitorState(String serverName, String desc, String gname, Integer priority) {
        this.serverName = serverName;
        this.groupName = gname;
        this.stateDescription = desc;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "MonitorState{" +
                "serverName='" + serverName + '\'' +
                ", priority=" + priority +
                ", stateDescription='" + stateDescription + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }

    public void printState() {
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MonitorState)) return false;
        MonitorState that = (MonitorState) o;
        return Objects.equals(getServerName(), that.getServerName()) && Objects.equals(getPriority(), that.getPriority()) && Objects.equals(getStateDescription(), that.getStateDescription()) && Objects.equals(getGroupName(), that.getGroupName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getServerName(), getPriority(), getStateDescription(), getGroupName());
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getStateDescription() {
        return stateDescription;
    }

    public void setStateDescription(String stateDescription) {
        this.stateDescription = stateDescription;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
