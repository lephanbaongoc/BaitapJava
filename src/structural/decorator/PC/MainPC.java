package structural.decorator.PC;

public class MainPC {
    public static void main(String[] args) {
        ConcretePC pc = new ConcretePC("RTX1080", "AQUA", "16GB", "500GB", "1080x720",
                1000000, 200000, 50000, 70000, 250000);
        System.out.println(pc.build() + pc.value());

        System.out.println("\n\nSau khi nâng cấp PC: ");

        PCDecorator f ;
        f = new UpgradeCPU(pc, "SCHOOLAR", 250000);
        System.out.println(f.build() + f.value());
        f = new UpgradeRAM(f, "32GB", 100000);
        System.out.println(f.build() + f.value());

    }
}
