public class Customer extends PW{
    private String customerId;
    public Customer(String customerId, String pw) {
        super(pw);
        this.customerId=customerId;
    }
    public boolean login(String id, String pw) { //재정의 필수.

        return false;
    }
}
