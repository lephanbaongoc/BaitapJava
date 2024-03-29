package structural.composite.B4;

public abstract class KHHT {
    String ten;
    String p = "";
    public KHHT(String ten) {
        this.ten = ten;
    }

    public abstract void add(KHHT kh);
    public abstract void remove(KHHT kh);
    public abstract String getCTDT();
    public abstract int soTc();

    public abstract int hocPhi();

}
