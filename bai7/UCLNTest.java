package bai7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UCLNTest {

    UCLN uc = new UCLN();

    // --- TEST CASE CHO NGOẠI LỆ ---
    @Test
    public void testHaiSoBangKhong() {
        // Path 1
        assertThrows(IllegalArgumentException.class, () -> uc.timUCLN(0, 0));
    }

    // --- TEST CASE KIỂM TRÁ VÒNG LẶP ---
    @Test
    public void testKhongVaoVongLap() {
        // Path 2: b = 0
        assertEquals(5, uc.timUCLN(5, 0));
        assertEquals(7, uc.timUCLN(0, 7)); // Đoạn này a=0, b=7, thuật toán vẫn chạy đúng
    }

    @Test
    public void testVaoVongLapMotLan() {
        // Path 3: a chia hết cho b
        assertEquals(5, uc.timUCLN(10, 5));
    }

    @Test
    public void testVaoVongLapNhieuLan() {
        // Path 4: Chạy nhiều lần
        assertEquals(2, uc.timUCLN(14, 4));
        assertEquals(3, uc.timUCLN(15, 9));
    }

    // --- TEST CASE ĐẶC BIỆT CHO SỐ ÂM ---
    @Test
    public void testSoAm() {
        assertEquals(5, uc.timUCLN(-15, 20));
        assertEquals(6, uc.timUCLN(-18, -12));
    }
}