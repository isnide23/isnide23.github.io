public class ProductManager extends Employee {

    public ProductManager() {

    }

    public int calcVacationDays() {
        if(super.getYearsAtCompany() >= 1 && super.getYearsAtCompany() < 2) {
            return 3;
        } else if (super.getYearsAtCompany() < 1) {
            return 0;
        } else {
            return 4;
        }
    }

    public int calcStock() {
        return (super.getYearsAtCompany() * 100);
    }

    public String toString(){
        return "Name: " + super.getName() + " Salary: " +  (super.getBaseSalary()*2) + " Motto: " + motto() + " Weeks of Vation: " +
                calcVacationDays() + " Stock: " + calcStock() ;
    }

    public String motto(){
        return "There is nothing so useless as doing efficiently that which should not be done at all.";
    }
}
