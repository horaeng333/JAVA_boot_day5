public class ID {
    private String id;
    private String pw;
    public ID() {}
    public ID(String id, String pw) {
        this.id=id;
        this.pw=pw;
    }
    public String getId(String id) {
        return id;
    }

    public String getPw(String pw) {
        return pw;
    }

    public String toString() {
        return "id="+id+", pw="+pw;
    }
}
