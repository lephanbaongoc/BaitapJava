package creational.singleton.A4;

import java.util.ArrayList;
import java.util.List;

public class Election {//Singleton
    private static Election instance;
    int trump = 0,biden = 0;
    List<String> users = new ArrayList<>();
    private Election(){
    }
    public static Election getInstance(){
        if(instance == null)
            instance = new Election();
        return instance;
    }
    public void vote(Candidate candidate,String name){
        for (String id : users){
            if(id.equals(name))
                return;
        }
        if(candidate == Candidate.DONAL_TRUMP){
            trump++;
            users.add(name);
        }
        else
        if(candidate == Candidate.JOE_BIDEN){
            biden++;
            users.add(name);
        }
    }
    public void kq(){
        System.out.println("Donal Trump: "+trump);
        System.out.println("Joe Biden: "+biden);
    }
}
