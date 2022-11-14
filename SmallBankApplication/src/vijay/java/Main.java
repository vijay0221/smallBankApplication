package vijay.java;

public class Main {

    public static void main(String[] args) {
        Bank sbi=new Bank("State Bank of Hyderabad");
        sbi.addBranch("hyderabad");
        sbi.addCustomer("hyderabad","vijay",478.0);
        sbi.addCustomerTransaction("hyderabad","vijay",56.00);
        sbi.addCustomer("hyderabad","siddarth",666.0);
        sbi.addCustomer("hyderabad","charan",66.0);

        sbi.addBranch("kamareddy");
        sbi.addCustomer("kamareddy","ajay",678.0);
        sbi.addCustomerTransaction("kamareddy","ajay",66.0);

        sbi.listCustomers("hyderabad",true);
        sbi.listCustomers("kamareddy",true);
    }
}
