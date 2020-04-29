import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Boss b1 = new Boss("Dr.Evil");
        Employee wr1 = new TechnicalWriter("Jake", 30000, 3, 1);
        Employee eng1 = new Engineer("Jan", 30000, 2, 2);
        Employee pm1 = new ProductManager("Jojo", 30000, 8, 6 );

/**
 * adding Employee objects to the Boss's employee ArrayList
 */
        b1.addEmployee(wr1);
        b1.addEmployee(eng1);
        b1.addEmployee(pm1);

/**
 * prints all employees in the boss's employee ArrayList, gives them all
 * a 25 percent raise,
 * prints the list again
 * gives just the Engineers in the list a 100 percent raise
 * prints the employee list out once more
 */
        b1.printEmployees();
        b1.giveRaise(25);
        System.out.println();
        b1.printEmployees();
        b1.giveEngineersRaise(100);
        System.out.println();
        b1.printEmployees();



    }
}
