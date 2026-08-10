public class Customer implements Cloneable {

    private String name;
    private String email;
    private String mobile;
    private final String customerId;

    private static int count = 100;

    public Customer(String name, String email, String mobile) {

        count++;

        customerId = "CUST" + count;

        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getCustomerId() {
        return customerId;
    }

    public static class Address {

        String line;
        String city;
        String pincode;

        public Address(String line, String city, String pincode) {
            this.line = line;
            this.city = city;
            this.pincode = pincode;
        }

        public String getLine() {
            return line;
        }

        public String getCity() {
            return city;
        }

        public String getPincode() {
            return pincode;
        }
    }

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Customer clone() {

        try {
            return (Customer) super.clone();
        } catch (Exception e) {
            return null;
        }
    }
}