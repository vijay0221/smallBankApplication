package vijay.java;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers=new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public boolean addCustomer(String name,double initialAmount){
        Customer customer = findCustomer(name);
        if(customer==null){
            this.customers.add(new Customer(name,initialAmount));
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String name,double amount){
        Customer customer =findCustomer(name);
        if(customer!=null){
          customer.addTransactions(amount);
          return true;
        }
        return false;
    }

    private Customer findCustomer(String name) {
        for(int i=0;i<this.customers.size();i++){
            Customer check=this.customers.get(i);
            if(check.getName().equals(name)){
                return check;
            }
    }
        return null;
    }

}
