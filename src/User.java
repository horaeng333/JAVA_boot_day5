//이름 수정, 확인, 포인트 확인
public interface User {        //생성자 x.
    void setName(String name); //인터페이스는 public abstract 생략 가능.
    String getName();
    int getPoint();
}
