package behavioural.chain_of_responsibility.CB1;

public abstract class Tien {
    int menhGia;

    public Tien(int menhGia) {
        this.menhGia = menhGia;
    }

    public abstract Tien menhnhGiaKeTiep(Tien t);
    public abstract void rutTien(int soTien);
}
