package behavioural.cc3_giohang;

public class ThanhToanAirpay implements IGiamThanhToan{
    @Override
    public double GiamThanhToan(double S) {
        if(S>=1_000_000) return 0.01;
        else return 0.0;
    }
}
