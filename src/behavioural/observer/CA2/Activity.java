package behavioural.observer.CA2;

import behavioural.observer.CA6.PlayerDataListener;

public class Activity {
    ActivityListener listener;
    int count = 0;

    public void dangKy(ActivityListener listener){
        this.listener = listener;
    }
    public void huyDangKy(ActivityListener listener){
        this.listener = null;
    }

}
