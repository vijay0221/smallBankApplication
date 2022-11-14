package vijay.java;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches=new ArrayList<Branch>();
    }
    public boolean addBranch(String name){
        Branch branch=findBranch(name);
        if(branch==null){
            this.branches.add(new Branch(name));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName,String name,double initialAmount){
        Branch branch =findBranch(branchName);
        if(branch!=null){
           return branch.addCustomer(name,initialAmount);
        }
        return false;

    }
    public boolean addCustomerTransaction(String branchName,String name,double amount){
        Branch branch =findBranch(branchName);
        if(branch!=null){
            return branch.addCustomerTransaction(name,amount);
        }
        return false;
    }
    public boolean listCustomers(String BranchName,boolean showTransactions){
        Branch branch=findBranch(BranchName);
        if(branch!=null){
            System.out.println("customer details for branch    "+branch.getName());
            ArrayList<Customer> branchCustomer=branch.getCustomers();
            for(int i=0;i<branchCustomer.size();i++){
                Customer customer=branchCustomer.get(i);
                System.out.println("Customer:"+customer.getName()+"["+i+"]");
                 if(showTransactions){
                     ArrayList<Double> transactions=customer.getTransactions();
                      for(int j=0;j<transactions.size();j++){
                          System.out.println("["+j+"]"+" Amount "+transactions.get(j));
                      }
                 }

            }
            return true;
        }
        return false;
    }
    private Branch findBranch(String name){
        for(int i=0;i<branches.size();i++){
            Branch branch=this.branches.get(i);
            if(branch.getName().equals(name)){
                return branch;
            }
        }
        return null;
    }

}
