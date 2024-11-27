import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HotelbillTest {

    @Test
    public void testBillwerter() {
        // Test when Last_Meter < Current_Meter
        assertEquals(250, Hotelbill.Billwerter(150, 200)); // (200 - 150) * 5 = 250
        
        // Test when Last_Meter == Current_Meter
        assertEquals(0, Hotelbill.Billwerter(200, 200)); // 0
        
        // Test when Last_Meter > Current_Meter (error case, should return null)
        assertThrows(NullPointerException.class, () -> Hotelbill.Billwerter(200, 150));
    }

    @Test
    public void testBillElect() {
        // Test when Last_Meter < Current_Meter
        assertEquals(300, Hotelbill.BillElect(150, 200)); // (200 - 150) * 6 = 300
        
        // Test when Last_Meter == Current_Meter
        assertEquals(0, Hotelbill.BillElect(200, 200)); // 0
        
        // Test when Last_Meter > Current_Meter (error case, should return null)
        assertThrows(NullPointerException.class, () -> Hotelbill.BillElect(200, 150));
    }

    @Test
    public void testSumbill() {
        // Test valid summing of water and electricity bills
        assertEquals(550, Hotelbill.sumbill(250, 300)); // 250 + 300 = 550
    }

    @Test
    public void testTotalbill() {
        // Test for "Single Bed"
        assertEquals(2050, Hotelbill.Totalbill(550, "Single Bed")); // 550 + 1500 = 2050

        // Test for "Double Bed"
        assertEquals(2550, Hotelbill.Totalbill(550, "Double Bed")); // 550 + 2000 = 2550

        // Test for invalid bed type (null or other values)
        assertThrows(NullPointerException.class, () -> Hotelbill.Totalbill(550, "Invalid Bed Type"));
    }
}
