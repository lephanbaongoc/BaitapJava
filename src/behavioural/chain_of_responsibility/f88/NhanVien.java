package behavioural.chain_of_responsibility.f88;

public class NhanVien extends NhanVienF88{
    NhanVienF88 capTren;

    public NhanVien(String ten, String chucVu, int hanMucDuyetVay) {
        super(ten, chucVu, hanMucDuyetVay);
    }

    @Override
    public void duyetKhoanVay(int soTienVay) {
        if(soTienVay <= hanMucDuyetVay) System.out.println( chucVu + " duyệt mức vay: " + soTienVay);
        else {
            capTren.duyetKhoanVay(soTienVay);
        }
    }

    @Override
    public NhanVienF88 capTren(NhanVienF88 nv) {
        capTren = nv;
        return capTren;
    }
}
