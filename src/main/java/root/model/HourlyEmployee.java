package root.model;

public class HourlyEmployee extends AbstractEmployee
{
    private SalaryStrategy salaryStrategy;

    public HourlyEmployee(double hourlySalary, double workHours )
    {
        this.hourlySalary = hourlySalary;
        this.workHours = workHours;
    }

    public void setSalaryStrategy(SalaryStrategy salaryStrategy)
    {
        this.salaryStrategy = salaryStrategy;
    }

    public double calculateSalary()
    {
        return this.salaryStrategy.calculateSalary(this);
    }

}
