package behavioural.chain_of_responsibility.CB1;

public abstract class ChuoiMenhGiaFactory{
    public abstract Tien getChuoiMenhGia(int menhGia);
    public void rutTien(int soTien, int menhGiaCaoNhat){
        Tien chuoiMenhGia = getChuoiMenhGia(menhGiaCaoNhat);
        if(chuoiMenhGia != null)
            chuoiMenhGia.rutTien(soTien);
        else System.out.println("Chọn lại mệnh giá lớn nhất!");
    }
}
