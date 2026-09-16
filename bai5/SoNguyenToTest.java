package bai5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SoNguyenToTest {

    SoNguyenTo snt = new SoNguyenTo();

    // --- TEST CASE CHO BIÊN VÀ NGOẠI LỆ (Issue #2) ---
    @Test
    public void testSoNhoHonHoacBang1() {
        // Đi qua Path 1 (Biên 1, 0 và số âm)
        assertFalse(snt.kiemTraNguyenTo(1));
        assertFalse(snt.kiemTraNguyenTo(0));
        assertFalse(snt.kiemTraNguyenTo(-5));
    }

    // --- TEST CASE CHO CÁC LUỒNG VÒNG LẶP HỢP LỆ (Issue #1, Issue #2) ---
    @Test
    public void testKhongVaoVongLapHoacVaoMotLan() {
        // Đi qua Path 2
        assertTrue(snt.kiemTraNguyenTo(2));
        assertTrue(snt.kiemTraNguyenTo(3));
    }

    @Test
    public void testVaoVongLapVaThoatSom() {
        // Đi qua Path 3 (Phát hiện hợp số)
        assertFalse(snt.kiemTraNguyenTo(4));
        assertFalse(snt.kiemTraNguyenTo(9));
    }

    @Test
    public void testVaoVongLapChayHet() {
        // Đi qua Path 4 (Số nguyên tố thực sự)
        assertTrue(snt.kiemTraNguyenTo(5));
        assertTrue(snt.kiemTraNguyenTo(17));
    }
}