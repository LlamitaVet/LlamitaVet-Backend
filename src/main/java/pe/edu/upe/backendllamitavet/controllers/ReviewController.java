package pe.edu.upe.backendllamitavet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upe.backendllamitavet.models.ReviewModel;
import pe.edu.upe.backendllamitavet.services.ReviewService;

import java.util.ArrayList;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    ReviewService reviewService;

    @GetMapping()
    public ArrayList<ReviewModel> getReview(){
        return reviewService.getReview();
    }

    @PostMapping()
    public ReviewModel saveReview(@RequestBody ReviewModel review){
        return this.reviewService.saveReview(review);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteReview(@PathVariable("id") Long id){
        boolean ok = this.reviewService.deleteReview(id);
        if (ok){
            return "Review with id: " + id + " was deleted";
        }else{
            return "Can´t delete review with id: " + id;
        }
    }

}
