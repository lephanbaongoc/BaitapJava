package behavioural.iterator.CE1;

import java.util.Arrays;

public class ArrayIterator implements MyIterator{
    private ArrayAggregate array;
    int index =-1;
    public ArrayIterator(ArrayAggregate array) {
        this.array = array;
    }

    @Override
    public Object first() {
        if(!isDone()){
            index = 0;
            return array.getItem(index);
        }
        return null;
    }

    @Override
    public Object next() {
        return array.getItem(++index);
    }

    @Override
    public boolean isDone() {
        return index == array.count()-1;
    }

    @Override
    public Object currentItem() {
        if(index>=0)
            return array.getItem(index);
        return null;
    }
}
