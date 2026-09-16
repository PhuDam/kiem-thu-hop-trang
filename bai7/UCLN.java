package bai7;

public class UCLN {
    public int timUCLN(int a, int b) {
        // UCLN thường tính trên số dương, nên ta lấy trị tuyệt đối
        a = Math.abs(a);
        b = Math.abs(b);
        
        // Nhánh 1: Ngoại lệ (Cả hai số đều bằng 0 thì không có UCLN)
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("Không có UCLN của 0 và 0");
        }
        
        // Nhánh 2 và Vòng lặp: Thuật toán Euclid
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }
}