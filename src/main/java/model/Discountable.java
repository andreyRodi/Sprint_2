package model;

public interface Discountable {
    default int getDiscount(){
        return 0;
    }
}


