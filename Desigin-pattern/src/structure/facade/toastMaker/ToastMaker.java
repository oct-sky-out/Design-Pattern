package structure.facade.toastMaker;

import structure.facade.ingredients.Bacon;
import structure.facade.ingredients.Bread;
import structure.facade.ingredients.Lettuce;
import structure.facade.toast.NormalToast;
import structure.facade.toast.Toast;
import structure.facade.toast.VeganToast;

public class ToastMaker {
    public Toast makeToast(String toastName) {
        if (toastName.toLowerCase().equals("normal")) {
            System.out.println("you selected normal toast");

            Toast normalToast = new NormalToast();
            normalToast.addIngredient(new Bread());
            normalToast.addIngredient(new Bacon());
            normalToast.addIngredient(new Lettuce());
            normalToast.addIngredient(new Bread());

            return normalToast;
        }

        System.out.println("you selected vegan toast");

        Toast veganToast = new VeganToast();
        veganToast.addIngredient(new Bread());
        veganToast.addIngredient(new Lettuce());
        veganToast.addIngredient(new Lettuce());
        veganToast.addIngredient(new Bread());

        return veganToast;
    }
}