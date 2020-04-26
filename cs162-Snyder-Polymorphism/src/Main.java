import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /**TechnicalWriter technicalWriter = new TechnicalWriter("Mark", 50000, 4, 2);
        System.out.println(technicalWriter.toString());
        System.out.println();
        Engineer engineer = new Engineer("Natashia", 50000, 7, 2);
        System.out.println(engineer.toString());
        System.out.println();
        ProductManager productManager = new ProductManager("Carlos", 50000, 8, 5);
        System.out.println(productManager.toString());
        System.out.println();
         */

        Employee wr1 = new TechnicalWriter("Jake", 30000, 3, 1);
        Employee eng1 = new Engineer("Jan", 30000, 2, 2);
        Employee pm1 = new ProductManager("Jojo", 30000, 8, 6 );

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(wr1);
        employees.add(eng1);
        employees.add(pm1);

        for (Employee i : employees) {
            System.out.println(i);
        }
    }
}
