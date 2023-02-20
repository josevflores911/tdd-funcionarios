import model.Employee;
import model.Position;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import services.CalculateSalary;

import java.math.BigDecimal;



public class CalculateSalaryTest {
    @Test
    void mustCalculateSalaryPerEmployee(){
        Employee employee1 = new Employee("a2e4gs","Antonio",20L, Position.MANAGER,new BigDecimal(20000));
        BigDecimal newSalary = new CalculateSalary().salaryCalculator(employee1);
        //assertNotNull(newSalary);
    }

}
