import java.sql.SQLOutput;
/*
interface animal1
{
    void eat();
    void travel();

}
class mammal implements animal1
{
    @Override
    public void eat() {

        System.out.println("mama eats");
    }

    @Override
    public void travel() {
        System.out.println("mama travel");
    }
}
public class interface2 {
    public static void main(String[] args) {
        mammal obj = new mammal();
        obj.eat();
        obj.travel();
    }
}
*/

//multiple inheritance using interface
/*
interface swimmer {
    void swim();
}
interface flyover{
    void fly();
}
class bird implements swimmer,flyover
{
    @Override
    public void swim() {

        System.out.println("bird swim");
    }
    @Override
    public void fly() {
        System.out.println("bird fly");
    }
}
public class interface2 {
    public static void main(String[] args) {
        bird obj = new bird();
        obj.swim();
        obj.fly();
    }
}*/


// hirerachical interface




interface Vehicle {
    void start();
    void stop();
}
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }
    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }
}
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }
}
public class interface2 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        car.start();
        car.stop();
        bike.start();
        bike.stop();
    }
}