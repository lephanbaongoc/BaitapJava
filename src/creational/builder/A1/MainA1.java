package creational.builder.A1;

public class MainA1 {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Builder().setHeader("001","02/03/2024","Lê Phan Bảo Ngọc").setCTHD("Tivi",3,10_000_000,0.1f).build();
        HoaDon hoaDon1 = new HoaDon.Builder().setHeader("002","03/03/2024","Trần Thị Hương Thủy").setCTHD("Phone",5,4_000_000,0.3f).build();
        System.out.println(hoaDon.toString());
        System.out.println(hoaDon1.toString());
    }
}
