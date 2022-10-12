package structure.facade.toast;

import structure.facade.ingredients.Ingredient;

public interface Toast {
    void printToastIngredients();

    void addIngredient(Ingredient ingredient);
}