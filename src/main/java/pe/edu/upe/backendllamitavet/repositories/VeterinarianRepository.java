package pe.edu.upe.backendllamitavet.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upe.backendllamitavet.models.VeterinarianModel;

@Repository
public interface VeterinarianRepository extends CrudRepository<VeterinarianModel, Long> {
}
