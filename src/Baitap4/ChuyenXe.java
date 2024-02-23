package Baitap4;

public abstract class ChuyenXe {
    String maSo,taiXe,soXe;
    int doanhThu;

    protected ChuyenXe(String maSo, String taiXe, String soXe, int doanhThu) {
        this.maSo = maSo;
        this.taiXe = taiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaSo() {
        return maSo;
    }

    public String getTaiXe() {
        return taiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public int getDoanhThu() {
        return doanhThu;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public void setTaiXe(String taiXe) {
        this.taiXe = taiXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }
}
