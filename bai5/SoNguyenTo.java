package bai5;

public class SoNguyenTo {
    public boolean kiemTraNguyenTo(int n) {
        // Nhánh 1: Các số <= 1 không bao giờ là số nguyên tố
        if (n <= 1) {
            return false;
        }
        
        // Vòng lặp kiểm tra từ 2 đến căn bậc 2 của n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // Nhánh 2: Nếu chia hết cho một số bất kỳ -> Không phải số nguyên tố
            if (n % i == 0) {
                return false; 
            }
        }
        
        // Luồng 3: Nếu chạy hết vòng lặp mà không chia hết cho số nào
        return true;
    }
}