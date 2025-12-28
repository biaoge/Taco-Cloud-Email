package taco.emal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Taco {

    private String name;
    private final List<String> ingredients = new ArrayList<>();

    public Taco() {
    }

    public Taco(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredients() {
        return Collections.unmodifiableList(ingredients);
    }

    public void setIngredients(List<String> ingredientCodes) {
        this.ingredients.clear();
        if (ingredientCodes != null) {
            this.ingredients.addAll(ingredientCodes);
        }
    }
}
