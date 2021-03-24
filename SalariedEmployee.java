package lab;

public class SalariedEmployee extends Employee implements IPayable{
    public int salary;

    @Override
    public int calculatePay(){
        return salary;
    }
}
