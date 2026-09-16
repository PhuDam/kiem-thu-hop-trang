package bai6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TongDanDauTest {

    TongDanDau td = new TongDanDau();

    // --- TEST CASE CHO BIÊN VÀ NGOẠI LỆ (Issue #2) ---
    @Test
    public void testNNhoHonHoacBang0() {
        // Đi qua Path 1
        assertThrows(IllegalArgumentException.class, () -> td.tinhTong(0));
        assertThrows(IllegalArgumentException.class, () -> td.tinhTong(-3));
    }

    // --- TEST CASE LUỒNG HỢP LỆ & VÒNG LẶP (Issue #1, Issue #2) ---
    @Test
    public void testNBang1() {
        // Đi qua Path 2: Chỉ vào nhánh lẻ (1)
        assertEquals(1, td.tinhTong(1));
    }

    @Test
    public void testNChan() {
        // Đi qua Path 3 với n chẵn: (1 - 2 + 3 - 4 = -2)
        assertEquals(-2, td.tinhTong(4));
    }

    @Test
    public void testNLe() {
        // Đi qua Path 3 với n lẻ: (1 - 2 + 3 - 4 + 5 = 3)
        assertEquals(3, td.tinhTong(5));
    }
}