package structural.decorator.B1;

public class MainBieuThuc {
    public static void main(String[] args) {
        BieuThuc b1 = new BieuThucDonGian(3);
        b1 = new Cong(b1, 5);
        System.out.println(b1.bieuThuc() + " = " + b1.giaTri());

        b1 = new Tru(b1, 10);
        System.out.println(b1.bieuThuc() + " = " + b1.giaTri());

        b1 = new Nhan(b1, 3);
        System.out.println(b1.bieuThuc() + " = " + b1.giaTri());

        b1 = new Chia(b1, 4);
        System.out.println(b1.bieuThuc() + " = " + b1.giaTri());

        b1 = new GiaTriTuyetDoi(b1);
        System.out.println(b1.bieuThuc() + " = " + b1.giaTri());
    }
}
