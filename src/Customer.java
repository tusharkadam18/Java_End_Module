public class Customer extends Account {
    long adhaar;
    String name;
    String address;
    public Customer(String account_type, long account_no, int minimum_b, int current_b, long adhaar, String name, String address) {
        super(account_type, account_no, minimum_b, current_b);
        this.adhaar = adhaar;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "adhaar=" + adhaar +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                "}";
    }

    public void simple_interest(double rate, double time) throws NegativeBalanceException {
        int bal = current_b;
        double si;
        if(bal < minimum_b){
            throw new NegativeBalanceException("Negative Balance occurred");
        }
        else {
            si = (current_b * rate * time)/100;
            System.out.println("Simple Interest is: " + si);
            System.out.println("Total Amount is: " + (si+bal));
        }
    }
    public static void main(String[] args){
        Customer customer1 = new Customer("Savings", 56263566,10000,12000,562256324L,"Shiv", "Aple Ghar, Nanded");
        System.out.println("The Information of customer: ");
        System.out.println(customer1);
        try {
            customer1.simple_interest(12,2);
        } catch (NegativeBalanceException e) {
            throw new RuntimeException(e);
        }

        Customer customer2 = new Customer("Savings", 56263576,10000,15000,56225632L,"Deepak", "Apli galli, Kallam");
        System.out.println("The Information of customer: ");
        System.out.println(customer2);
        try {
            customer2.simple_interest(12,2);
        } catch (NegativeBalanceException e) {
            e.printStackTrace();
        }
    }
}
