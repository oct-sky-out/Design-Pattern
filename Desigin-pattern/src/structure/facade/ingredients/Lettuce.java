package structure.facade.ingredients;

public class Lettuce implements Ingredient {
    @Override
    public String getIngredientName() {
        return this.getClass().getSimpleName();
    }
}
