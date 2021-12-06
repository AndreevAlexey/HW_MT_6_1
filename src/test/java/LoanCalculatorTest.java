import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoanCalculatorTest {
    LoanCalculator loanCalculator;

    @BeforeEach
    public void init() {
        loanCalculator = new LoanCalculator();
    }

    @Test
    public void getMonthPaySum() {
        // given
        int loanSum = 10000;
        int prc = 15;
        int period = 6;
        // when
        float result = loanCalculator.getMonthPaySum(loanSum, period, prc);
        // then
        Assertions.assertEquals(1740, result);
    }

    @Test
    public void getMonthPaySum_PRC_0_Throws_Exception() {
        // given
        int loanSum = 10000;
        int prc = 0;
        int period = 6;
        // expect
        Assertions.assertThrows(ArithmeticException.class, ()->{
            loanCalculator.getMonthPaySum(loanSum, period, prc);
        });
    }

    @Test
    public void getMonthPaySum_PERIOD_0_Throws_Exception() {
        // given
        int loanSum = 10000;
        int prc = 15;
        int period = 0;
        // expect
        Assertions.assertThrows(ArithmeticException.class, ()->{
            loanCalculator.getMonthPaySum(loanSum, period, prc);
        });
    }

    @Test
    public void getOverpaymentSum() {
        // given
        int loanSum = 10000;
        int prc = 15;
        int period = 6;
        // when
        float result = loanCalculator.getOverpaymentSum(loanSum, period, prc);
        // then
        Assertions.assertEquals(440, result);
    }

    @Test
    public void getFullLoanSum() {
        // given
        int loanSum = 10000;
        int prc = 15;
        int period = 6;
        // when
        float result = loanCalculator.getFullLoanSum(loanSum, period, prc);
        // then
        Assertions.assertEquals(1440, result);
    }
}
