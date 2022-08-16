package banking;

import java.util.ArrayList;

public class Bank {

    public String name;
    public ArrayList<Branch> branches;

    public Bank(String nameOfBranch) {
        this.name = nameOfBranch;
        this.branches = new ArrayList<>();
    }

    // Take another look
    public boolean addBranch(String branchName) {
        if (this.branches.contains(branchName)) {
            return true;
        } else {
            return false;
        }
    }

    // Take another look
    public boolean addCustomer(String branchName, String custName, double initialTransact) {
        if (this.branches.contains(custName)) {
            return true;
        }
        return false;
    }


    public boolean addCustomerTransaction(String branchName, String custName, double transaction) {
        if (this.branches.contains(transaction)) {
            return true;
        }
        return false;
    }

    public Branch findBranch(String branchName) {
        for (Branch branch : this.branches) {
            System.out.println(branch);
            return branch;
        }
        return null;
        
    }

    // listCustomers()

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");
        System.out.println(bank.branches);

    }



   
    
}
