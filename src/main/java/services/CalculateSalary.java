package services;

import model.Funcionario;

import java.math.BigDecimal;

public class CalculateSalary {

    public BigDecimal salaryCalculator(Funcionario funcionario){
        //if
        return funcionario.getSalary().multiply(BigDecimal.valueOf(0.7));
    }
}
