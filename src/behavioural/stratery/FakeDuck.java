package behavioural.stratery;

public class FakeDuck extends Duck63{
    @Override
    public void display() {
        System.out.println("\n\nĐây là vịt phake!!! ");
        performFly();
        performQuack();
        System.out.println("LỪA ĐẢO");
    }
}
