package behavioural.iterator.CE1;

public class MainIterator {
    public static void main(String[] args) {
        ArrayAggregate aggregate = new ArrayAggregate();
        MyIterator iterator = aggregate.createIterator();
        while (!iterator.isDone()){
            System.out.println(iterator.next());
        }
    }
}
