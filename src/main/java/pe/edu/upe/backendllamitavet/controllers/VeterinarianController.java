package pe.edu.upe.backendllamitavet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upe.backendllamitavet.models.VeterinarianModel;
import pe.edu.upe.backendllamitavet.services.VeterinarianService;

import java.util.ArrayList;

@RestController
@RequestMapping("/veterinarians")
public class VeterinarianController {
    @Autowired
    VeterinarianService veterinarianService;

   @GetMapping()
   public ArrayList<VeterinarianModel> getVeterinarian(){
       return veterinarianService.getVeterinarian();
   }

   @PostMapping()
    public VeterinarianModel saveVeterinarian(@RequestBody VeterinarianModel veterinarian){
       return this.veterinarianService.saveVeterinarian(veterinarian);
   }

   @DeleteMapping(path = "/{id}")
    public String deleteVeterinarian(@PathVariable("id") Long id){
       boolean ok = this.veterinarianService.deleteVeterinarian(id);
       if (ok){
           return "Veterinarian with id: " + id + " was deleted";
       }else{
           return "Can´t delete veterinarian with id: " + id;
       }
   }

}
