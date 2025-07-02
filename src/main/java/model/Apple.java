package model;


import static model.constants.Discount.RED_APPLE_DISCOUNT;
import static  model.constants.Colour.COLOUR_APPLE_RED;

public class Apple extends Food {
    public String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
        isVegetarian = true;
    }

    @Override
    public int getDiscount() {
       return COLOUR_APPLE_RED.equals(colour) ? RED_APPLE_DISCOUNT : 0;
   }


}



//   public int getDiscount() {
//        if (colour == "red") {
//            discount = 60;
//        } else discount = 0;
//        return discount;
//    }