package behavioural.chain_of_responsibility.CB1;

public class MenhGiaThapNhat extends Tien{
    public MenhGiaThapNhat(int menhGia) {
        super(menhGia);
    }

    @Override
    public Tien menhnhGiaKeTiep(Tien t) {
        return null;
    }

    @Override
    public void rutTien(int soTien) {
        int soTo = soTien/menhGia;
        if (soTo > 0) System.out.println(soTo + " tờ " + menhGia);
    }
}
