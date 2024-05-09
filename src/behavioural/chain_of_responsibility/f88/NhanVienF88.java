package behavioural.chain_of_responsibility.f88;

public abstract class NhanVienF88 {
    String ten, chucVu;
    int hanMucDuyetVay;
    public abstract void duyetKhoanVay(int soTienVay);
    public abstract NhanVienF88 capTren(NhanVienF88 nv);

    public NhanVienF88(String ten, String chucVu, int hanMucDuyetVay) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMucDuyetVay = hanMucDuyetVay;
    }
}
