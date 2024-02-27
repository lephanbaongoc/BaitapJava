package starter.Baitap5;

public class LopHoc {
    public static void main(String[] args) {
        QLDS qlds = new QLDS();
        qlds.them(new HocSinh("Ngọc", "Khánh Hòa","0708006618",20, "CNTT", "java"));
        qlds.them(new HocSinh("Thủy", "Phú Yên","0703426818",20, "CNTT", "html"));

        qlds.them(new GiaoVien("Uyên", "Cam Ranh","0936567318",30, "Toan", "Kinh Tế"));
        qlds.them(new GiaoVien("Hằng", "Hà Nội","0438593934",27, "Luật Hình Sự", "Luật"));

        //In ds học sinh
        qlds.inDS();
        //In ds giáo viên
    }
}
