package pizza.crust;
public class ThickCrust extends PizzaCrust {
    private boolean isDeepDish;

    public void setIsDeepDish(boolean b) {
        this.isDeepDish = b;
    }

    @Override
    public String checkIntegrity() {
        // If thick crust, return warning
        if (this.ingredient == "Cauliflower") {
            return "Pizza is fragile; handle with care!";
        } else {
            return "";
        }
    }

    public String toString() {
        return "Thick Crust";
    }

    @Override
    public String toNiceString() {
        if (this.isDeepDish) {
            return "Crust: " + this.toString() + " (" + this.ingredient + ", deep dish)";
        } else {
            return "Crust: " + this.toString() + " (" + this.ingredient + ")";
        }
    }
}