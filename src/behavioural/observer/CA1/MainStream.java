package behavioural.observer.CA1;

import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        MyStream<List<MonHoc>> stream = new MyStream<>();
        DataAccess dataAccess = new DataAccess(stream);
//        MyClient myClient = new MyClient(stream);
        MyClientGeneric<List<MonHoc>> client = new MyClientGeneric<List<MonHoc>>(stream,monHocs -> {
            for (MonHoc monHoc : monHocs){
                System.out.println(monHoc.toString());
            }
        });

        System.out.println("\nLần 1: ");
        dataAccess.add(new MonHoc("01", "Thể dục", 1));
        System.out.println("\nLần 2: ");
        dataAccess.add(new MonHoc("02","Sinh học", 3 ));
    }
}
