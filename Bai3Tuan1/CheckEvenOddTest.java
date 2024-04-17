import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheckEvenOddTest {

    private CheckEvenOdd checkEvenOdd;

    @Before
    public void setUp() throws Exception {
        checkEvenOdd = new CheckEvenOdd(); // Khởi tạo đối tượng kiểm tra
    }

    @After
    public void tearDown() throws Exception {
        checkEvenOdd = null; // Đặt đối tượng kiểm tra về null sau khi sử dụng
    }

    @Test
    public void testEvenNumber() {
        // Kiểm tra cho số chẵn
        assertEquals("10 là số chẵn.", checkEvenOdd.checkNumber(10));
    }

    @Test
    public void testOddNumber() {
        // Kiểm tra cho số lẻ
        assertEquals("7 là số lẻ.", checkEvenOdd.checkNumber(7));
    }

    @Test
    public void testZero() {
        // Kiểm tra cho số 0 (số chẵn)
        assertEquals("0 là số chẵn.", checkEvenOdd.checkNumber(0));
    }
}
