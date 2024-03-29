package creational.builder.A1;

import creational.builder.Vidu.Computer;

import java.util.Date;

public class CTHD{
    String sanPham;
    int soLuong;
    double donGia,chietKhau;

    @Override
    public String toString() {
        return "CTHD{" +
                "sanPham='" + sanPham + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                ", chietKhau=" + chietKhau +
                '}';
    }

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(double chietKhau) {
        this.chietKhau = chietKhau;
    }

    public CTHD(String sanPham, int soLuong, double donGia, double chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }
}
