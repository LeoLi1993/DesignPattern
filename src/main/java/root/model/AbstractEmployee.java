package root.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class AbstractEmployee
{
    //Employee's name
    private String name;

    //时薪
    protected double hourlySalary;

    //工作时长
    protected double workHours;

    //Manager 全额工资
    protected double fullyTimeSalary;

    //Sales 基础工资
    protected double baseSalary;

    //销售量
    protected double salesAmount;

    //提成率
    protected double commissionRate;
}
