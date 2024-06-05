package behavioural.observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements TopicListener{
    Topic t;
    List<TinTuc> list = new ArrayList<>();

    public ThanhVienB(Topic t) {
        this.t = t;
        t.dangKy(this);
    }

    @Override
    public void listen(TinTuc t) {
        boolean daco = false;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getId()==t.getId()){
                list.set(i,t);
                daco = true;
                break;
            }
        }
        if(!daco) list.add(t);
        System.out.println("tvb" + t.toString());
    }
}
