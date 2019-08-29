package guru.springframework.domain;

import javax.persistence.*;

//https://github.com/springframeworkguru/spring5-recipe-app/tree/one-to-one-jpa
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes; //jpa-hibernate has limit of 250 characters,mark lob solve the issue

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Notes{");
        sb.append("id=").append(id);
        sb.append(", recipe=").append(recipe);
        sb.append(", recipeNotes='").append(recipeNotes).append('\'');
        sb.append('}');
        return sb.toString();
    }
}