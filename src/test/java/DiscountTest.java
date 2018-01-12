import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class DiscountTest {

    @Test
    public void testCalculateDiscount() {
        double testprice_nomal = 88.99;

        assertEquals(testprice_nomal * 1.2, new Discount().CalculateDiscount("新书", testprice_nomal));
        assertEquals(testprice_nomal, new Discount().CalculateDiscount("常规图书", testprice_nomal));
        assertEquals(testprice_nomal * 0.6, new Discount().CalculateDiscount("滞销图书", testprice_nomal));

        double testprice_ill = -10.99;

        assertEquals(-1.0, new Discount().CalculateDiscount("非法类型", testprice_nomal));
        assertEquals(-1.0, new Discount().CalculateDiscount("新书", testprice_ill));
        assertEquals(-1.0, new Discount().CalculateDiscount("常规图书", testprice_ill));
        assertEquals(-1.0, new Discount().CalculateDiscount("滞销图书", testprice_ill));

        assertEquals(-1.0, new Discount().CalculateDiscount("", testprice_ill));
        assertEquals(-1.0, new Discount().CalculateDiscount(null, testprice_ill));

    }
}
