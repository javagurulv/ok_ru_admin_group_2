package teacher.lesson_3_oop_first_look.lessoncode;

public class ServerParameters {

	private int cpuLoad;
	private int hddLoad;

	public ServerParameters(int cpuLoad, int hddLoad) {
		this.cpuLoad = cpuLoad;
		this.hddLoad = hddLoad;
	}

	public int getCpuLoad() {
		return cpuLoad;
	}

	public void setCpuLoad(int cpuLoad) {
		this.cpuLoad = cpuLoad;
	}

	public int getHddLoad() {
		return hddLoad;
	}

	public void setHddLoad(int hddLoad) {
		this.hddLoad = hddLoad;
	}
}
