package main.entity;

public class Customer {
    private String membershipNum;
    private String firstName;
    private String surname;
    private String email;
    private String mobileNum;
    private int stamps;



    public String getMembershipNum() {
        return membershipNum;
    }

    public void setMembershipNum() {

        String time = Long.toString(System.currentTimeMillis());
        this.membershipNum = time.substring(3, 11);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public int getStamps() {
        return stamps;
    }

    public void setStamps(int stamps) {
        this.stamps = stamps;
    }

//    public static void main(String[] args) {
//        Customer customer = new Customer();
//        customer.setMembershipNum();
//        System.out.println(customer.getMembershipNum());
//    }
}

