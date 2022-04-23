package root.model;

public class SalesEmployee extends AbstractEmployee implements SalaryStrategy
{
    public SalesEmployee(double baseSalary, double salesAmount)
    {
        this.baseSalary = baseSalary;
        this.salesAmount = salesAmount;
    }

    @Override
    public double calculateSalary(AbstractEmployee abstractEmployee)
    {
        double salary = 0;
        if(abstractEmployee.getSalesAmount() <= 20000)
        {
            salary = baseSalary;
        }
        if(abstractEmployee.getSalesAmount() >= 20000 && abstractEmployee.getSalesAmount() <= 30000)
        {
            salary = this.baseSalary + 0.05 * (this.salesAmount - 20000);
        }
        if(abstractEmployee.getSalesAmount() > 30000)
        {
            salary = this.baseSalary + 0.08 * (this.salesAmount - 20000);
        }
        return salary;
    }
}
