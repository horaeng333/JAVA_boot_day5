public class CustomerUser implements User {
    private String name;
    private int point;

    public CustomerUser(String name, int point) {
        this.point = point;
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    } //인터페이스는 public abstract 생략 가능.

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }
}