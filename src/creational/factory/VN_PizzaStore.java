package creational.factory;

public class VN_PizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(PizzaType type) {
        if(type == PizzaType.HAISAN) {
            return new VN_HaiSanPizza();
        }
        else if (type == PizzaType.NAM) {
            return new VN_NamPizza();
        } return null;
    }

    public static void main(String[] args) {
        PizzaStore ps = new VN_PizzaStore();
        Pizza p = ps.orderPizza(PizzaType.HAISAN);
        System.out.println(p.toString());
    }
}
