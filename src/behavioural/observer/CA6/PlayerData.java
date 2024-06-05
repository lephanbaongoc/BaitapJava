package behavioural.observer.CA6;

public class PlayerData {
    PlayerDataListener listener;
    int thoiGian, soLuotChoi, diemSo;

    public PlayerData(int thoiGian, int soLuotChoi, int diemSo) {
        this.thoiGian = thoiGian;
        this.soLuotChoi = soLuotChoi;
        this.diemSo = diemSo;
    }

    @Override
    public String toString() {
        return "PlayerData{" +
                ", thoiGian=" + thoiGian +
                ", soLuotChoi=" + soLuotChoi +
                ", diemSo=" + diemSo +
                '}';
    }
    public void addDashBoard(PlayerDataListener p){
        p.listen(this);
    }

    public void dangKy(PlayerDataListener listener){
        this.listener = listener;
    }
    public void huyDangKy(PlayerDataListener listener){
        this.listener = null;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
        listener.listen(this);
    }

    public void setSoLuotChoi(int soLuotChoi) {
        this.soLuotChoi = soLuotChoi;
        listener.listen(this);
    }

    public void setDiemSo(int diemSo) {
        this.diemSo = diemSo;
        listener.listen(this);
    }
}
