package behavioural.chain_of_responsibility.CB3;

public class BacThongThuong extends TienDienBacThang{
    TienDienBacThang bacCaoHon;
    public BacThongThuong(String tenBac, int min, int max, int giaTien) {
        this.tenBac = tenBac;
        this.min = min;
        this.max = max;
        this.giaTien = giaTien;
    }

    @Override
    int TienDien(int soKyDien) {
        StringBuilder builder = new StringBuilder();
        if(soKyDien <= (max-min)) {
            builder.append(tenBac).append(": ").append(min).append(" --> ").append(max)
                    .append(": ").append(soKyDien).append("x").append(giaTien).append(" = ").append(soKyDien*giaTien);
            System.out.println(builder.toString());
            return soKyDien*giaTien;
        }
        else {
            int tienDien = (max-min)*giaTien;
            builder.append(tenBac).append(": ").append(min).append(" --> ").append(max)
                    .append(": ").append(max-min).append("x").append(giaTien).append(" = ").append(tienDien);
            System.out.println(builder.toString());
            return tienDien + bacCaoHon.TienDien(soKyDien-(max-min));
        }

    }

    @Override
    TienDienBacThang bacCaoHon(TienDienBacThang bac) {
        bacCaoHon = bac;
        return bacCaoHon;
    }
}
