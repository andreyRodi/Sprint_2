package model;

public abstract class Food implements Discountable {
   protected int amount;
   protected double price;
   protected boolean isVegetarian;

   public Food(int amount, double price){
      this.amount = amount;
      this.price = price;
   }

   public Boolean getIsVegetarian() {
      return isVegetarian;
   }

   public int getAmount() {
      return amount;
   }

   public double getTotalPrice(){
      return (double) amount * price;
   }

   public double getPriceWithDiscount() {
      return price * (1 - getDiscount() / 100.0);
   }

}

