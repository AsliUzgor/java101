package Classes;

public class Car {
    //nitelikler
    String color;
    String type;
    String model;
    int speed;

    Car(String model, int speed , String type, String color){
        // constructor methot
        // nitelikler bunun içerisinde yazılmalı
        //System.out.println(this.model);

        this.model = model;
        this.speed = speed;
        this.color = color;
        this.type =  "Sedan";
    }

    //Davranış

    int increaseSpeed(int increment){
        if((this.speed + increment) < 180){
            this.speed += increment ;
        }
        return speed;
    }

    void printSpeed(){
        System.out.println("Hızınız : " + this.speed);
    }

    void printInfo(){
        System.out.println("Model : " + this.model);
        System.out.println("Color : " + this.color);
        System.out.println("Type : " + this.type);
        System.out.println("Speed : " + this.speed);
    }
}
