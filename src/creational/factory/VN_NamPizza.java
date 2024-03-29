package creational.factory;

public class VN_NamPizza extends Pizza{
    @Override
    void prepare() {
        builder.append("Bộ gạo và nấm cắt nhỏ");
    }

    @Override
    void bake() {
        builder.append("\n")
                .append("Nướng trên lò than");
    }

    @Override
    void cut() {
        builder.append("\n")
                .append("Cắt đều");
    }

    @Override
    void box() {
        builder.append("\n")
                .append("Đóng trong hộp có hình cây nấm");
    }

}
