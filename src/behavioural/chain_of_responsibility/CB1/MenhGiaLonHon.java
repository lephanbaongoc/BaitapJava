package behavioural.chain_of_responsibility.CB1;

public class MenhGiaLonHon extends Tien{
    Tien keTiep;

    public MenhGiaLonHon(int menhGia ) {
        super(menhGia);
    }

    @Override
    public Tien menhnhGiaKeTiep(Tien t) {
        keTiep = t;
        return keTiep;
    }

    @Override
    public void rutTien(int soTien) {
        int soTo = soTien/menhGia;
        soTien = soTien%menhGia;
        if (soTo > 0) System.out.println(soTo + " tờ " + menhGia);
        if (soTien > 0)
            keTiep.rutTien(soTien);
    }
}
