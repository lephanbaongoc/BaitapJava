package behavioural.cc1_tinh;

public class Can implements Tinh{

    @Override
    public float tinh(float a, float b) {
        return (float)Math.pow(a,b);
    }
}
