import static org.junit.Assert.*;
import org.junit.Test;

public class CheckEvenOddTest2 {

    // Kiểm tra số chẵn
    @Test
    public void testEvenNumber() {
        CheckEvenOdd checkEvenOdd = new CheckEvenOdd();
        String result = checkEvenOdd.checkNumber(10);
        assertEquals("10 là số chẵn.", result);
    }

    // Kiểm tra số lẻ
    @Test
    public void testOddNumber() {
        CheckEvenOdd checkEvenOdd = new CheckEvenOdd();
        String result = checkEvenOdd.checkNumber(7);
        assertEquals("7 là số lẻ.", result);
    }

    // Kiểm tra số 0 (số chẵn)
    @Test
    public void testZero() {
        CheckEvenOdd checkEvenOdd = new CheckEvenOdd();
        String result = checkEvenOdd.checkNumber(0);
        assertEquals("0 là số chẵn.", result);
    }

    // Kiểm tra số âm (số lẻ)
    @Test
    public void testNegativeOddNumber() {
        CheckEvenOdd checkEvenOdd = new CheckEvenOdd();
        String result = checkEvenOdd.checkNumber(-5);
        assertEquals("-5 là số lẻ.", result);
    }
}
