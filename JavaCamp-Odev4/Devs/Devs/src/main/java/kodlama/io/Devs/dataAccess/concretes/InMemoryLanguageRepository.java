package kodlama.io.Devs.dataAccess.concretes;

import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class InMemoryLanguageRepository implements  LanguageRepository {

    List<Language> languages;

    public InMemoryLanguageRepository() {
        languages = new ArrayList<Language>();
        languages.add(new Language( 1, "Java"));
        languages.add(new Language(2,"c#"));
        languages.add(new Language(3,"Python"));
    }

    @Override
    public void add(Language language) {
        languages.add(language);
    }

    @Override
    public void delete(int id) {
        languages.remove(id);
        System.out.println("Language name of removed");
    }

    @Override
    public void update(Language language) {
        Language languageToUpdate = null;
        for (int i = 0; i < languages.size(); i++) {
            if (language.getId() == languages.get(i).getId()) {
                languageToUpdate = languages.get(i);
            }
        }
        languageToUpdate.setId(language.getId());
        languageToUpdate.setLanguageName(language.getLanguageName());
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public Language getById(int id) {

        for (Language lng : languages) {
            if (lng.getId() == id) {
                return lng;
            }
        }
        return null;
    }
    }

