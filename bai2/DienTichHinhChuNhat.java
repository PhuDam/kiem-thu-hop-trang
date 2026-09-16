package bai2;

public class DienTichHinhChuNhat {
    public double tinhDienTich(double a, double b) {
        // Nhánh 1: Kiểm tra giá trị biên và ngoại lệ
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Kích thước phải lớn hơn 0");
        }
        
        // Nhánh 2: Luồng xử lý hợp lệ
        return a * b;
    }
}