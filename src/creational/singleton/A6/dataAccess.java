package creational.singleton.A6;

import java.util.ArrayList;
import java.util.List;

public class dataAccess {//singleton
    private static dataAccess instance;
    List<SanPham> CSDL = new ArrayList<>();
    private dataAccess(){
    }
    public static dataAccess getInstance(){
        if(instance==null)
            instance = new dataAccess();
        return instance;
    }
    public void them(SanPham sp){
        CSDL.add(sp);
    }
    public void xoa(SanPham sp){
        CSDL.remove(sp);
    }
    public void sua(SanPham sp){

    }
}
