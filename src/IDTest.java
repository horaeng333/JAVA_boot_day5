public class IDTest {
    public static void main(String[] args) {
        ID[] list = new ID[2];

        list[0]= new ID("jamin", "j0316");
        list[1]= new Manager("chodu", "c0921", "ad");

        for(ID emp : list) {
            System.out.println(emp);
        }
    }
}
