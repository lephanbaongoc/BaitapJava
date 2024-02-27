package behavioural.cc2_sapxep;

public class SoSanhTheoDiem implements ISoSanh<SinhVien>{
    @Override
    public int SoSanh(SinhVien o1, SinhVien o2) {
        if(o1.diemTB > o2.diemTB) return 1;
        if(o1.diemTB == o2.diemTB) return 0;
        else return -1;
    }
}
