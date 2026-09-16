package bai3;

public class PhuongTrinhBac2 {
    public String giaiPhuongTrinh(double a, double b, double c) {
        // Nhánh 1: Nếu a = 0, bài toán trở thành phương trình bậc 1 (bx + c = 0)
        if (a == 0) {
            if (b == 0) {
                return (c == 0) ? "Vô số nghiệm" : "Vô nghiệm";
            } else {
                return "Một nghiệm: " + (-c / b);
            }
        } 
        // Nhánh 2: Nếu a != 0, giải phương trình bậc 2 bình thường
        else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                return "Vô nghiệm";
            } else if (delta == 0) {
                return "Nghiệm kép: " + (-b / (2 * a));
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                return "Hai nghiệm: " + x1 + ", " + x2;
            }
        }
    }
}