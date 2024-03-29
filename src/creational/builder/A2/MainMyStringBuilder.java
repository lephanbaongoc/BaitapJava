package creational.builder.A2;

public class MainMyStringBuilder {
    public static void main(String[] args) {
        MyStringBuilder stringBuilder = new MyStringBuilder();
        stringBuilder.appendString("Làm bài xong rồi nghỉ ").appendString("\n").appendString("Nghỉ thôi ").addFloat(7.5f).appendString(" điểm là đc rồi ").addBool(Boolean.TRUE);
        System.out.println(stringBuilder.toString());
    }
}
