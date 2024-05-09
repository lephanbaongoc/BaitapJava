package structural.decorator.B2;

public class MainTokenize {
    public static void main(String[] args) {
        Tokenize t = new TachTu("Sắp nghỉ lễ được bốn ngày, thích quá, đi chơi thôi!");
        System.out.println(t.tokenize());
        t = new RemoveStopwords(t);
        System.out.println(t.tokenize());
        t = new RemovePunctuation(t);
        System.out.println(t.tokenize());
    }
}
