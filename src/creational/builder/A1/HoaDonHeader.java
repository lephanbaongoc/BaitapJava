package creational.builder.A1;

import java.util.Date;

public class HoaDonHeader {
    String maHD,tenKH,ngayBan;

    @Override
    public String toString() {
        return "HoaDonHeader{" +
                "maHD='" + maHD + '\'' +
                ", ngayBan='" + ngayBan + '\'' +
                ", tenKH='" + tenKH + '\'' +
                '}';
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public HoaDonHeader(String maHD, String tenKH, String ngayBan) {
        this.maHD = maHD;
        this.tenKH = tenKH;
        this.ngayBan = ngayBan;
    }
}
