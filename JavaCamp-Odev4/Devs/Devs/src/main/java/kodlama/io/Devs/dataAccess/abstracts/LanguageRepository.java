package kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageRepository {

    void add(Language language);
    void delete(int id);
    void update(Language language);
    List<Language> getAll();
    Language getById(int id);


}
