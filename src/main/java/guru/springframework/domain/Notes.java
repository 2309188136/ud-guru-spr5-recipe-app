package guru.springframework.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

//https://github.com/springframeworkguru/spring5-recipe-app/tree/one-to-one-jpa
@Data
@EqualsAndHashCode(exclude = "recipe") //exclude bidirection references to eliminate circular references
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes; //jpa-hibernate has limit of 250 characters,mark lob solve the issue

}