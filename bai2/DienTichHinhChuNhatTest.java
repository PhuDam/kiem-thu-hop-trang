package bai2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DienTichHinhChuNhatTest {

    DienTichHinhChuNhat dt = new DienTichHinhChuNhat();

    // --- TEST CASE CHO LUỒNG HỢP LỆ (Issue #1) ---
    @Test
    public void testTinhDienTich_DuLieuHopLe() {
        // Đi qua Path 2
        assertEquals(15.0, dt.tinhDienTich(5.0, 3.0), 0.0001);
    }

    // --- TEST CASE CHO NHÁNH LỖI, BIÊN (Issue #2) ---
    @Test
    public void testTinhDienTich_GiaTriBienBangKhong() {
        // Đi qua Path 1 (kiểm tra biên 0)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            dt.tinhDienTich(0, 5);
        });
        assertEquals("Kích thước phải lớn hơn 0", exception.getMessage());
    }

    @Test
    public void testTinhDienTich_GiaTriAm() {
        // Đi qua Path 1 (kiểm tra số âm)
        assertThrows(IllegalArgumentException.class, () -> {
            dt.tinhDienTich(5, -3);
        });
    }
}