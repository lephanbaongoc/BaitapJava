package creational.builder.A5;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String tuaDe,tacGia;
    int soTrang;
    List<String> Chuong;
    private Book (Builder b){
        this.tuaDe = b.tuaDe;
        this.soTrang = b.soTrang;
        this.tacGia = b.tacGia;
        this.Chuong = b.Chuong;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tựa đề: ").append(tuaDe).append("\n")
                .append("Tác giả: ").append(tacGia).append("\n")
                .append("Số trang: ").append(soTrang).append("\n")
                .append("Các chương: ").append("\n");
        int i = 1;
        for (String c : Chuong)
            builder.append("\t").append(i++).append(", ").append(c).append("\n");
        return builder.toString();
    }

    public static class Builder{
        String tuaDe,tacGia;
        int soTrang;
        List<String> Chuong = new ArrayList<>();
        public Builder setTuaDe(String tuaDe){
            this.tuaDe = tuaDe;
            return this;
        }
        public Builder setSoTrang(int soTrang){
            this.soTrang = soTrang;
            return this;
        }
        public Builder setTacGia(String tacGia){
            this.tacGia = tacGia;
            return this;
        }
        public Builder setChuong(String chuong){
            Chuong.add(chuong);
            return this;
        }
        public Book build(){return new Book(this);}
    }

}
