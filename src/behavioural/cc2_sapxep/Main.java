package behavioural.cc2_sapxep;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        List<SinhVien> ls = new ArrayList<>();
        qlsv.them(new SinhVien("Ngọc Lê Phan Bảo","12/12/2003", 8.5F));
        qlsv.them(new SinhVien("Uyên Nguyễn Bảo","12/12/2003", 6.5F));
        qlsv.them(new SinhVien("Thủy Trần Thị Hương","12/12/2003", 9.5F));
        System.out.println("\nDANH SÁCH SINH VIÊN");
        qlsv.inDS();

        System.out.println("\nDANH SÁCH SINH VIÊN THEO TÊN");
        qlsv.setSoSanh(new SoSanhTheoTen()).sapxep();
        qlsv.inDS();

        System.out.println("\nDANH SÁCH SINH VIÊN THEO ĐIỂM");
        qlsv.setSoSanh(new SoSanhTheoDiem()).sapxep();
        qlsv.inDS();
    }
}
