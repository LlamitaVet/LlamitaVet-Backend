package pe.edu.upe.backendllamitavet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upe.backendllamitavet.models.PetModel;
import pe.edu.upe.backendllamitavet.services.PetService;

import java.util.ArrayList;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    PetService petService;

    @GetMapping()
    public ArrayList<PetModel> getPet(){
        return petService.getPet();
    }

    @PostMapping()
    public PetModel savePet(@RequestBody PetModel pet){
        return this.petService.savePet(pet);
    }

    @DeleteMapping(path = "/{id}")
    public String deletePet(@PathVariable("id") Long id){
        boolean ok = this.petService.deletePet(id);
        if (ok){
            return "Pet with id: " + id + " was deleted";
        }else{
            return "Can´t delete pet with id: " + id;
        }
    }

}
