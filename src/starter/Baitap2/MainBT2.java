package starter.Baitap2;

import starter.Baitap1.NhanVien;

public class MainBT2 {
    public static void main(String[] args) {
        IQuanLy quanLy = new QuanLyNhanVien();
        quanLy.them(new NhanVien("Ngọc", "Khánh Hòa", 20, 250, 10_000_000));
        quanLy.them(new NhanVien("Thủy", "Khánh Hòa", 20, 250, 10_000_000));
        quanLy.inDS();
    }
}
