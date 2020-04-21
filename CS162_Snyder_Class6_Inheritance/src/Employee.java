/**
 * Employee.java - Employee Benefits Management
 * @author Ian Snyder
 * @version 1
 */
public class Employee {
    private String name;
    private double baseSalary;
    private int yearsOfExperience;
    private int yearsAtCompany;
    private int vacationDaysInWeeks;


    /**
     * Parameterless constructor
     */
    public Employee(){
        // default values
        this.name = "J Doe";
        this.baseSalary = 30000;
        this.yearsOfExperience = 0;
        this.yearsAtCompany = 0;
        this.vacationDaysInWeeks = 1;
    }

    /**
     * Parameterlconstructor
     *@param name of type String
     *@param baseSalary of type double
     *@param yearsOfExperience of type int
     *@param yearsAtCompany of type int
     */
    public Employee(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.yearsOfExperience = yearsOfExperience;
        this.yearsAtCompany = yearsAtCompany;
    }

    /**
     *
     * @return name
     */

   public String getName() {
        return name;
    }

    /**
     *
     * @return baseSalary
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    public int getYearsAtCompany() {
        return yearsAtCompany;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public int getVacationDaysInWeeks() {
        return vacationDaysInWeeks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setYearsAtCompany(int yearsAtCompany) {
        this.yearsAtCompany = yearsAtCompany;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    /**
     * Returns the employees name, salary and motto
     * @return A value of data type String
     */
    public String toString(){
        //TODO
        return "Name: " + name + " Salary: " + baseSalary + " Motto: " + motto();
    }
    /**
     * Returns a generic employee motto
     * @return A value of data type String
     */
    public String motto(){
        return "We value our employees";
    }
}