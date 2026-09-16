package bai6;

public class TongDanDau {
    public int tinhTong(int n) {
        // Nhánh 1: Kiểm tra ngoại lệ (điều kiện biên n <= 0)
        if (n <= 0) {
            throw new IllegalArgumentException("n phải lớn hơn 0");
        }
        
        int s = 0;
        // Vòng lặp từ 1 đến n
        for (int i = 1; i <= n; i++) {
            // Nhánh 2: Nếu i chẵn thì trừ đi i
            if (i % 2 == 0) {
                s -= i;
            } 
            // Nhánh 3: Nếu i lẻ thì cộng thêm i
            else {
                s += i;
            }
        }
        
        return s;
    }
}