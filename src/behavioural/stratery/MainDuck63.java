package behavioural.stratery;

public class MainDuck63 {
    public static void main(String[] args) {
        Duck63 d1 = new VitQuay();
        d1.setFlyable(new BayTrenLoThan());
        d1.setQuackable(new SQuack());
        d1.display();

        Duck63 d2 = new FakeDuck();
        d2.setFlyable(new KoBayDc());
        d2.setQuackable(new CantQuack());
        d2.display();

        Duck63 d3 = new ElegantDuck();
        d3.setFlyable(new BayCaoBayXa());
        d3.setQuackable(new SQuack());
        d3.display();
    }
}
