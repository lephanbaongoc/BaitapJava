package creational.builder.A1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader header;
    List<CTHD> cthds;
    private HoaDon(Builder b){
        this.header = b.header;
        this.cthds = b.cthds;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(header.toString());
        builder.append("\nCHI TIẾT HÓA ĐƠN:");
        for(CTHD c : cthds)
            builder.append("\n").append(c.toString());
        return builder.toString();
    }

    public HoaDon(HoaDonHeader hoaDonHeader, List<CTHD> cthds) {
        this.header = hoaDonHeader;
        this.cthds = cthds;
    }

    public HoaDonHeader getHeader() {
        return header;
    }

    public void setHeader(HoaDonHeader header) {
        this.header = header;
    }

    public List<CTHD> getCthds() {
        return cthds;
    }

    public void setCthds(List<CTHD> cthds) {
        this.cthds = cthds;
    }
    public static class Builder{
        HoaDonHeader header;
        List<CTHD> cthds = new ArrayList<>();
        public Builder setHeader(String maHD, String ngayBan, String tenKH){
            header = new HoaDonHeader(maHD,ngayBan,tenKH);
            return this;
        }
        public Builder setCTHD(String sanPham, int soLuong, double donGia, double chietKhau){
            cthds.add(new CTHD(sanPham,soLuong,donGia,chietKhau));
            return this;
        }
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}
