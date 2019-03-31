import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CostCalculateTest {

    @Test
    public void costCalculate() {
        BigDecimal unitPrice = new BigDecimal(2.5);
        CostCalculate costCalculate = new CostCalculate(unitPrice);
        int countSms = 3;
        BigDecimal expected = BigDecimal.valueOf(7.5);
        assertEquals(expected, costCalculate.calculate(countSms, unitPrice));
    }

}
