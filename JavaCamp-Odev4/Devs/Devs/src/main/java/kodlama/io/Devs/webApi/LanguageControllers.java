package kodlama.io.Devs.webApi;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageControllers {
    private LanguageService languageService;

    @Autowired
    public LanguageControllers(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getAll")
    public List<Language> getAll(){
        return languageService.getAll();
    }


    @GetMapping("/getId")
    public Language getId(int id){
        return languageService.getId(id);
    }

    @PostMapping("/addlanguage")
    public void add(@RequestBody Language language) {
        languageService.add(language);
    }

    @DeleteMapping("/deletelanguage")
    public void delete(int id) {
        languageService.delete(id);
    }

    @PutMapping("/updatelanguage")
    public void  Update(Language language){
        languageService.update(language);

    }
}
