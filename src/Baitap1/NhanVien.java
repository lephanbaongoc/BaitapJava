package Baitap1;

public class NhanVien {
    //    Viết class NhanVien gồm các thuộc tính:
//            - Tên
//- Tuổi
//- Địa chỉ
//- Tiền lương (double)
//- Tổng số giờ làm (int)
//    Constructor không tham số. Constructor đầy đủ các tham số. Các hàm get/set
    String ten, diachi;
    int tuoi, tongSoGioLam;
    double tienLuong;

    public NhanVien() {
    }

    public NhanVien(String ten, String diachi, int tuoi, int tongSoGioLam, double tienLuong) {
        this.ten = ten;
        this.diachi = diachi;
        this.tuoi = tuoi;
        this.tongSoGioLam = tongSoGioLam;
        this.tienLuong = tienLuong;
    }

    public double tinhThuong() {
//        + Nếu tổng số giờ làm của nhân viên >=200 thì thưởng = lương * 20%.
//        + Nếu tổng số giờ làm của nhân viên <200 và >=100 thì thưởng = lương * 10%.
//        + Nếu tổng số giờ làm của nhân viên <100 thì thưởng =0.
        if (tongSoGioLam >= 200)
            return tienLuong * 0.2;
        if (tongSoGioLam >= 100)
            return tienLuong * 0.1;
        return 0;
    }

    public String toString() {
        return "Tên: " + ten + "\n" +
                "Tuổi: " + tuoi + "\n" +
                "Địa chỉ: " + diachi + "\n" +
                "Tiền Lương: " + tienLuong + "\n" +
                "Tổng số giờ làm: " + tongSoGioLam + "\n" +
                "Thưởng: " + tinhThuong() + "\n";
    }


    public String getTen() {
        return ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }


}
