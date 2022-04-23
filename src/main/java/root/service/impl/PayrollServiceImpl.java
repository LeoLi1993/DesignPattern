package root.service.impl;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.springframework.stereotype.Service;
import root.model.*;
import root.service.PayrollService;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.math.BigDecimal;
import java.util.*;

@Service
public class PayrollServiceImpl implements PayrollService
{

    private final static List<String> MANAGER_EMPLOYEE = Arrays.asList("Lisa");
    private final static List<String> HOURLY_EMPLOYEE = Arrays.asList("Alex", "Jack");
    private final static List<String> SALES_EMPLOYEE = Arrays.asList("Leo");

    @Override
    public Map<String, Double> getTotalAmount(HttpServletRequest request)
    {
        SAXReader saxReader = new SAXReader();
        Document document;
        try
        {
            saxReader.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            saxReader.setFeature("http://xml.org/sax/features/external-general-entities", false);
            saxReader.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            saxReader.setProperty("http://www.oracle.com/xml/jaxp/properties/maxElementDepth", 10);

            InputStream in = getValidInput(request.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
            document = saxReader.read(bufferedReader);
        }
        catch (Exception ex)
        {
            throw new RuntimeException(ex.getMessage());
        }
        Map<Integer, List<AbstractEmployee>> employeesMap = parseDocument(document);
        return calculateTotalSalary(employeesMap);
    }

    private InputStream getValidInput(InputStream inputStream) throws IOException
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try
        {
            byte[] buffer = new byte[1024];
            int len;
            int count = 0;
            while ((len = inputStream.read(buffer)) > -1)
            {
                baos.write(buffer, 0, len);
                count++;
            }
            baos.flush();
            return new ByteArrayInputStream(baos.toByteArray());
        }
        finally
        {
            baos.close();
            inputStream.close();
        }
    }

    private Map<Integer, List<AbstractEmployee>> parseDocument(Document document)
    {
        Map<Integer, List<AbstractEmployee>> employeesMap = new HashMap<>();
        Element root = document.getRootElement();
        List<Element> monthElements = root.elements();
        for (Element monthElement : monthElements)
        {
            Integer month = Integer.valueOf(monthElement.attributeValue("value"));
            List<AbstractEmployee> abstractEmployees = new ArrayList<>();
            List<Element> employeeElements = monthElement.elements();
            for (Element employeeElement : employeeElements)
            {
                AbstractEmployee abstractEmployee = new AbstractEmployee();
                String name = employeeElement.attributeValue("name");
                double workingHours = Double.parseDouble( null == employeeElement.attributeValue("workingHours") ? "0" : employeeElement.attributeValue("workingHours") );
                double salesAmount = Double.parseDouble( null == employeeElement.attributeValue("amount") ? "0" : employeeElement.attributeValue("amount") );
                abstractEmployee.setName(name);
                abstractEmployee.setWorkHours(workingHours);
                abstractEmployee.setSalesAmount(salesAmount);
                abstractEmployees.add(abstractEmployee);
            }
            employeesMap.put(month, abstractEmployees);
        }
        return employeesMap;
    }

    private Map<String, Double> calculateTotalSalary(Map<Integer, List<AbstractEmployee>> employeesMap)
    {
        Map<String, Double> totalSalaryMap = new HashMap<>();
        for (Integer key : employeesMap.keySet())
        {
            List<AbstractEmployee> employees = employeesMap.get(key);
            for (AbstractEmployee employee : employees)
            {
                if (HOURLY_EMPLOYEE.contains(employee.getName()))
                {

                    HourlyEmployee hourlyEmployee = new HourlyEmployee(40, employee.getWorkHours());
                    hourlyEmployee.setSalaryStrategy(new HourlyStrategy());
                    double salary = hourlyEmployee.calculateSalary();

                    if(totalSalaryMap.isEmpty() || !totalSalaryMap.containsKey(employee.getName()))
                    {
                        totalSalaryMap.put(employee.getName(), dataFormat(salary));
                    }
                    else
                    {
                        double totalSalary = totalSalaryMap.get(employee.getName()) + salary;
                        totalSalaryMap.put(employee.getName(), dataFormat(totalSalary));
                    }
                }
            }
        }
        return  totalSalaryMap;
    }
    
    /*private Map<String, Double> calculateTotalSalary(Map<Integer, List<AbstractEmployee>> employeesMap)
    {
        Map<String, Double> totalSalaryMap = new HashMap<>();
        for (Integer key : employeesMap.keySet())
        {
            List<AbstractEmployee> employees =  employeesMap.get(key);
            for (AbstractEmployee employee : employees)
            {
                if(MANAGER_EMPLOYEE.contains(employee.getName()))
                {
                    ManagerEmployee managerEmployee = new ManagerEmployee(60, employee.getWorkHours(), 10000);
                    double salary = managerEmployee.calculateSalary(managerEmployee);
                    if(totalSalaryMap.isEmpty() || !totalSalaryMap.containsKey(employee.getName()))
                    {
                        totalSalaryMap.put(employee.getName(), dataFormat(salary));
                    }
                    else
                    {
                        double totalSalary = totalSalaryMap.get(employee.getName()) + salary;
                        totalSalaryMap.put(employee.getName(), dataFormat(totalSalary));
                    }
                }
                if(HOURLY_EMPLOYEE.contains(employee.getName()))
                {
                    HourlyEmployee hourlyEmployee = new HourlyEmployee(employee.getWorkHours(), 40);
                    double salary = hourlyEmployee.calculateSalary(hourlyEmployee);
                    if(totalSalaryMap.isEmpty() || !totalSalaryMap.containsKey(employee.getName()))
                    {
                        totalSalaryMap.put(employee.getName(), dataFormat(salary));
                    }
                    else
                    {
                        double totalSalary = totalSalaryMap.get(employee.getName()) + salary;
                        totalSalaryMap.put(employee.getName(), dataFormat(totalSalary));
                    }
                }
                if(SALES_EMPLOYEE.contains(employee.getName()))
                {
                    SalesEmployee salesEmployee = new SalesEmployee(3000, employee.getSalesAmount());
                    double salary = salesEmployee.calculateSalary(salesEmployee);
                    if(totalSalaryMap.isEmpty() || !totalSalaryMap.containsKey(employee.getName()))
                    {
                        totalSalaryMap.put(employee.getName(), dataFormat(salary));
                    }
                    else
                    {
                        double totalSalary = totalSalaryMap.get(employee.getName()) + salary;
                        totalSalaryMap.put(employee.getName(), dataFormat(totalSalary));
                    }
                }
            }
        }
        return totalSalaryMap;
    }*/

    private double dataFormat(double salary)
    {
        BigDecimal bigDecimal = new BigDecimal(salary);
        return bigDecimal.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}


