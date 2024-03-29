package structural.composite.B4;

import java.util.ArrayList;
import java.util.List;

public class HocMai extends KHHT{
    List<KHHT> ls = new ArrayList<>();

    public HocMai(String ten) {
        super(ten);
    }

    @Override
    public void add(KHHT kh) {
        ls.add(kh);
    }

    @Override
    public void remove(KHHT kh) {
        ls.remove(kh);
    }

    @Override
    public String getCTDT() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.ten)
                .append(";\t").append("Tổng số tc: ").append(soTc())
                .append(";\t").append("Tổng học phí: ").append(hocPhi());
        for(var m : ls){
            m.p = this.p + "\t";
            builder.append("\n").append(m.p).append(m.getCTDT());
            m.p = "";
        }

        return builder.toString();
    }

    @Override
    public int soTc() {
        int tongTc=0;
        for ( var mh : ls){
            tongTc+=mh.soTc();
        }
        return tongTc;
    }

    @Override
    public int hocPhi() {
        int tongHP=0;
        for ( var mh : ls){
            tongHP+=mh.hocPhi();
        }
        return tongHP;
    }
}
