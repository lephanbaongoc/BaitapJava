package creational.factory;

public class VN_HaiSanPizza extends Pizza{
    @Override
    void prepare() {
        builder.append("Bộ gạo và 4 con cá cơm");
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
                .append("Đóng trong hộp có hình con cá");
    }

}
