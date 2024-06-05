package behavioural.chain_of_responsibility.CB3;

import behavioural.chain_of_responsibility.CB1.Tien;

public abstract class TienDienBacThang {
    String tenBac;
    int min, max;
    int giaTien;
    abstract int TienDien(int soKyDien);
    abstract TienDienBacThang bacCaoHon(TienDienBacThang bac);

}
