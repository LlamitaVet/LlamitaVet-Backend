package pe.edu.upe.backendllamitavet.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upe.backendllamitavet.models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {
}

