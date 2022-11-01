package kodlama.io.Devs.entities.concretes;

public class Language {
    private int id;
    private String LanguageName;

    public Language() {
    }

    public Language(int id, String languageName) {
        this.id = id;
        LanguageName = languageName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguageName() {
        return LanguageName;
    }

    public void setLanguageName(String languageName) {
        LanguageName = languageName;
    }
}
