package classes.task02;

public class Person implements RepkaItem {

//    private static final String turnip = "Репка";
    private String name;

//    public Person() {
//        this.name = turnip;
//    }
    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void pull(Person person) {
        System.out.println(
            this.name
            + " за "
            + person.name
                    .replaceFirst(".{1}$", "у"));
    }
}
