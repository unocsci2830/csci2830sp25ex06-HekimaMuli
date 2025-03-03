package pizza;
import java.util.Scanner;

import pizza.crust.ThickCrust;
import pizza.crust.ThinCrust;
import pizza.sauce.AlfredoSauce;
import pizza.sauce.TomatoSauce;
import pizza.topping.BaconTopping;
import pizza.topping.CheddarTopping;
import pizza.topping.FetaTopping;
import pizza.topping.HamburgerTopping;
import pizza.topping.MozarellaTopping;
import pizza.topping.MushroomTopping;
import pizza.topping.OliveTopping;
import pizza.topping.OnionTopping;
import pizza.topping.ParmesanTopping;
import pizza.topping.PepperoniTopping;
import pizza.topping.RadishTopping;
import pizza.topping.SausageTopping;

public class PizzaMain {
    public static void main(String[] args) {

        Pizza pizza = new Pizza();
        int toppingNum = 0;
        Scanner scan = new Scanner(System.in);
        boolean validChoice = false;

        // Ask for crust
        System.out.println("What kind of crust would you like:");
        System.out.println("1 - Thin crust");
        System.out.println("2 - Thick crust");

        while (!validChoice) {
            System.out.print("Your choice: ");
            switch (scan.nextInt()) {
                case 1:
                    pizza.setCrust(new ThinCrust());
                    validChoice = true;
                    break;
                case 2:
                    pizza.setCrust(new ThickCrust());

                    // Ask if it's deep dish
                    System.out.println("Is the crust deep dish:");
                    System.out.println("1 - Yes");
                    System.out.println("2 - No");

                    while (!validChoice) {
                        System.out.print("Your choice: ");
                        switch (scan.nextInt()) {
                            case 1:
                                ((ThickCrust) pizza.getCrust()).setIsDeepDish(true);
                                validChoice = true;
                                break;
                            case 2:
                                ((ThickCrust) pizza.getCrust()).setIsDeepDish(false);
                                validChoice = true;
                                break;
                            default:
                                System.out.println("Please choose a valid option for deep dish.");
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Please enter a valid crust.");
                    break;
            }
        }

        // Ask for crust ingredient
        System.out.println("What kind of crust ingredient would you like:");
        System.out.println("1 - Flour");
        System.out.println("2 - Califlower");
        validChoice = false;
        while (!validChoice) {
            System.out.print("Your choice: ");
            switch (scan.nextInt()) {
                case 1:
                    pizza.getCrust().setIngredient("Flour");
                    validChoice = true;
                    break;
                case 2:
                    pizza.getCrust().setIngredient("Cauliflower");
                    validChoice = true;
                    break;
                default:
                    System.out.println("Please enter a valid crust ingredient.");
                    break;
            }
        }

        // Ask for sauce
        System.out.println("What kind of sauce would you like:");
        System.out.println("1 - Tomato");
        System.out.println("2 - Alfredo");
        validChoice = false;
        while (!validChoice) {
            System.out.print("Your choice: ");
            switch (scan.nextInt()) {
                case 1:
                    pizza.setSauce(new TomatoSauce());
                    validChoice = true;
                    break;
                case 2:
                    pizza.setSauce(new AlfredoSauce());
                    validChoice = true;
                    break;
                default:
                    System.out.println("Please enter a valid sauce.");
                    break;
            }
        }

        // Ask for toppings
        System.out.print("How many toppings? ");
        toppingNum = scan.nextInt();

        System.out.println("1 - Bacon");
        System.out.println("2 - Hamburger");
        System.out.println("3 - Pepperoni");
        System.out.println("4 - Sausage");
        System.out.println("5 - Mushroom");
        System.out.println("6 - Olive");
        System.out.println("7 - Onion");
        System.out.println("8 - Radish");
        System.out.println("9 - Cheddar");
        System.out.println("10 - Feta");
        System.out.println("11 - Mozarella");
        System.out.println("12 - Parmesan");

        for (int i = 0; i < toppingNum; i++) {
            validChoice = false;
            while (!validChoice) {
                System.out.print("Choice " + (i+1) + ": ");
                switch (scan.nextInt()) {
                    case 1:
                        pizza.addTopping(new BaconTopping());
                        validChoice = true;
                        break;
                    case 2:
                        pizza.addTopping(new HamburgerTopping());
                        validChoice = true;
                        break;
                    case 3:
                        pizza.addTopping(new PepperoniTopping());
                        validChoice = true;
                        break;
                    case 4:
                        pizza.addTopping(new SausageTopping());
                        validChoice = true;
                        break;
                    case 5:
                        pizza.addTopping(new MushroomTopping());
                        validChoice = true;
                        break;
                    case 6:
                        pizza.addTopping(new OliveTopping());
                        validChoice = true;
                        break;
                    case 7:
                        pizza.addTopping(new OnionTopping());
                        validChoice = true;
                        break;
                    case 8:
                        pizza.addTopping(new RadishTopping());
                        validChoice = true;
                        break;
                    case 9:
                        pizza.addTopping(new CheddarTopping());
                        validChoice = true;
                        break;
                    case 10:
                        pizza.addTopping(new FetaTopping());
                        validChoice = true;
                        break;
                    case 11:
                        pizza.addTopping(new MozarellaTopping());
                        validChoice = true;
                        break;
                    case 12:
                        pizza.addTopping(new ParmesanTopping());
                        validChoice = true;
                        break;
                    default:
                        System.out.println("Please enter a valid topping.");
                        break;
                }
            }
        }

        // Print out pizza ingredients
        pizza.print();
        
        // Check pizza crust integrity
        System.out.println(pizza.getCrust().checkIntegrity());
    }
}