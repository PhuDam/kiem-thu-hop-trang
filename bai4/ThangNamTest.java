package bai4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThangNamTest {

    ThangNam tn = new ThangNam();

    // --- TEST CASE CHO NHÁNH LỖI (Issue #2) ---
    @Test
    public void testDuLieuKhongHopLe() {
        assertThrows(IllegalArgumentException.class, () -> tn.tinhSoNgay(13, 2024)); // Tháng sai
        assertThrows(IllegalArgumentException.class, () -> tn.tinhSoNgay(0, 2024));  // Tháng sai
        assertThrows(IllegalArgumentException.class, () -> tn.tinhSoNgay(5, -1));    // Năm sai
    }

    // --- TEST CASE CHO LUỒNG HỢP LỆ (Issue #1) ---
    @Test
    public void testThangCo31Ngay() {
        assertEquals(31, tn.tinhSoNgay(1, 2024));
        assertEquals(31, tn.tinhSoNgay(8, 2023));
    }

    @Test
    public void testThangCo30Ngay() {
        assertEquals(30, tn.tinhSoNgay(4, 2024));
    }

    @Test
    public void testThang2NamNhuan() {
        // Chia hết cho 400
        assertEquals(29, tn.tinhSoNgay(2, 2000));
        // Chia hết cho 4 nhưng không chia hết cho 100
        assertEquals(29, tn.tinhSoNgay(2, 2024));
    }

    @Test
    public void testThang2NamKhongNhuan() {
        assertEquals(28, tn.tinhSoNgay(2, 2023));
        // Chia hết cho 100 nhưng không chia hết cho 400
        assertEquals(28, tn.tinhSoNgay(2, 1900)); 
    }
}