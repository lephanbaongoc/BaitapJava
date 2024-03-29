package behavioural.cc3_giohang;

public class MatHang {
    String tenMH;
    int soLuong;
    double donGia;

    @Override
    public String toString() {
        return "MatHang{" +
                "tenMH='" + tenMH + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }

    public MatHang(String tenMH, int soLuong, double donGia) {
        this.tenMH = tenMH;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getTenMH() {
        return tenMH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}
