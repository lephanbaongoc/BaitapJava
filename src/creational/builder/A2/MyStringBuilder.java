package creational.builder.A2;

public class MyStringBuilder {
    String s = "";
    float f;
    public MyStringBuilder appendString(String sub){
        s += sub;
        return this;
    }
    public MyStringBuilder addFloat(float f){
        s += f;
        return this;
    }
    public MyStringBuilder addBool(Boolean b){
        s += b;
        return this;
    }
    @Override
    public String toString() {
        return s;
    }
}
