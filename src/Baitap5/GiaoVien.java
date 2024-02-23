package Baitap5;

public class GiaoVien extends CaNhan{
    String monDay, toBoMon;

    public GiaoVien(String hoTen, String diaChi, String sdt, int tuoi, String monDay, String toBoMon) {
        super(hoTen, diaChi, sdt, tuoi);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    @Override
    public String HienThiTT() {
        String tt = super.HienThiTT();
        return tt + "Giáo viên" +
                ", Môn dạy: " + monDay +
                ", Tổ bộ môn: " + toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }
}
