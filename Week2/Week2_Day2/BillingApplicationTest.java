package week2.day2.assignment1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BillingApplicationTest {

    @Test
    void calculateDiscount_below1000_returnsZero() {
        double totalAmount = 800.0;
        double expectedDiscount = 0.0;

        double actualDiscount =
                BillingApplication.calculateDiscount(totalAmount);

        assertEquals(expectedDiscount, actualDiscount, 0.001);
    }

    @Test
    void calculateDiscount_exactly1000_returns50Rupees() {
        double totalAmount = 1000.0;
        double expectedDiscount = 50.0;

        double actualDiscount =
                BillingApplication.calculateDiscount(totalAmount);

        assertEquals(expectedDiscount, actualDiscount, 0.001);
    }

    @Test
    void calculateDiscount_at4999_returns249Point95Rupees() {
        double totalAmount = 4999.0;
        double expectedDiscount = 249.95;

        double actualDiscount =
                BillingApplication.calculateDiscount(totalAmount);

        assertEquals(expectedDiscount, actualDiscount, 0.001);
    }

    @Test
    void calculateDiscount_exactly5000_returns500Rupees() {
        double totalAmount = 5000.0;
        double expectedDiscount = 500.0;

        double actualDiscount =
                BillingApplication.calculateDiscount(totalAmount);

        assertEquals(expectedDiscount, actualDiscount, 0.001);
    }

    @Test
    void calculateDiscount_above5000_returns700Rupees() {
        double totalAmount = 7000.0;
        double expectedDiscount = 700.0;

        double actualDiscount =
                BillingApplication.calculateDiscount(totalAmount);

        assertEquals(expectedDiscount, actualDiscount, 0.001);
    }
}
