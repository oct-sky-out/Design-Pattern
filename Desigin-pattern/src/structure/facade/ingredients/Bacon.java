package structure.facade.ingredients;

public class Bacon implements Ingredient {
    @Override
    public String getIngredientName() {
        return this.getClass().getSimpleName();
    }
}
