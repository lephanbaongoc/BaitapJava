package structural.decorator.PC;

public class ConcretePC extends PC{
    public ConcretePC(String mainboard, String CPU, String RAM, String storage, String screen, int vMainboard, int vCPU, int vRAM, int vStorage, int vScreen) {
        this.mainboard = mainboard;
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
        this.screen = screen;
        this.vMainboard = vMainboard;
        this.vCPU = vCPU;
        this.vRAM = vRAM;
        this.vStorage = vStorage;
        this.vScreen = vScreen;
    }

    @Override
    String build() {
        StringBuilder builder = new StringBuilder();
        builder.append("Mainboard: " + mainboard + "\n")
                .append("CPU: " + CPU + "\n")
                .append("RAM: " + RAM + "\n")
                .append("Storage: " + storage + "\n")
                .append("Screen: " + screen + "\n");
        return builder.toString();
    }

    @Override
    int value() {
        return vMainboard+vCPU+vRAM+vStorage+vScreen;
    }
}
