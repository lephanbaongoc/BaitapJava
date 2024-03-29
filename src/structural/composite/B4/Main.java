package structural.composite.B4;

public class Main {
    public static void main(String[] args) {
        HocMai k1 = new HocMai("kỳ 1");
        MonHoc mh1 = new MonHoc("Toán", 3,300000);
        MonHoc mh2 = new MonHoc("Lý", 2,200000);
        k1.add(mh1);
        k1.add(mh2);

        HocMai k2 = new HocMai("kỳ 2");
        MonHoc mh3 = new MonHoc("Sinh", 1,100000);
        k2.add(mh3);

        HocMai k3 = new HocMai("kỳ 3");
        MonHoc mh4 = new MonHoc("Văn", 2,350000);
        k3.add(mh4);

        HocMai k4 = new HocMai("kỳ 4");
        MonHoc mh5 = new MonHoc("Tiếng Anh", 4,400000);
        k4.add(mh5);

        System.out.println(k1.getCTDT());
        System.out.println(k2.getCTDT());
        System.out.println(k3.getCTDT());
        System.out.println(k4.getCTDT());
    }
}
