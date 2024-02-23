package Baitap4;

public class ChuyenXeNoiThanh extends ChuyenXe{
    int soTuyen, soKm;

    public ChuyenXeNoiThanh(String maSo, String taiXe, String soXe, int doanhThu, int soTuyen, int soKm) {
        super(maSo, taiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    @Override
    public String toString() {
        return "ChuyenXeNoiThanh{" +
                "soTuyen=" + soTuyen +
                ", soKm=" + soKm +
                ", maSo='" + maSo + '\'' +
                ", taiXe='" + taiXe + '\'' +
                ", soXe='" + soXe + '\'' +
                ", doanhThu=" + doanhThu +
                '}';
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public int getSoKm() {
        return soKm;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public void setSoKm(int soKm) {
        this.soKm = soKm;
    }
}
