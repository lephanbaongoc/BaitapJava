package starter.Baitap4;

public class MainBT4 {
    public static void main(String[] args) {
        QuanLyChuyenXe quanLyChuyenXe = new QuanLyChuyenXe();
        quanLyChuyenXe.them(new ChuyenXeNoiThanh("001","Tài xế 1", "xe01", 150_000, 3, 1000));
        quanLyChuyenXe.them(new ChuyenXeNoiThanh("002","Tài xế 2", "xe02", 130_000, 2, 800));
        quanLyChuyenXe.them(new ChuyenXeNgoaiThanh("003","Tài xế 3", "xe03", 200_000, "Cam Ranh", 3));
        quanLyChuyenXe.them(new ChuyenXeNgoaiThanh("004","Tài xế 4", "xe04", 250_000, "Hà Nội", 5));

        quanLyChuyenXe.inDS();
        System.out.println("Doanh thu chuyến xe ngoại thành: "+quanLyChuyenXe.doanhThuXeNgoaiThanh());
        System.out.println("Doanh thu chuyến xe nội thành: "+quanLyChuyenXe.doanhThuXeNoiThanh());
        System.out.println("Doanh thu tất cả chuyến xe: "+quanLyChuyenXe.doanhThuHaiLoaiXe());
    }
}
