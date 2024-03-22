import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalcTest {
    static Calc calculator;

    @BeforeAll
    static void initialization() {
        calculator = new Calc();
    }

    @Test
    void testSum() {
        System.out.println("Test Sum");
        Assertions.assertEquals(3, calculator.sum(1, 2));
    }

    @Test
    void testSub() {
        System.out.println("Test Sub");
        Assertions.assertEquals(-1, calculator.sub(1, 2));
    }
}