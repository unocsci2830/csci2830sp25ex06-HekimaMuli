package pizza;
import java.util.ArrayList;

import pizza.crust.PizzaCrust;
import pizza.sauce.PizzaSauce;
import pizza.topping.PizzaTopping;

public class Pizza implements MenuItem {
    private PizzaCrust crust;
    private PizzaSauce sauce;
    private ArrayList<MenuItem> itemList;

    public Pizza() {
        this.crust = null;
        this.sauce = null;
        this.itemList = new ArrayList<MenuItem>();
    }

    public void setCrust(PizzaCrust c) {
        this.crust = c;
        this.itemList.add(this.crust);
    }

    public void setSauce(PizzaSauce s) {
        this.sauce = s;
        this.itemList.add(this.sauce);
    }

    public void addTopping(PizzaTopping t) {
        this.itemList.add(t);
    }

    public PizzaCrust getCrust() {
        return this.crust;
    }

    public void print() {
        for (MenuItem t : this.itemList) {
            System.out.println(t.toString() + ": $" + t.getPrice());
        }
        System.out.println("Total price: $" + this.getPrice());
    }

    public Double getPrice() {
        Double price = 0.0;
        for (MenuItem t : this.itemList) {
            price = price + t.getPrice();
        }
        return price;
    }
}