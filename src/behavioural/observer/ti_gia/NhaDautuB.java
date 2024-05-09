package behavioural.observer.ti_gia;

public class NhaDautuB implements TigiaObserver{
    TiGia t;

    public NhaDautuB(TiGia t) {
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
            System.out.println("Nhà đầu tư B: Mua vào");
        else
            System.out.println("Nhà đầu tư B: Bán ra ");
    }
}
