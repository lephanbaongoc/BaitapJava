package behavioural.observer.ti_gia;

public class MainTiGia {
    public static void main(String[] args) {
        TiGia t = new TiGia();
        NhaDauTuA a = new NhaDauTuA(t);
        NhaDautuB b = new NhaDautuB(t);
        a.register();
        b.register();
        t.notify(5);

        a.unregister();
        System.out.println("Lần 2:");
        t.notify(-5);
    }
}
