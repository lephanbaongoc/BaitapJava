package behavioural.iterator.vidu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainIterator {
    public static void duyetMonHocs(Iterator<MonHoc> iterator){
        while (iterator.hasNext()){
            MonHoc monHoc = iterator.next();
            System.out.println(monHoc.toString());
        }
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<MonHoc> monHocList = new ArrayList<>(Arrays.asList(
                new MonHoc("Môn học 1", 2),
                new MonHoc("Môn học 2", 3),
                new MonHoc("Môn học 3", 2),
                new MonHoc("Môn học 4", 2),
                new MonHoc("Môn học 5", 3),
                new MonHoc("Môn học 6", 2),
                new MonHoc("Môn học 7", 4),
                new MonHoc("Môn học 8", 2)
        ));
        duyetMonHocs(monHocList.iterator());
    }

}
