package pizza.crust;
import pizza.MenuItem;

public abstract class PizzaCrust implements MenuItem {
    protected String ingredient;

    public abstract String toString();

    public void setIngredient(String i) {
        this.ingredient = i;
    }

    public String getIngredient() {
        return this.ingredient;
    }

    public String checkIntegrity() {
        return "";
    }

    public String toNiceString() {
        return "Crust: " + this.toString() + " (" + this.ingredient + ")";
    }

    public Double getPrice() {
        return 2.50;
    }
}