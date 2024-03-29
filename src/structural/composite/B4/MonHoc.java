package structural.composite.B4;

public class MonHoc extends KHHT{
    int soTC, hp;

    public MonHoc(String ten, int soTC, int hp) {
        super(ten);
        this.soTC = soTC;
        this.hp = hp;
    }

    @Override
    public void add(KHHT kh) {

    }

    @Override
    public void remove(KHHT kh) {

    }

    @Override
    public String getCTDT() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.ten)
                .append(";\t").append("Số tc: ").append(soTc())
                .append(";\t").append("Học phí: ").append(hocPhi());
        return builder.toString();
    }

    @Override
    public int soTc() {
        return soTC;
    }

    @Override
    public int hocPhi() {
        return hp*soTC;
    }
}
