import java.math.BigDecimal;

public class CostCalculate {

    private BigDecimal price;

    private BigDecimal itemCost  = BigDecimal.ZERO;

    public CostCalculate(BigDecimal unitPrice) {
        price = unitPrice;
    }

    BigDecimal calculate(int countSms) {

        itemCost  = price.multiply(new BigDecimal(countSms));

        return itemCost;
    }


}
