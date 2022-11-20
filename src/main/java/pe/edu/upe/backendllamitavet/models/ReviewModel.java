package pe.edu.upe.backendllamitavet.models;

import javax.persistence.*;

@Entity
@Table(name = "reviews")
public class ReviewModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String name;
    private String review;
    private Integer veterinarian_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Integer getVeterinarian_id() {
        return veterinarian_id;
    }

    public void setVeterinarian_id(Integer veterinarian_id) {
        this.veterinarian_id = veterinarian_id;
    }
}