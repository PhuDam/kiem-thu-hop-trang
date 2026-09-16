package bai8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TongGiaiThuaTest {

    TongGiaiThua tgt = new TongGiaiThua();

    // --- TEST CASE CHO BIÊN VÀ NGOẠI LỆ ---
    @Test
    public void testNNhoHonHoacBang0() {
        // Đi qua Path 1
        assertThrows(IllegalArgumentException.class, () -> tgt.tinhTong(0));
        assertThrows(IllegalArgumentException.class, () -> tgt.tinhTong(-5));
    }

    // --- TEST CASE KIỂM TRA VÒNG LẶP ---
    @Test
    public void testNBang1() {
        // Đi qua Path 2 (Lặp 1 lần)
        assertEquals(1, tgt.tinhTong(1));
    }

    @Test
    public void testNLonHon1() {
        // Đi qua Path 3 (Lặp nhiều lần)
        // 1! + 2! = 1 + 2 = 3
        assertEquals(3, tgt.tinhTong(2)); 
        // 1! + 2! + 3! = 1 + 2 + 6 = 9
        assertEquals(9, tgt.tinhTong(3)); 
        // 1! + 2! + 3! + 4! = 9 + 24 = 33
        assertEquals(33, tgt.tinhTong(4)); 
    }
}