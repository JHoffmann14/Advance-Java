package solid.example;

public class DiscountDiscount implements DiscountStrategy{
    public char discountType;
    @Override
    public void discount(){
        discountType = 'D';
        System.out.println(discountType);
    }

}
