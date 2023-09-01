public abstract class PW {
    private String pw;
    public PW(String pw) {
        setPw(pw);
    }
    public void setPw(String pw) {
        this.pw=pw;
    }
    public String getPw(String pw) {
        return pw;
    }

    //로그인
    public abstract boolean login(String id, String pw); //1
}
