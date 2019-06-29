package classes.task03;

public class Cat implements Movable, Eating, Eatable{
    @Override
    public void move() {
        System.out.println("Кот может передвигаться");
    }

    @Override
    public void eat() {
        System.out.println("Кот может сьесть кого-то");
    }

    @Override
    public void eaten() {
        System.out.println("Кот может быть сьеден");
    }
}
