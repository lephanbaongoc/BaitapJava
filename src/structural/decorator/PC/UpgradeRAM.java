package structural.decorator.PC;

public class UpgradeRAM extends PCDecorator{
    String nRAM;
    int nvRAM;

    public UpgradeRAM(PC pc, String nRAM, int nvRAM) {
        super(pc);
        this.nRAM = nRAM;
        this.nvRAM = nvRAM;
    }

    @Override
    String build() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nâng cấp RAM: " + nRAM + "\n");
        return builder.toString();
    }

    @Override
    int value() {
        return pc.value()+nvRAM;
    }

    @Override
    public String getRAM() {
        return super.getRAM() + " " + nvRAM;
    }

    @Override
    public int getvRAM() {
        return super.getvRAM() + nvRAM;
    }
}
