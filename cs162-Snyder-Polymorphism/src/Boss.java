import java.util.ArrayList;

public class Boss {
    private ArrayList<Employee> employees;
    private String name;

    public Boss() {
        this.name = "Dr.Boss";
        employees = new ArrayList<>();
    }

    public Boss(String bossName) {
        this.name = bossName;
        employees = new ArrayList<>();
    }


    public void addEmployee(Employee employee) {
        employees.add(employee);

    }

    public void printEmployees() {
        for(Employee i : employees) {
            System.out.println(i.getName() + " | salary: " + i.getBaseSalary());
        }
    }

    public void giveRaise(double raisePercent) {
        for(Employee i : employees) {
            i.setRaiseSalary((i.getBaseSalary() * (raisePercent/100)) + i.getBaseSalary());
        }
    }

    public void giveEngineersRaise(double raisePercent) {
        for(Employee i : employees) {
            if(i instanceof Engineer) {
                i.setRaiseSalary((i.getBaseSalary() * (raisePercent / 100)) + i.getBaseSalary());
            }
        }
    }
}
