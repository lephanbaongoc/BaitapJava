package structural.composite.B6;

public abstract class BNode {
    int value;
    String p;
    public BNode(int value) {
        this.value = value;
    }

    public abstract void addL(BNode node);
    public abstract void addR(BNode node);
    public abstract void RemoveL(BNode node);
    public abstract void RemoveR(BNode node);
    public abstract String travel();
}
