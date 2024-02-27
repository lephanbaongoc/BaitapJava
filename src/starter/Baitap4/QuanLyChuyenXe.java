package starter.Baitap4;

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    List<ChuyenXe> dsChuyenXe = new ArrayList<>();
    public void them(ChuyenXe xe1){
        dsChuyenXe.add(xe1);
    }
    public void inDS(){
        dsChuyenXe.forEach(chuyenXe -> {
            System.out.println(chuyenXe.toString());
        });
    }
    public int doanhThuXeNoiThanh(){
        int tong=0;
        for(ChuyenXe xe1: dsChuyenXe)
            if(xe1 instanceof ChuyenXeNoiThanh)
                tong += xe1.doanhThu;
        return tong;
    }
    public int doanhThuXeNgoaiThanh(){
        int tong=0;
        for(ChuyenXe xe1:dsChuyenXe)
            if(xe1 instanceof ChuyenXeNgoaiThanh)
                tong += xe1.doanhThu;
        return tong;
    }
    public int doanhThuHaiLoaiXe(){
        int tong=0;
        for(ChuyenXe xe1:dsChuyenXe)
            tong+=xe1.doanhThu;
        return tong;
    }
}
