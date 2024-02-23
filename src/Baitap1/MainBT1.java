package Baitap1;

public class MainBT1 {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Ngọc","Khánh Hòa", 20, 250, 10_000_000);
        NhanVien nv2 = new NhanVien("Thủy","Khánh Hòa", 20, 250, 10_000_000);


        System.out.println(nv1.toString());
        System.out.println(nv2.toString());
    }
}
