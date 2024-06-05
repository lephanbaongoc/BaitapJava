package behavioural.observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class Topic{
    List<TopicListener> listeners = new ArrayList<>();
    List<TinTuc> list = new ArrayList<>();
    void dangKy(TopicListener listener){
        listeners.add(listener);
    }
    void huyDangKy(TopicListener listener){
        listeners.remove(listener);
    }
    void themMoi(TinTuc t){
        list.add(t);
        for(TopicListener listener : listeners)
            listener.listen(t);
    }
    void capNhat(TinTuc t){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getId()==t.getId()){
                list.set(i,t);
                for(TopicListener listener: listeners)
                    listener.listen(t);
                ;
            }
        }
    }
}
