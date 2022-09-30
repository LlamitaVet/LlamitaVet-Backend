package pe.edu.upe.backendllamitavet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upe.backendllamitavet.models.VeterinarianModel;
import pe.edu.upe.backendllamitavet.repositories.VeterinarianRepository;

import java.util.ArrayList;

@Service
public class VeterinarianService {

    @Autowired
    VeterinarianRepository veterinarianRepository;

    public ArrayList<VeterinarianModel> getVeterinarian(){
        return (ArrayList<VeterinarianModel>) veterinarianRepository.findAll();
    }

    public VeterinarianModel saveVeterinarian(VeterinarianModel veterinarian){
        return veterinarianRepository.save(veterinarian);
    }

    public boolean deleteVeterinarian(Long id){
        try {
            veterinarianRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }

}
