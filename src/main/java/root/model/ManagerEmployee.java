package root.model;


public class ManagerEmployee extends AbstractEmployee implements SalaryStrategy
{
    public ManagerEmployee(double hourlySalary, double workHours, double fullyTimeSalary)
    {
        this.hourlySalary = hourlySalary;
        this.workHours = workHours;
        this.fullyTimeSalary = fullyTimeSalary;
    }

    @Override
    public double calculateSalary(AbstractEmployee abstractEmployee)
    {
        double salary = 0;
        if(abstractEmployee.getWorkHours() < 150)
        {
            salary = this.workHours * this.hourlySalary;
        }
        if(abstractEmployee.getWorkHours() >= 150 && abstractEmployee.getWorkHours() <= 160)
        {
            salary = this.fullyTimeSalary;
        }
        if(abstractEmployee.getWorkHours() > 160)
        {
            salary =  this.fullyTimeSalary + (this.workHours - 160) * 1.3;
        }
        return salary;
    }
}
