package structural.composite.B3;

public abstract class AbstractFile {
    String ten, ngayTao, duongDan;
    String p = "";
    public abstract void add(AbstractFile f);
    public abstract void remove(AbstractFile f);
    public abstract String getStringTreeFolder();

    public AbstractFile(String ten, String ngayTao) {
        this.ten = ten;
        this.ngayTao = ngayTao;
        this.duongDan = ten;
    }
    public String getPath(){
        return duongDan;
    }
}
