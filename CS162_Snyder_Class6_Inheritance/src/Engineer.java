public class Engineer extends Employee {

    public Engineer() {

    }

    public Engineer(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany) {
        super(name, baseSalary, yearsOfExperience, yearsAtCompany);
    }
    public double engineerSalary() {
        return super.getBaseSalary() * 1.5;
    }

    public int calcVactionDays() {
        if(super.getYearsAtCompany() >= 1 && super.getYearsAtCompany()< 3) {
            return 2;
        } else if(super.getYearsAtCompany() <=1 ) {
            return 0;
        } else {
            return 3;
        }
    }

    public int calcSignOnBonus() {
        if(super.getYearsOfExperience() < 5) {
            return 5000;
        } else {
            return 10000;
        }
    }

    public String motto() {
        return "To the optimist, the glass is half full.To the pessimist, the glass is half empty." +
                "To the engineer, the glass is twice as big as it needs to be.";
    }

    public String toString() {
        return "Name: " + super.getName() + " Salary " + engineerSalary() + " Motto " + motto() + " Weeks of Vacation: "
                + calcVactionDays() + " Sign on bonus: " + calcSignOnBonus();
    }
}
