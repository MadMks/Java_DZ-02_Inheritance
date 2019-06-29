import classes.task01.EnglishTranslator;
import classes.task02.Grandfather;
import classes.task02.Grandma;
import classes.task02.Person;

public class Main {

    public static void main(String[] args) {

        // Task 01
//        EnglishTranslator engTranslator = new EnglishTranslator("English");
//        System.out.println("Lang: " + engTranslator.getLanguage());
//        engTranslator.ShowInfo();

        // Task 02
        Person person = new Person("Репка");
        Grandfather grandfather = new Grandfather("Дедка");
        Grandma grandma = new Grandma("Бабка");

        grandfather.pull(person);
        grandma.pull(grandfather);
    }
}
