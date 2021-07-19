package student_artem_khokhlov.lesson_8.task_1;

public class Airplane {
    private String model;
    private int weight;
    public Airplane(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }
    public void info() {
        System.out.println("model: " + this.model + "weight: " + this.weight);
    }
}
