package behavioural.chain_of_responsibility.CB1;

public class ChuoiMenhGiaVND extends ChuoiMenhGiaFactory{
    Tien t500 = new MenhGiaLonHon(500);
    Tien t100 = new MenhGiaLonHon(100);
    Tien t50 = new MenhGiaLonHon(50);
    Tien t10 = new MenhGiaLonHon(10);
    Tien t5 = new MenhGiaLonHon(5);
    Tien t1 = new MenhGiaThapNhat(1);

    public ChuoiMenhGiaVND() {
        t500.menhnhGiaKeTiep(t100).menhnhGiaKeTiep(t50).menhnhGiaKeTiep(t10).menhnhGiaKeTiep(t5).menhnhGiaKeTiep(t1);
    }

    @Override
    public Tien getChuoiMenhGia(int menhGia) {
        switch (menhGia){
            case 500:
                return t500;
            case 100:
                return t100;
            case 50:
                return t50;
            case 10:
                return t10;
            case 5:
                return t5;
        }
        return null;
    }
}
