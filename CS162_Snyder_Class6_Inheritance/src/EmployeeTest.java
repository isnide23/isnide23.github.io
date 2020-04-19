import java.sql.SQLOutput;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee();
        TechnicalWriter t = new TechnicalWriter();
        Engineer g = new Engineer();
        ProductManager p = new ProductManager();

        p.setYearsAtCompany(4);

        g.setYearsAtCompany(2);
        g.setYearsOfExperience(4);

        System.out.println(e.toString());
        t.setYearsAtCompany(1);
        System.out.println(t.toString());
        System.out.println(g.toString());
        System.out.println(p.toString());
    }
}
