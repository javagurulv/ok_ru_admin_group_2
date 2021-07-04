package student_alexey_gorbov.lesson_3;

class Task18Dog {
    String name;
    Integer age;
    String color;

    public Task18Dog(String name){
        this.name = name;
        this.color = "";
    }

    public Task18Dog(String name, Integer age){
        this.name = name;
        this.age = age;
        this.color = "";
    }

    public Task18Dog(String name, Integer age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void voice(){
        System.out.println(name + " " + name + " " + name);
    }

    public void voiceAge(){
        if (color.isEmpty()) {
            System.out.println("Name: " + name + ",  age: " + age);
        } else  {
            System.out.println("Name: " + name + ",  age: " + age + " color: " +  color);
        }

    }

    public void happyBirthday() {
        if (this.age != null){
            this.age = this.age + 1;
        }
    }

    public void changeColor(String newcolor){
        this.color = newcolor;
    }

}
