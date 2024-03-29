package behavioural.cc3_giohang;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    IGiamThanhToan giamThanhToan;
    List<MatHang> ls = new ArrayList<>();
    double S = 0.0;

    public GioHang setGiamThanhToan(IGiamThanhToan giamThanhToan) {
        this.giamThanhToan = giamThanhToan;
        return this;
    }
    public void themMH(MatHang mh){
        ls.add(mh);
    }
    public void inDS(){
        for(MatHang mh : ls){
            System.out.println(mh.toString());
        }
    }
    public double TongTien(){

        return S;
    }
    public void ThanhToan(){
        double Sale;
        for(MatHang mh : ls){
            S += mh.donGia;
        }
        if(giamThanhToan.GiamThanhToan(S)!=0.0){
            Sale=(Double)giamThanhToan.GiamThanhToan(S);

        }
        else Sale=0.0;
        double T = S-S*Sale;
        System.out.println("Tổng tiền giỏ hàng: "+S+", Tiền đc giảm: "+Sale+", Tổng tiền phải trả: "+T);
    }
}
