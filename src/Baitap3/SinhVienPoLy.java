package Baitap3;

public abstract class SinhVienPoLy {
    String hoTen, nganh;

    public SinhVienPoLy(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();
    public String getHocLuc(){
        if(getDiem()<5) return "Yếu";
        if(getDiem()>=5&&getDiem()<6.5) return "Trung bình";
        if(getDiem()>=6.5&&getDiem()<7.5) return "Khá";
        if(getDiem()>=7.5&&getDiem()<9) return "Giỏi";
        else return "Xuất sắc";
    }

    public void Xuat(){
        System.out.println("SinhVienPoLy{" +
                "hoTen='" + hoTen + '\'' +
                ", nganh='" + nganh + '\'' +
                ", Diem='" + getDiem() + '\'' +
                '}');
    };
    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
}
