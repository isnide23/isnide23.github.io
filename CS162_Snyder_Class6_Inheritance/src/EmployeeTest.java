import java.sql.SQLOutput;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee("Frank", 6, 6);
        TechnicalWriter t = new TechnicalWriter("Gary",  2, 0);
        ProductManager p = new ProductManager("Sally", 8, 8 );
        Engineer g = new Engineer("Jacob",  12, 10);


        System.out.println(e.toString());
        System.out.println(t.toString());
        System.out.println(p.toString());
        System.out.println(g.toString());
    }
}
