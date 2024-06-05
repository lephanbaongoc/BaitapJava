package behavioural.chain_of_responsibility.CB3;

public class BacCaoNhat extends TienDienBacThang{
    public BacCaoNhat(String tenBac, int min, int giaTien) {
        this.tenBac = tenBac;
        this.min = min;
        this.giaTien = giaTien;
    }

    @Override
    int TienDien(int soKyDien) {
        StringBuilder builder = new StringBuilder();
        builder.append(tenBac).append(": <").append(min).append(": ")
                .append(soKyDien).append("x").append(giaTien).append(" = ").append(soKyDien*giaTien);
        System.out.println(builder.toString());
        return soKyDien*giaTien;

    }

    @Override
    TienDienBacThang bacCaoHon(TienDienBacThang bac) {
        return null;
    }
}
