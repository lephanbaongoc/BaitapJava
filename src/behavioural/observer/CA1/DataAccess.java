package behavioural.observer.CA1;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    List<MonHoc> list = new ArrayList<>();
    MyStream<List<MonHoc>> stream;

    public DataAccess(MyStream<List<MonHoc>> stream) {
        this.stream = stream;
    }
    public void add(MonHoc m){
        list.add(m);
        stream.addEvent(list);
    }
    public void delete(MonHoc m){
        list.remove(m);
        stream.addEvent(list);
    }
}
