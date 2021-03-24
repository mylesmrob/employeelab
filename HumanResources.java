package lab;

import java.util.ArrayList;
import java.util.Collections;

public class HumanResources {

    public static void issueBadge(ArrayList<Employee> employees){
        for(Employee e : employees){
            e.printBadge();
        }
    }

    public static void printPaymentInfo(IPayable payable){
        System.out.println("Pay for " + payable.getClass().getSimpleName() + ": " + payable.calculatePay() + "\n");
    }

    public static void payPerson(ArrayList<IPayable> payable){
        for(IPayable p : payable){
            System.out.println("Pay for " + p.getClass().getSimpleName() + ": " + p.calculatePay());
        }
        System.out.print("\n");
    }

    /*public static void sortPeopleByIncome(ArrayList<IPayable> payable){
        Collections.sort(payable.get().calculatePay(), Collections.reverseOrder());
        for(IPayable p : payable){
            System.out.println("Pay for " + p.getClass().getSimpleName() + ": " + p.calculatePay());
        }
    }*/
}
