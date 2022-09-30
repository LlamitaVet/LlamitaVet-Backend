package pe.edu.upe.backendllamitavet.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upe.backendllamitavet.models.PetModel;

@Repository
public interface PetRepository extends CrudRepository<PetModel, Long> {
}

