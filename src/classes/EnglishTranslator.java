package classes;

public class EnglishTranslator extends Translator{

    public EnglishTranslator(String lang) {
        super(lang);
    }

    @Override
    public void ShowInfo() {
        System.out.println("Я переводчик с английского");
    }
}
