package behavioural.chain_of_responsibility.CB3;

public class MainTienDien {
    public static void main(String[] args) {
        TienDienBacThang b1 = new BacThongThuong("Bậc 1", 0, 50, 1806);
        TienDienBacThang b2 = new BacThongThuong("Bậc 2", 50, 100, 1866);
        TienDienBacThang b3 = new BacThongThuong("Bậc 3", 100, 200, 2167);
        TienDienBacThang b4 = new BacThongThuong("Bậc 4", 200, 300, 2729);
        TienDienBacThang b5 = new BacThongThuong("Bậc 5", 300, 400, 3051);
        TienDienBacThang b6 = new BacCaoNhat("Bậc 6", 400, 3151);
        b1.bacCaoHon(b2).bacCaoHon(b3).bacCaoHon(b4).bacCaoHon(b5).bacCaoHon(b6);

        System.out.println("Tổng tiền điện: " + b1.TienDien(450));

    }
}
