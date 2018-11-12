package solid.example;

public class SaleDiscount implements DiscountStrategy {
    public char discountType;
   @Override
    public void discount() {
        discountType = 'S';
        System.out.println(discountType);
    }
}
