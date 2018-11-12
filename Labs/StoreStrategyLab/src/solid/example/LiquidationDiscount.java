package solid.example;

public class LiquidationDiscount implements DiscountStrategy {
    public char discountType;
    @Override
    public void discount(){
        discountType = 'L';
        System.out.println(discountType);
    }
}
