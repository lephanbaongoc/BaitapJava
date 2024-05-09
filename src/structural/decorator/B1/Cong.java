package structural.decorator.B1;

public class Cong extends BieuThucDecorator{
    float toanHang;

    public Cong(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public String bieuThuc() {
        return bieuThuc.bieuThuc() + " + " + this.toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() + this.toanHang;
    }
}
