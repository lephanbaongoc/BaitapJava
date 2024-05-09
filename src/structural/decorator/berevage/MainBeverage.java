package structural.decorator.berevage;

public class MainBeverage {
    public static void main(String[] args) {
        Beverage b = new HouseBlend("Cafe TN số 1 TG");
            b = new Milk("Sữa cô gái Hà lan", b);
        System.out.println(b.getDescription());
        System.out.println(b.cost());
            b = new Milk("Sữa Ông thọ", b);
        System.out.println(b.getDescription());
        System.out.println(b.cost());

        Beverage e = new Espresso("Cafe Espresso từ Anh Quốc");
            e = new Sugar("Ít đường", e);
        System.out.println(e.getDescription());
        System.out.println(e.cost());

    }
}
