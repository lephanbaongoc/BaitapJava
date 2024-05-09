package behavioural.chain_of_responsibility.CB1;

import java.util.Scanner;

public class MainATM {
    public static void main(String[] args) {

//        Tien t500 = new MenhGiaLonHon(500);
//        Tien t100 = new MenhGiaLonHon(100);
//        Tien t50 = new MenhGiaLonHon(50);
//        Tien t10 = new MenhGiaLonHon(10);
//        Tien t5 = new MenhGiaLonHon(5);
//        Tien t1 = new MenhGiaThapNhat(1);
//        //Câu a
//        t500.menhnhGiaKeTiep(t100).menhnhGiaKeTiep(t50).menhnhGiaKeTiep(t10).menhnhGiaKeTiep(t5).menhnhGiaKeTiep(t1);
//        t500.rutTien(293);

        //Câu b
        ChuoiMenhGiaFactory chuoiMenhGia = new ChuoiMenhGiaVND();
        chuoiMenhGia.rutTien(293, 50);
    }
}
