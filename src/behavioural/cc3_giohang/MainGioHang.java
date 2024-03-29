package behavioural.cc3_giohang;

import behavioural.cc2_sapxep.Main;

import java.util.ArrayList;
import java.util.List;

public class MainGioHang {
    public static void main(String[] args) {
        GioHang gioHang = new GioHang();
        List<MatHang> ls = new ArrayList<>();
        gioHang.themMH(new MatHang("PC",1,10_000_000));
        gioHang.themMH(new MatHang("Phone",3,2_000_000));
        gioHang.themMH(new MatHang("Laptop",5,500_000));
        System.out.println("\nGIỎ HÀNG:");
        gioHang.inDS();
        gioHang.setGiamThanhToan(new ThanhToanAirpay()).ThanhToan();
    }
}
