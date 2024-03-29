package behavioural.cc1_tinh;

public class Main {
    public static void main(String[] args) {
        Context c = new Context();
        float kq1 = c.setTinh(new Cong()).tinh(3,5);
        float kq2 = c.setTinh(new Tru()).tinh(kq1,7);
        float kq3 = c.setTinh(new Nhan()).tinh(kq1,7);
        float kq4 = c.setTinh(new Chia()).tinh(kq1,7);
        float kq = c.setTinh(new Can()).tinh(kq1,3);

        System.out.println(kq1 + "\n" + kq2 +  "\n" + kq3 +  "\n" + kq4);
        System.out.println("\n"+kq);
    }
}
