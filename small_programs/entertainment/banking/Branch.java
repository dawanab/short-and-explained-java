package banking;

import java.util.ArrayList;

public class Branch {
    String name;
    ArrayList<Customer> customers;

    public  Branch(String branchName) {
        this.name = branchName;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String custName, double transaction) {
        if (this.customers.contains(custName)) {
            return true;
        }
        return false;
    }

    





}
