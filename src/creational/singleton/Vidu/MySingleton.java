package creational.singleton.Vidu;

public class MySingleton {
    //1. khai báo biến sẽ một singleton
    private static MySingleton instance;
    //2. Phương thức khởi tạo phải là private hoặc protected
    int count = 0;
    private MySingleton(){

    }
    public static MySingleton getInstance(){
        if(instance == null)
            instance = new MySingleton();
        return instance;
    }

    public void inCount(){
        System.out.println(++count);
    }

}
