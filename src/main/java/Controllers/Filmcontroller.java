package Controllers;

import Entities.Films;
import Services.Filmservice;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@NoArgsConstructor
@RequestMapping({"/filmss"})
@CrossOrigin("*")
public class Filmcontroller {
    @Autowired
    private Filmservice etudiantservice;

    @GetMapping
    public List<Films> getetudiant(){
        return etudiantservice.listes_films();
    }
    @GetMapping({"/{id}"})
    public Films chercheretudiant(@PathVariable long id ){
        return etudiantservice.trouver_film(id);
    }
    @DeleteMapping({"/{id}"})
    public String supprimer_etudiant(@PathVariable long id){
        etudiantservice.supprimer_film(id);
        return "etudiant de numero "+ id +"est supprimé";
    }
    @PostMapping
    public Films ajouter_etudiant(@RequestBody Films e){
        return etudiantservice.creer_film(e);
    }
    @PutMapping
    public Films misajour_etudiant(@RequestBody Films e){
        return etudiantservice.creer_film(e);
    }

    @DeleteMapping
    public String suprime(){
        etudiantservice.supprime_tout();
        return "tout est supprimés";
    }


}
