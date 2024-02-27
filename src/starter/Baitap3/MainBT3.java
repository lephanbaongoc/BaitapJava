package starter.Baitap3;

public class MainBT3 {
    public static void main(String[] args) {
        //Sinh viên Poly
        SinhVienPoLy sv1 = new SinhVienPoLy("Lê Phan Bảo Ngọc", "CNTT") {
            @Override
            public double getDiem() {
                return 7;
            }

        };
        sv1.Xuat();

        //Sinh viên IT
        SinhVIenIT sv2 = new SinhVIenIT("Nguyễn Bảo Uyên", "CNPM", 6, 7, 8);
        sv2.Xuat();

        //Sinh viên Biz
        SinhVienBiz sv3 = new SinhVienBiz("Trần Thị Hương Thủy", "KT", 7, 8);
        sv3.Xuat();
    }
}
