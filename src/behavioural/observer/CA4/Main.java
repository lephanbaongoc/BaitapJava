package behavioural.observer.CA4;

public class Main {
    public static void main(String[] args) {
        Topic topic = new Topic();

        TinTuc t1 = new TinTuc(1, "nghỉ tết");
        TinTuc t2 = new TinTuc(2, "30/4 nghỉ học");
        TinTuc t3 = new TinTuc(3, "Nghỉ dịch sau tết thêm 3 tháng");
        ThanhVienA a = new ThanhVienA(topic);
        ThanhVienB b = new ThanhVienB(topic);
        topic.themMoi(t1);
        topic.themMoi(t2);
        topic.themMoi(t3);

        t3.setName("hết dịch ko nghỉ");
        System.out.println("\n Sau khi cập nhật:");
        topic.capNhat(t3);
    }
}
