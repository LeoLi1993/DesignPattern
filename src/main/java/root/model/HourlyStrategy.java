package root.model;

public class HourlyStrategy implements SalaryStrategy
{

    @Override
    public double calculateSalary(AbstractEmployee abstractEmployee)
    {
        double salary = 0;
        if(abstractEmployee.getWorkHours() > 160)
        {
            salary = 160 * abstractEmployee.getHourlySalary() + (abstractEmployee.getWorkHours() - 160) * abstractEmployee.getHourlySalary() * 1.3;
        }
        else
        {
            salary = abstractEmployee.getHourlySalary()* abstractEmployee.getHourlySalary();
        }
        return salary;
    }
}
