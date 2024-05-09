package structural.decorator.B1;

public class GiaTriTuyetDoi extends BieuThucDecorator{
    public GiaTriTuyetDoi(BieuThuc bieuThuc) {
        super(bieuThuc);
    }

    @Override
    public String bieuThuc() {
        return "|" + bieuThuc.bieuThuc() + "|";
    }

    @Override
    public float giaTri() {
        return Math.abs(bieuThuc.giaTri());
    }
}
