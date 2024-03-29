package creational.builder.A5;

public class MainBook {
    public static void main(String[] args) {
        Book book = new Book.Builder().setTuaDe("Harry Potter").setTacGia("J.K Rowling").setSoTrang(10101)
                .setChuong("Harry Potter và Hòn đá phù thủy").setChuong("Harry Potter và Chiếc cốc Lửa")
                .setChuong("Harry Potter và Bảo bối tử thần (END)").build();
        System.out.println(book.toString());
    }
}
