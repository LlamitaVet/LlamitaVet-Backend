package pe.edu.upe.backendllamitavet.models;


import javax.persistence.*;

@Entity
@Table(name = "pet")
public class PetModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String pet_owner;
    private String name;
    private Integer age;
    private String breed;
    private String type;



    public String getPet_owner() {
        return pet_owner;
    }

    public void setPet_owner(String pet_owner) {
        this.pet_owner = pet_owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
