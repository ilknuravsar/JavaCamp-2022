public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.age=22;
        customer.firstName ="ilknur";
        customer.lastName ="avsar";
        System.out.println(customer.age);

        EmployeeManager eManager = new EmployeeManager();
        eManager.List();
        eManager.Delete();

        CustomerManager cManager = new CustomerManager();
        cManager.Add();
    }
}