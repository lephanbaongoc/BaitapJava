package behavioural.cc3_giohang;

public class ThanhToanCOD implements IGiamThanhToan{
    @Override
    public double GiamThanhToan(double S) {
        if(S>=2_000_000) return 0.02;
        else return 0.0;
    }
}
