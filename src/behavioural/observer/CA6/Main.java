package behavioural.observer.CA6;

public class Main {
    public static void main(String[] args) {
        PlayerData data = new PlayerData(10,1,3);
        PlayerData data2 = new PlayerData(15,3,6);
        PlayerData data3 = new PlayerData(20,5,8);
        PlayerData data4 = new PlayerData(25,7,10);

        DashBoard d = new DashBoard();
        data.addDashBoard(d);
        data2.addDashBoard(d);
        data3.addDashBoard(d);
        data4.addDashBoard(d);
    }
}
