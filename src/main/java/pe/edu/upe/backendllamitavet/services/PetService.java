package pe.edu.upe.backendllamitavet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upe.backendllamitavet.models.PetModel;
import pe.edu.upe.backendllamitavet.repositories.PetRepository;

import java.util.ArrayList;

@Service
public class PetService{

    @Autowired
    PetRepository petRepository;

    public ArrayList<PetModel> getPet(){
        return (ArrayList<PetModel>) petRepository.findAll();
    }

    public PetModel savePet(PetModel pet){
        return petRepository.save(pet);
    }

    public boolean deletePet(Long id){
        try {
            petRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
