package behavioural.observer.ti_gia;

import java.util.ArrayList;
import java.util.List;

public class TiGia {
    List<TigiaObserver> observers = new ArrayList<TigiaObserver>();
    public void attach(TigiaObserver observer){
        observers.add(observer);
    }
    public void detach(TigiaObserver observer){
        observers.remove(observer);
    }
    public void notify(float delta){
        for(TigiaObserver observer : observers)
            observer.update(delta);
    }
}
