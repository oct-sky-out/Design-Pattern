package structure.facade;

import structure.facade.toast.Toast;
import structure.facade.toastMaker.ToastMaker;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        ToastMaker toastMaker = new ToastMaker();
        Toast toast = toastMaker.makeToast("normal");

        toast.printToastIngredients();
    }
}