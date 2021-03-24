package lab;

import java.util.ArrayList;

public class CheckCashingPlace {

    public static void main(String[] args) {
        ArrayList<IPayable> payable = new ArrayList<>(); //ArrayList for all payable

        Entrepreneur max = new Entrepreneur(); //Create Entrepreneur
        max.name = "Max";
        payable.add(max);

        ArrayList<Employee> employees = new ArrayList<>(); //Arraylist for all employees

        SalariedEmployee bob = new SalariedEmployee(); //Create SalariedEmployee
        bob.name = "Bob";
        bob.date.setMonth("12");
        bob.date.setDay("31");
        bob.date.setYear("1999");
        bob.salary = 300;
        payable.add(bob);
        employees.add(bob);

        HourlyEmployee alex = new HourlyEmployee(); //Create HourlyEmployee
        alex.name = "Alex";
        alex.date.setMonth("1");
        alex.date.setDay("1");
        alex.date.setYear("2000");
        alex.hoursWorked = 20;
        alex.hourlyRate = 12;
        payable.add(alex);
        employees.add(alex);

        HumanResources.printPaymentInfo(bob); //Instance of HumanResources (printPaymentInfo)
        HumanResources.issueBadge(employees); //Call issueBadge

        //System.out.println("Prior to sorting by pay..."); //Before sort
        HumanResources.payPerson(payable); //Call PayPerson

        /*ArrayList<IPayable> unSortedPeople = new ArrayList<>(); //Unsorted ArrayList
        unSortedPeople.add(max);
        unSortedPeople.add(bob);
        unSortedPeople.add(alex);

        System.out.println("After sorting by pay..."); //After sort
        HumanResources.sortPeopleByIncome(unSortedPeople);*/
    }
}
