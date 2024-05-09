package behavioural.observer.CA5;

public class MainATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan t1 = new TaiKhoan("Lê Phan Bảo Ngọc", 1000000, atm);
        TaiKhoan t2 = new TaiKhoan("ADO", 5000000, atm);
        TaiKhoan t3 = new TaiKhoan("SEELE", 7000000, atm);

        t1.duaTheVaoATM();
        System.out.println("\tLần 1: ");
        atm.rutTien(500);
        System.out.println("\tLần 2: ");
        atm.rutTien(700);
        t1.rutTheKhoiATM();

        t2.duaTheVaoATM();
        System.out.println("\tLần 3: ");
        atm.rutTien(25000);
        t2.rutTheKhoiATM();

        t3.duaTheVaoATM();
        System.out.println("\tLần 4: ");
        atm.rutTien(100000);
        System.out.println("\tLần 5: ");
        atm.rutTien(50000);
    }
}
