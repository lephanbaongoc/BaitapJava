package behavioural.chain_of_responsibility.f88;

public class MainF88 {
    public static void main(String[] args) {
        NhanVienF88 baoVe = new NhanVien("Nguyễn Văn A", "Bảo vệ", 100000);
        NhanVienF88 tapVu = new NhanVien("Nguyễn Văn B", "Tạp vụ", 50000);
        NhanVienF88 thuKi = new NhanVien("Trần Thị C", "Thư kí", 1000000);
        NhanVienF88 truongPhong = new NhanVien("Hoàng Văn D", "Trưởng phòng", 2500000);
        NhanVienF88 chuTich = new ChuTich("Nguyễn Văn A", "Chủ tịch", 50000000);

        baoVe.capTren(tapVu).capTren(thuKi).capTren(truongPhong).capTren(chuTich);

        tapVu.duyetKhoanVay(15000000);
    }
}
