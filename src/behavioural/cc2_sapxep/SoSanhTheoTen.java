package behavioural.cc2_sapxep;

public class SoSanhTheoTen implements ISoSanh<SinhVien>{
    @Override
    public int SoSanh(SinhVien o1, SinhVien o2) {
        if(o1.hoTen.compareTo(o2.hoTen) > 0) return 1;
        if(o1.hoTen.equals(o2.hoTen)) return 0;
        else return -1;
    }
}
