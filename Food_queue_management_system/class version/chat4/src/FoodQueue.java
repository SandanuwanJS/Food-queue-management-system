import java.util.ArrayList;
import java.util.List;

class FoodQueue {
    private List<Customer> customers;
    private int maxCapacity;
    public int burgernum;

    public FoodQueue(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.customers = new ArrayList<>(maxCapacity);
    }
    public int maxCapacity() {
        return maxCapacity;
    }

    public boolean isFull() {
        return customers.size() >= maxCapacity;
    }

    public boolean isEmpty() {
        return customers.isEmpty();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer removeCustomer(int index) {
            customers.remove(index);
        return null;
    }

    public Customer getCustomer(int index) {
            return customers.get(index);
    }

    public String sortCustomersAlphabetically(int a) {
        String m =customers.get(a).getFirstName();
        String n=customers.get(a).getLastName();
        String c= m+" "+n;
        return c;
    }

    public void updateBurgersInStock(int servedCustomers) {


        if (burgernum <= 10) {
            System.out.println("Warning: Low stock of burgers! Remaining stock: " + burgernum);
        }
    }

    public int getBurgersInStock(int a) {
        return customers.get(a).getBurgersRequired();
    }

    public int getQueueLength() {
        return customers.size();
    }



    public int getlength() {
        return getQueueLength();
    }



}