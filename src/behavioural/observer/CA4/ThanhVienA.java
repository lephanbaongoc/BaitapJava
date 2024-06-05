package behavioural.observer.CA4;

public class ThanhVienA implements TopicListener {
    Topic t;

    public ThanhVienA(Topic t) {
        this.t = t;
        t.dangKy(this);
    }

    @Override
    public void listen(TinTuc t) {
        System.out.println("tva" + t.toString());
    }
}
