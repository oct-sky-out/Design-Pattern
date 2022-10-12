package structure.facade.toast;

import java.util.ArrayList;
import java.util.List;

import structure.facade.ingredients.Ingredient;

public class NormalToast implements Toast {
    private List<Ingredient> ingredients = new ArrayList<>();

    @Override
    public void printToastIngredients() {
        System.out.println(this.getClass().getSimpleName() + "'s ingredients is...");
        ingredients.forEach(ingredient -> System.out.println(ingredient.getIngredientName()));
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

}
