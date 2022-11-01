package kodlama.io.Devs.business.concretes;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;

    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public Language getId(int id){
        return this.languageRepository.getById(id);
    }

    @Override
    public void add(Language language) {

    }

    @Override
    public void delete(int id) {
        this.languageRepository.delete(id);
    }

    @Override
    public void update(Language language) {
        if (this.isName(language.getLanguageName())) {
        }
        if (language.getLanguageName().isBlank() || language.getLanguageName().isEmpty()) {

        }
        this.languageRepository.update(language);
    }

    private boolean isName(String languageName) {
        List<Language> languages = this.languageRepository.getAll();
        boolean result = false;
        for (Language language : languages) {
            if (language.getLanguageName().equalsIgnoreCase(languageName)) {
                result = true;
            }
        }
        return result;
    }
}
