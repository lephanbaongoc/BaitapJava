package creational.singleton.A4;

public class User {
    String id;

    public User(String name) {
        this.id = name;
    }
    public void vote(Candidate candidate){
        Election.getInstance().vote(candidate,this.id);
    }
}
