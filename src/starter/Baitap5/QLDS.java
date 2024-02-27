package starter.Baitap5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class QLDS implements IQLDS{
    List<CaNhan> list = new ArrayList<>();
    @Override
    public int them(CaNhan p) {
        list.add(p);
        return 0;
    }

    @Override
    public int xoa(String ten) {
        list.forEach(caNhan -> {
            if(Objects.equals(caNhan.hoTen, ten))
                list.remove(caNhan);
        });
        return 0;
    }

    @Override
    public void inDS() {
        list.forEach(caNhan -> {
            System.out.println(caNhan.HienThiTT());
        });
    }
}
