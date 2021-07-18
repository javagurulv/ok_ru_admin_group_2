package student_ilya_schanikov.lesson_3.level_7;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TV {
    String manufacturer;
    int size;
    int volume;

    public void tellEveryting() {

        System.out.println("Made by: " + this.manufacturer + ", size: " + this.size + ", and now playing at: " + this.volume);
    }

    public TV(String manufacturerName) {
        this.manufacturer = manufacturerName;
        System.out.println("Please, enter " + this.manufacturer + " size:");
        Scanner tvSize = new Scanner(System.in);
        this.size = tvSize.nextInt();
        System.out.println("Please, enter " + this.manufacturer + " volume:");
        Scanner tvVolume = new Scanner(System.in);
        this.volume = tvVolume.nextInt();
    }

    void increaseVolume() {
        System.out.println("Increasing volume!");
        this.volume = this.volume + 1;
    }

}

class God {
    String name;
    int numberOfFollowers;
    boolean reincarnation;

    public void tellMeEveryting() {

        System.out.println("God name: " + this.name + ", count of followers: " + this.numberOfFollowers + ", and supports reincarnation: " + this.reincarnation);
    }

    public God(String godName) {
        this.name = godName;
        System.out.println("Please, enter " + this.name + " followers numbers:");
        Scanner godFollowers = new Scanner(System.in);
        this.numberOfFollowers = godFollowers.nextInt();
        System.out.println("Does " + this.name + " supports reincarnation (true/false)?");
        Scanner godReincarnation = new Scanner(System.in);
        this.reincarnation = godReincarnation.nextBoolean();
    }

    void pray() {
        System.out.println("Praying! It will increase number of followers");
        this.numberOfFollowers = this.numberOfFollowers + 1;
    }

    void willIBeAliveAgain() {
        System.out.println("Let's see, will you be reincarnated..." + this.reincarnation);

    }

}


class TvDemo {
    public static void main(String[] args) {
        TV Tv1 = new TV("Samsung");
        Tv1.tellEveryting();
        Tv1.increaseVolume();
        Tv1.tellEveryting();

        }
    }

class GodDemo {
    public static void main(String[] args) {
        God God1 = new God("Christ");
        God1.tellMeEveryting();
        God1.pray();
        God1.willIBeAliveAgain();
        God1.tellMeEveryting();

        God God2 = new God("Buddha");
        God2.tellMeEveryting();
        God2.pray();
        God2.willIBeAliveAgain();
        God2.tellMeEveryting();

    }
}