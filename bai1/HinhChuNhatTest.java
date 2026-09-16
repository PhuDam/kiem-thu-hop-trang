package bai1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HinhChuNhatTest {

    HinhChuNhat hcn = new HinhChuNhat();

    // --- TEST CASE CHO LUỒNG HỢP LỆ (Issue #1) ---
    @Test
    public void testTinhChuVi_DuLieuHopLe() {
        assertEquals(16.0, hcn.tinhChuVi(5.0, 3.0), 0.0001);
    }

    // --- TEST CASE CHO NHÁNH LỖI, BIÊN (Issue #2) ---
    @Test
    public void testTinhChuVi_GiaTriBienBangKhong() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            hcn.tinhChuVi(0, 5);
        });
        assertEquals("Kích thước phải lớn hơn 0", exception.getMessage());
    }

    @Test
    public void testTinhChuVi_GiaTriAm() {
        assertThrows(IllegalArgumentException.class, () -> {
            hcn.tinhChuVi(-2.5, 4);
        });
    }
}