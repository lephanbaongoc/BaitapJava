package creational.singleton.A4;

public class MainVote {
    public static void main(String[] args) {
        User ngoc = new User("Ngọc");
        User thuy = new User("Thủy");
        User anh = new User("Anh");
        User tuyet = new User("Tuyết");
        ngoc.vote(Candidate.DONAL_TRUMP);
        thuy.vote(Candidate.JOE_BIDEN);
        anh.vote(Candidate.DONAL_TRUMP);
        tuyet.vote(Candidate.DONAL_TRUMP);
        tuyet.vote(Candidate.DONAL_TRUMP);
        Election.getInstance().kq();
    }
}
