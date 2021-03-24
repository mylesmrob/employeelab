package lab;

public class Entrepreneur extends Person implements IPayable{

    @Override
    public int calculatePay() {
        return 1000000;
    }
}
