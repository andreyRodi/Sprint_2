package model.service;

import model.Food;

public class ShoppingCart {
    private final Food[] bucket;

public ShoppingCart(Food[] bucket) {
this.bucket = bucket;
}


public double getSumWithoutDiscount(){
double sumWithoutDiscount = 0;

for (Food food : bucket)
    sumWithoutDiscount  += food.getTotalPrice();
    return sumWithoutDiscount;
}

public double getSumWithDiscount(){
    double getSumWithDiscount = 0;

    for (Food food : bucket)
        getSumWithDiscount += food.getPriceWithDiscount() * food.getAmount();
    return getSumWithDiscount;
    }



public double getSumVegan(){
double SumVegan = 0;
   for (Food food : bucket)
       if (food.getIsVegetarian().equals(true))
        SumVegan  += food.getTotalPrice();
    return SumVegan;
}


}


