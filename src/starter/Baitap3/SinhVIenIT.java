package starter.Baitap3;

public class SinhVIenIT extends SinhVienPoLy{
    double diemJava, diemHTML, diemCSS;

    public SinhVIenIT(String hoTen, String nganh, double diemJava, double diemHTML, double diemCSS) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCSS = diemCSS;
    }

    @Override
    public double getDiem() {
        return (2*diemJava + diemHTML + diemCSS) / 4;
    }
}
