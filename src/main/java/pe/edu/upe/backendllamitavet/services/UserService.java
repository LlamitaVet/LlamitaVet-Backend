package pe.edu.upe.backendllamitavet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upe.backendllamitavet.models.UserModel;
import pe.edu.upe.backendllamitavet.repositories.UserRepository;

import java.util.ArrayList;

@Service
public class UserService{

    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> getUser(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel user){
        return userRepository.save(user);
    }

    public boolean deleteUser(Long id){
        try {
            userRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
