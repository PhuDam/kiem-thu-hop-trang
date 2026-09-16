package bai8;

public class TongGiaiThua {
    public long tinhTong(int n) {
        // Nhánh 1: Xử lý ngoại lệ với điều kiện biên (n <= 0)
        if (n <= 0) {
            throw new IllegalArgumentException("n phải lớn hơn 0");
        }
        
        long sum = 0;
        long factorial = 1;
        
        // Nhánh 2 & Vòng lặp: Chạy từ 1 đến n
        for (int i = 1; i <= n; i++) {
            factorial *= i; // Tính i!
            sum += factorial; // Cộng dồn i! vào tổng
        }
        
        return sum;
    }
}