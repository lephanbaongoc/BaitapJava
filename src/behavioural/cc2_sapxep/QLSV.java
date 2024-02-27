package behavioural.cc2_sapxep;

import java.util.ArrayList;
import java.util.List;

public class QLSV{
    ISoSanh soSanh;
    List<SinhVien> ls = new ArrayList<>();

    public QLSV setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
        return this;
    }

    public void them(SinhVien sv){
        ls.add(sv);
    }
    public void sapxep(){
        for(int i=0; i<ls.size()-1; i++){
            for (int j=i+1; j<ls.size(); j++){
                if(soSanh.SoSanh(ls.get(i), ls.get(j))>0){
                    SinhVien s = ls.get(i);
                    ls.set(i, ls.get(j));
                    ls.set(j, s);
                }
            }
        }
    }
    public void inDS(){
        for(SinhVien s : ls)
            System.out.println(s.toString());
    }
}
