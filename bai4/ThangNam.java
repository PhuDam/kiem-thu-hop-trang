package bai4;

public class ThangNam {
    public int tinhSoNgay(int thang, int nam) {
        // Nhánh 1: Kiểm tra ngoại lệ
        if (thang < 1 || thang > 12 || nam < 0) {
            throw new IllegalArgumentException("Tháng hoặc năm không hợp lệ");
        }
        
        // Nhánh 2: Xử lý các tháng
        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                // Nhánh 3: Kiểm tra năm nhuận
                if ((nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0; // Trình biên dịch Java yêu cầu phải có return mặc định
        }
    }
}