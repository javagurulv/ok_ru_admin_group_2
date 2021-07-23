package student_alexander_zhukov.lesson_7.level_3;

abstract class Fish {

    private String kindOfFish;
    private String color;
    private String name;
    private int maxWeight;

    public abstract void swim();

    public String getKindOfFish() {
        return kindOfFish;
    }

    public void setKindOfFish(String kindOfFish) {
        this.kindOfFish = kindOfFish;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class PredatorFish extends Fish {

    public PredatorFish (String name, String color, int maxWeight) {
        super();
        super.setKindOfFish("Predator");
        super.setName(name);
        super.setColor(color);
        super.setMaxWeight(maxWeight);
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }

    public void eat() {
        System.out.println("I eat other fish");
    }
}

class HerbivoreFish extends Fish {
    public HerbivoreFish(String name, String color, int maxWeight) {
        super();
        super.setKindOfFish("Herbivore");
        super.setName(name);
        super.setColor(color);
        super.setMaxWeight(maxWeight);
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }

    public void eat() {
        System.out.println("I not eat other fish");
    }

}

class FishDemo {
    public static void main(String[] args) {
        PredatorFish myFish1 = new PredatorFish("Pike", "gray-green", 35);
        myFish1.swim();
        myFish1.eat();

        HerbivoreFish myFish2 = new HerbivoreFish("Сrucian", "red", 2);
        myFish2.swim();
        myFish2.eat();
    }
}
