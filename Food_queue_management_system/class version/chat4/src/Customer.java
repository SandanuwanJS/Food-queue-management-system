import java.io.Serializable;

class Customer implements Serializable {
    private String firstName;
    private String lastName;
    private int burgersRequired;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public int getBurgersRequired() {
        return burgersRequired;
    }



    public Customer(String firstName, String lastName, int burgersRequired) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.burgersRequired = burgersRequired;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }


}