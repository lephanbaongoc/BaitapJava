package behavioural.observer.CA6;

public class DashBoard implements PlayerDataListener{
    PlayerData playerData;

    public DashBoard() {

    }
    @Override
    public void listen(PlayerData data) {
        System.out.println(data.toString());
    }
}
