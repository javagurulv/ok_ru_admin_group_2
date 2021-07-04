package student_alexey_gorbov.lesson_3;

class Task1Robot {
    String name;

    public Task1Robot(){
    }
    public  Task1Robot(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello");
    }

    public void sayYourName() {
        if (name != null) {
            System.out.println("My name is " + name);
        } else {
            System.out.println("My name is Rob");
        }


    }

}
