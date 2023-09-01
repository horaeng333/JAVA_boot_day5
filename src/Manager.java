public class Manager extends ID{
    private String department;

    public Manager() {}
    public Manager(String id, String pw, String department) {
        super(id, pw);
        setDepartment(department);
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public String getDepartment(String department) {
        return department;
    }
    public String toString() {
        return super.toString()+", department="+ department;
    }
}
