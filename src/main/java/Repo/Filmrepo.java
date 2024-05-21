package Repo;

import Entities.Films;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Filmrepo extends JpaRepository<Films,Long> {
}
