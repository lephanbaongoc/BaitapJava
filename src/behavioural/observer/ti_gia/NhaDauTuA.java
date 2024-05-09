package behavioural.observer.ti_gia;

public class NhaDauTuA implements TigiaObserver{
    TiGia t;

    public NhaDauTuA(TiGia t) {
        this.t = t;
    }

    public void register(){
        t.attach(this);
    }
    public void unregister(){
            t.detach(this);
    }

    @Override
    public void update(float delta) {
        if(delta > 0)
            System.out.println("Nhà đầu tư A: Bán ra ");
        else
            System.out.println("Nhà đầu tư A: Mua vào ");
    }
}
