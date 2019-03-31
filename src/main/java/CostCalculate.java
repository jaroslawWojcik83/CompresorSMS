import java.math.BigDecimal;

public class CostCalculate {

    private BigDecimal price = BigDecimal.ZERO;

    private BigDecimal itemCost  = BigDecimal.ZERO;

    public CostCalculate(BigDecimal unitPrice) {
        price = unitPrice;
    }

    BigDecimal calculate(int countSms, BigDecimal price) {

        itemCost  = price.multiply(new BigDecimal(countSms));

        return itemCost;
    }


}
