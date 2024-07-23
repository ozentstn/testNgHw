package muhasebe;

public class EmployeeSalary {
    int monthSalary;
    int primMonthSalary;
    int prim = 1000;
    int workDay;
    int daySalary;
    int primAmount;

    public EmployeeSalary(int workDay, int monthSalary) {
        this.workDay=workDay;
        this.monthSalary=monthSalary;
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public int getPrimMonthSalary() {
        return primMonthSalary;
    }

    public void setPrimMonthSalary(int primMonthSalary) {
        this.primMonthSalary = primMonthSalary;
    }

    public int getPrim() {
        return prim;
    }

    public void setPrim(int prim) {
        this.prim = prim;
    }

    public  int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public int salaryCalculate(){
        daySalary = monthSalary / 25;
        primAmount = getWorkDay()>25 ? (getWorkDay()-25)*prim : 0;
        primMonthSalary = daySalary*workDay + primAmount;//monthSalary + primAmount;
        return primMonthSalary;
    }
}




