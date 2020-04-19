public class TechnicalWriter extends Employee {

    public TechnicalWriter() {

    }

    public int calcVacationDays() {
        if (getYearsAtCompany() >= 1) {
            return 1;
        } else if (getYearsAtCompany() <= 1) {
            return 0;
        }
        else {
            return 2;
        }
    }

    public String motto() {
        return "You can always edit a bad page. You can’t edit a blank page.";
    }

    public String toString() {
        return super.toString() + " Weeks of Vacation: " + calcVacationDays();
    }
}
