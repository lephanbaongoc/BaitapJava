package structural.decorator.PC;

public class UpgradeCPU extends PCDecorator{
    String nCPU;
    int nvCPU;

    public UpgradeCPU(PC pc, String nCPU, int nvCPU) {
        super(pc);
        this.nCPU = nCPU;
        this.nvCPU = nvCPU;
    }

    @Override
    String build() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nâng cấp CPU: " + nCPU + "\n");
        return builder.toString();
    }

    @Override
    int value() {
        return pc.value() + nvCPU;
    }

    @Override
    public String getCPU() {
        return nCPU;
    }

    @Override
    public int getvCPU() {
        return vCPU;
    }
}
