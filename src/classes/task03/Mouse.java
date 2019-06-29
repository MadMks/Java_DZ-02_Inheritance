package classes.task03;

public class Mouse implements Movable, Eatable {
    @Override
    public void move() {
        System.out.println("Мышь может передвигаться");
    }

    @Override
    public void eaten() {
        System.out.println("Мышь может быть сьедена");
    }
}
