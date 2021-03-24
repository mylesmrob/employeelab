package lab;

public class HourlyEmployee extends Employee implements IPayable{
    public int hourlyRate;
    public int hoursWorked;

    @Override
    public int calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
