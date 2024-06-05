package behavioural.observer.CA4;

public class TinTuc {
    int Id;
    String Name;

    public TinTuc(int id, String name) {
        Id = id;
        Name = name;
    }

    @Override
    public String toString() {
        return "TinTuc{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
