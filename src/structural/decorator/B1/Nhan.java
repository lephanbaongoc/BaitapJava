package structural.decorator.B1;

public class Nhan extends BieuThucDecorator{
    float toanHang;

    public Nhan(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + bieuThuc.bieuThuc() + ")" + " * " + this.toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() * this.toanHang;
    }
}
