package bai3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhuongTrinhBac2Test {

    PhuongTrinhBac2 pt = new PhuongTrinhBac2();

    // --- CÁC TEST CASE ĐI QUA TỪNG NHÁNH ĐIỀU KIỆN ---

    @Test
    public void testA0_B0_C0() { // Path 1
        assertEquals("Vô số nghiệm", pt.giaiPhuongTrinh(0, 0, 0));
    }

    @Test
    public void testA0_B0_C_Khac0() { // Path 2
        assertEquals("Vô nghiệm", pt.giaiPhuongTrinh(0, 0, 5));
    }

    @Test
    public void testA0_B_Khac0() { // Path 3
        assertEquals("Một nghiệm: -2.5", pt.giaiPhuongTrinh(0, 2, 5));
    }

    @Test
    public void testDeltaNhoHon0() { // Path 4
        assertEquals("Vô nghiệm", pt.giaiPhuongTrinh(1, 1, 1));
    }

    @Test
    public void testDeltaBang0() { // Path 5
        assertEquals("Nghiệm kép: -1.0", pt.giaiPhuongTrinh(1, 2, 1));
    }

    @Test
    public void testDeltaLonHon0() { // Path 6
        // Nghiệm của x^2 - 3x + 2 = 0 là x1 = 2, x2 = 1
        assertEquals("Hai nghiệm: 2.0, 1.0", pt.giaiPhuongTrinh(1, -3, 2));
    }
}