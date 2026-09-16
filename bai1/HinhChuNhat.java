package bai1;

public class HinhChuNhat {
    public double tinhChuVi(double a, double b) {
        // Nhánh 1: Kiểm tra giá trị biên và ngoại lệ
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Kích thước phải lớn hơn 0");
        }
        
        // Nhánh 2: Luồng xử lý hợp lệ
        return 2 * (a + b);
    }
}