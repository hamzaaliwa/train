package Services;




import Entities.Films;
import Repo.Filmrepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class Filmservice {

    private final Filmrepo filmrepo;

    public Films creer_film(Films e){
        return filmrepo.save(e);
    }
    public void supprimer_film(long id){
        Films e =trouver_film(id);
        filmrepo.delete(e);
    }
    public Films trouver_film(long id){
        Optional<Films> et = filmrepo.findById(id);
        return et.get();
    }
    public List<Films> listes_films(){
        return filmrepo.findAll();
    }
    public void supprime_tout(){
        filmrepo.findAll().forEach(e->filmrepo.delete(e));
    }
}
