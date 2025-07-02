package org.example;
import model.service.ShoppingCart;
import model.Apple;
import model.Meat;
import model.Food;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Food[] food = {
                new Apple(10, 50 , "red"),
                new Apple(8, 60, "green"),
                new Meat(5, 100)
        };

        ShoppingCart shoppingCart = new ShoppingCart(food);

        System.out.println(shoppingCart.getSumWithoutDiscount());
        System.out.println(shoppingCart.getSumWithDiscount());
        System.out.println(shoppingCart.getSumVegan());
    }
}

