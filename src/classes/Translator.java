package classes;

public abstract class Translator {

    private String language;

    public Translator(String lang){
        this.language = lang;
    }

    public String getLanguage(){
        return language;
    }

    public abstract void ShowInfo();
}
