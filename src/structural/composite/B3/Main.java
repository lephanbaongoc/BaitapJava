package structural.composite.B3;

public class Main {
    public static void main(String[] args) {
        Folder a = new Folder("a","1/1/2023");
        Folder b = new Folder("b","1/1/2023");
        Folder c = new Folder("c","1/1/2023");
        Folder d = new Folder("d","1/1/2023");
        File txt = new File("txt","1/1/2023");
        File ppt = new File("ppt","1/1/2023");

        a.add(ppt);
        a.add(txt);
        a.add(b);

        b.add(ppt);
        b.add(c);

        c.add(d);
        System.out.println(a.getStringTreeFolder());
    }

}
