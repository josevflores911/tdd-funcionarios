package services;

import model.Employee;

import java.math.BigDecimal;

public class CalculateSalary {

    public BigDecimal salaryCalculator(Employee employee){
        //if
        return employee.getSalary().multiply(BigDecimal.valueOf(0.7));
    }
}
