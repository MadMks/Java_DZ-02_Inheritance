package classes.task03;

public class Dog implements Movable, Eating {
    @Override
    public void move() {
        System.out.println("Собака может передвигаться");
    }

    @Override
    public void eat() {
        System.out.println("Собака может сьесть кого-то");
    }
}
