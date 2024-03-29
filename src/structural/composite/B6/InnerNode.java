package structural.composite.B6;

public class InnerNode extends BNode{
    BNode left, right;

    public InnerNode(int value) {
        super(value);
    }

    @Override
    public void addL(BNode node) {
        left = node;
    }

    @Override
    public void addR(BNode node) {
        right = node;
    }

    @Override
    public void RemoveL(BNode node) {
        left = null;
    }

    @Override
    public void RemoveR(BNode node) {
        right = null;
    }

    @Override
    public String travel() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.value);
        if(left!=null){
            left.p = this.p + "\t";
            builder.append("\n").append(left.p).append(left.travel());
            left.p = "";
        }
        if(right!=null){
            right.p = this.p + "\t";
            builder.append("\n").append(right.p).append(right.travel());
            right.p = "";
        }
        return builder.toString();
    }
}
