package pe.edu.upe.backendllamitavet.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upe.backendllamitavet.models.ReviewModel;

@Repository
public interface ReviewRepository extends CrudRepository<ReviewModel, Long> {
}