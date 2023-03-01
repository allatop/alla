package ru.proglib;
public class car {
    int speed;
    int maxSpeed;
    public car(int speed, int maxSpeed) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        System.out.println("Объект готов");

    }

    void start(){
        System.out.println("Я начал ехать" + "в направлении М1 со скоростью " + speed);
        System.out.println(speed);
    }
    void stop(){
        System.out.println("Я остановился");
        System.out.println(maxSpeed);
    }
    public static void main(String[] args) {
        var mycar = new car(100,500);
        mycar.start();
        mycar.stop();
    }
}
