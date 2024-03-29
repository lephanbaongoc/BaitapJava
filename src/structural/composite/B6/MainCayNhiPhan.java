package structural.composite.B6;

public class MainCayNhiPhan {
    public static void main(String[] args) {
        InnerNode cay = new InnerNode(3);
        InnerNode c1 = new InnerNode(5);
        InnerNode c2 = new InnerNode(7);
        InnerNode c3 = new InnerNode(9);
        Leaf l1 = new Leaf(2);
        Leaf l2 = new Leaf(4);
        Leaf l3 = new Leaf(6);
        Leaf l4 = new Leaf(8);
        cay.addR(c1);
        cay.addL(l1);
        c1.addR(c3);
        c1.addL(l2);
        c3.addL(c2);
        c3.addR(l3);
        c2.addL(l1);
        c2.addR(l4);
        System.out.println(cay.travel());
    }
}
