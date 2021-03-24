package lab;

public class Employee extends Person{
    HireDate date = new HireDate();

    public void printBadge(){
        System.out.println("Name: " + name);
        System.out.println("Type of employee: " + this.getClass().getSimpleName());
        System.out.println("HireDate: " + date.getMonth() + "/" + date.getDate() + "/" + date.getYear() + "\n");
    }

}
